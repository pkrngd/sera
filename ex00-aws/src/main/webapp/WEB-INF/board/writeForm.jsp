<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div>
    <form id="writeForm" name="writeForm" method="post">
        <div>
            <h2>스크랩</h2>
            <div>
                <table>
                    <tr>
                        <th>제목</th>
                        <td><input style="width: 500px" type="text" id="title" name="title" /></td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea style="width: 500px" rows="10" cols="10" id="content" name="content"></textarea></td>
                    </tr>
                    <tr>
                        <th>URL</th>
                        <td><input style="width: 500px" type="text" id="url" name="url" /></td>
                    </tr>
                </table>
                <div>
                    <a href='#' onClick='fn_addtoBoard()' class="btn btn-success" >스크랩</a>
                    <a href='#' onClick='fn_cancel()' 	  class="btn btn-success" >목록</a>
                </div>
            </div>	
        </div>
    </form>
<script>
//글쓰기
function fn_addtoBoard(){
    
    var form = document.getElementById("writeForm");
    
    form.action = "<c:url value='/write'/>";
    form.submit();
    
}
 
//목록
function fn_cancel(){
    
    var form = document.getElementById("writeForm");
    
    form.action = "<c:url value='/'/>";
    form.submit();
    
}
</script>
</div>
</body>
</html>
