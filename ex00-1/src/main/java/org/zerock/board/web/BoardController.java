package org.zerock.board.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.rosuda.JRI.Rengine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.zerock.board.service.BoardVO;
import org.zerock.board.service.impl.BoardService;
import org.zerock.board.service.impl.HttpClient1;
import org.zerock.board.service.impl.NewsObj;

//@ResponseBody

@Controller
public class BoardController {
	
	
	@Autowired
	private BoardService boardServiceImpl;

	@RequestMapping("/")
	public String main(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception {

		List<BoardVO> list = boardServiceImpl.selectBoardList(boardVO);

		model.addAttribute("list", list);

		return "board/index";
	}

	/**
	 * 게시판 조회
	 * 
	 * @param boardVO
	 * @param model
	 * @return
	 * @throws Exception
	 */

	/**
	 * 글쓰기 폼
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/writeForm")
	public String writeBoardForm() throws Exception {

		return "board/writeForm";
	}

	/**
	 * 게시글 등록
	 * 
	 * @param boardVO
	 * @param model
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value ="/write")
	public String write(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception {

		boardServiceImpl.insertBoard(boardVO);

		return "redirect:/";
	}

	@RequestMapping(value = "/delete")
	public String delete(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception {

		boardServiceImpl.deleteBoard(boardVO);

		return "redirect:/";
	}

	/**
	 * 게시글 조회
	 * 
	 * @param boardVO
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/viewContent")
	public String viewForm(@ModelAttribute("boardVO") BoardVO boardVO, Model model, HttpServletRequest request)
			throws Exception {

		int code = Integer.parseInt(request.getParameter("code"));
		boardVO.setCode(code);

		BoardVO resultVO = boardServiceImpl.selectBoardByCode(boardVO);

		model.addAttribute("result", resultVO);

		return "board/viewForm";
	}

	/**
	 * 게시글 수정
	 * 
	 * @param boardVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateboard")
	public String updateBoard(@ModelAttribute("boardVO") BoardVO boardVO, Model model) throws Exception {

		try {

			boardServiceImpl.updateBoard(boardVO);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/";

	}

	/*
	 * URL 입출력
	 */

	@RequestMapping(value ="summary", method = RequestMethod.GET)
	public String summary(String name, Model model) {

		// 전달할 인자 값 정의 (문자열로 정의)
		String a = name;
		System.out.println(a);
		
		HttpClient1 client = new HttpClient1();
		NewsObj nObj = client.getFlask(a);
		
		System.out.println(nObj.getUrl());
		System.out.println(nObj.getTitle());
		System.out.println(nObj.getContent());
		System.out.println(nObj.getKeywords());
		System.out.println(nObj.getSimilarity());
		System.out.println(nObj.getLocation());
		System.out.println(nObj.getPositive());
		System.out.println(nObj.getNegative());
		System.out.println(nObj.getPath());
		
		double Rvalue = client.getRcode(a);
		System.out.println("R result : " + Rvalue);
		
		model.addAttribute("url", nObj.getUrl());
		model.addAttribute("title", nObj.getTitle());
		model.addAttribute("content", nObj.getContent());
		model.addAttribute("keywords", nObj.getKeywords());
		model.addAttribute("similarity", nObj.getSimilarity());
		model.addAttribute("location", nObj.getLocation());
		model.addAttribute("positive", nObj.getPositive());
		model.addAttribute("negative", nObj.getNegative());
		model.addAttribute("path", nObj.getPath());
		model.addAttribute("Rvalue", Rvalue);
		
		client = null;
		
		return "board/summary";
	}
	
	
	
	@RequestMapping("/abc")
	@ResponseBody
	public String webHdfs() throws IOException {
    	RestTemplate restTemplate = new RestTemplate();
    	//String string = restTemplate.getForObject("http://192.168.0.185:50070/webhdfs/v1/user/hadoop/read_txt.txt" + 
    	//		"?op=OPEN", String.class);
    	
    	String string = restTemplate.getForObject("http://master:50070/webhdfs/v1/hoyoung/result_7/index.html" + 
    		"?op=OPEN", String.class);
    	
    	return string;
	}
	
	
	@RequestMapping("/5_analysis")
	@ResponseBody
	public String analysis5() {
		RestTemplate restTemplate = new RestTemplate();
		String string = restTemplate.getForObject("http://master:50070/webhdfs/v1/hoyoung/result_5/5_analysis.html" + 
	    		"?op=OPEN", String.class);
		return string;
	}
	
	@RequestMapping("/6_analysis")
	@ResponseBody
	public String analysis6() {
		RestTemplate restTemplate = new RestTemplate();
		String string = restTemplate.getForObject("http://master:50070/webhdfs/v1/hoyoung/result_6/6_analysis.html" + 
	    		"?op=OPEN", String.class);
		return string;
	}
	
	@RequestMapping("/7_analysis")
	@ResponseBody
	public String analysis7() {
		RestTemplate restTemplate = new RestTemplate();
		String string = restTemplate.getForObject("http://master:50070/webhdfs/v1/hoyoung/result_7/7_analysis.html" + 
	    		"?op=OPEN", String.class);
		return string;
	}
	
	
}