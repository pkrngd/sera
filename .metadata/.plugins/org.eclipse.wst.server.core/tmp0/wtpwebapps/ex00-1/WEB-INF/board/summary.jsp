<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<script src="vendor/bootstrap/js/d3.v3.js"></script>
<script src="vendor/bootstrap/js/ldavis.js"></script>

<link rel="stylesheet" href="vendor/bootstrap/css/lda.css">

<title>4조 사이트</title>

<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
   <script type="text/javascript">
      google.charts.load('current', {'packages':['gauge']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
	
    	var locate= ${location}*100;
        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['(단위 : %)', locate],
        ]);

        var options = {
          width: 300, height: 300,
          minorTicks: 5
        };

        var chart = new google.visualization.Gauge(document.getElementById('chart_div'));

        chart.draw(data, options);

      }

    </script>




<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
    	  
    	var pos= ${positive};
    	var neg= ${negative};

        var data = google.visualization.arrayToDataTable([
          ['Task', '긍정, 부정 비율'],
          ['Positive',  pos  ],
     	  ['Negative',  neg  ]
        ]);

        var options = {
          title: '기사 본문 긍정적/부정적 비율 분석'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>


<script type="text/javascript">
   

      google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawStacked);

function drawStacked() {

	  var Rval = ${Rvalue}*100;

      var data = google.visualization.arrayToDataTable([
        ['City',  '낚시가 아닐 확률', '낚시일 확률'],
        ['Article', 100 - Rval,  Rval],
      ]);

      var options = {
        title: '낚시성 기사',
        chartArea: {width: '50%'},
        isStacked: true,
        hAxis: {
          title: '(단위 : %)',
          minValue: 0,
        },
        vAxis: {
          title: ''
        }
      };


      var chart = new google.visualization.BarChart(document.getElementById('barchart'));
      chart.draw(data, options);
    }


    </script>

</head>

<body id="page-top">

	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

		<a class="navbar-brand mr-1" href="/web/">4조
			사이트</a>

		<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Navbar Search -->
		<form
			class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="Search for..."
					aria-label="Search" aria-describedby="basic-addon2">
				<div class="input-group-append">
					<button class="btn btn-primary" type="button">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>
		</form>

		<!-- Navbar -->
		<ul class="navbar-nav ml-auto ml-md-0">
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <span
					class="badge badge-danger">9+</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="alertsDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item dropdown no-arrow mx-1"><a
				class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i> <span
					class="badge badge-danger">7</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="messagesDropdown">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Something else here</a>
				</div></li>
			<li class="nav-item dropdown no-arrow"><a
				class="nav-link dropdown-toggle" href="#" id="userDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> <i class="fas fa-user-circle fa-fw"></i>
			</a>
				<div class="dropdown-menu dropdown-menu-right"
					aria-labelledby="userDropdown">
					<a class="dropdown-item" href="#">Settings</a> <a
						class="dropdown-item" href="#">Activity Log</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#" data-toggle="modal"
						data-target="#logoutModal">Logout</a>
				</div></li>
		</ul>

	</nav>

	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item active"><a class="nav-link"
				href="/web/"> <i
					class="fas fa-fw fa-tachometer-alt"></i> <span>나만의 게시판</span>
			</a></li>
			
		
			<li class="nav-item dropdown"><a class="nav-link" href="/web/">
					<i class="fas fa-fw fa-chart-area"></i> <span>URL 기사 분석</span>
			</a></li>	
			<li class="nav-item"><a class="nav-link" href="/web/5_analysis">
					<i class="fas fa-fw fa-chart-area"></i> <span>18년 5월 토픽 키워드</span>
			</a></li>
				<li class="nav-item"><a class="nav-link" href="/web/6_analysis">
					<i class="fas fa-fw fa-chart-area"></i> <span>18년 6월 토픽 키워드</span>
			</a></li>
				<li class="nav-item"><a class="nav-link" href="/web/7_analysis">
					<i class="fas fa-fw fa-chart-area"></i> <span>18년 7월 토픽 키워드</span>
			</a></li>
			
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">

				<!-- 나만의 스크랩 Example-->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-chart-area"></i> 나만의 스크랩
					</div>

					<div class="card-body">

						<form id="writeForm" name="writeForm" method="post">
							<div>
								<div>
									<table>
										<tr>
											<th>제목</th>
											<td><input style="width: 500px" type="text" id="title"
												name="title" value="${title}" /></td>
										</tr>
										<tr>
											<th>내용</th>
											<td><textarea style="width: 500px" rows="10" cols="10"
													id="content" name="content">
                        ${content}
                        </textarea></td>
										</tr>
										<tr>
											<th>URL</th>
											<td><input style="width: 500px" type="text" id="url"
												name="url" value="${url}" /></td>
										</tr>
									</table>
									<div>
										  <a href='#' onClick='fn_addtoBoard()' class="btn btn-success" >스크랩</a>
                  						  <a href='#' onClick='fn_cancel()' 	  class="btn btn-success" >목록</a>
									</div>
								</div>
							</div>
						</form>

					</div>
					<div class="card-footer small text-muted"></div>
				</div>
				

				
				<!--낚시 가능성  Example-->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-chart-area"></i> 낚시 가능성 분석
					</div>
					<div class="card-body">
					   <div id="barchart" style="width: 800px; height: 400px;"></div>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
				
				<!--제목본문 유사도 Example-->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-chart-area"></i> 제목·본문 유사도
					</div>
					<div class="card-body">
					<div id="chart_div" style="width: 400px; height: 400px;"></div>	
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
				
				
				<!-- 감정 분석-->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-chart-area"></i> 감정 분석
					</div>
					<div class="card-body">
						<div id="piechart" style="width: 900px; height: 500px;"></div>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>

				<!-- word cloud Example-->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-chart-area"></i> Word Cloud
					</div>
					<div class="card-body">
						    <img src = "img/${path}" height=400, width=600/>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
		



			</div>
			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright Â© Your Website 2018</span>
					</div>
				</div>
			</footer>

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">Ã</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Page level plugin JavaScript-->
	<script src="vendor/chart.js/Chart.min.js"></script>
	<script src="vendor/datatables/jquery.dataTables.js"></script>
	<script src="vendor/datatables/dataTables.bootstrap4.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin.min.js"></script>

	<!-- Demo scripts for this page-->
	<script src="js/demo/datatables-demo.js"></script>
	<script src="js/demo/chart-area-demo.js"></script>


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
</body>
</html>
