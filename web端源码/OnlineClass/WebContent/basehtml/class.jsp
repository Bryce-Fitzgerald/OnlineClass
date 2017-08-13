<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="css/class.css" />
<link rel="stylesheet" type="text/css" href="css/page01.css" />
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="head"></div>
		<div class="Menu">
			<ul class="list">
				<li><a href="">首页</a></li>
				<li><a href="">我的课程</a></li>
				<li><a href="">在线讨论</a></li>
				<li><a href="">测试</a></li>
				<li><a href="">协助丰富课程</a></li>
			</ul>
		</div>
		<div class="Middle">
			<video class="video" width="950" height="450" controls="controls">
			<source src="movie.mp4" type="video/mp4" /> <source src="movie.ogg"
				type="video/ogg" /> <source src="movie.webm" type="video/webm" />
			<object data="movie.mp4" width="320" height="240">
				<embed src="movie.swf" width="320" height="240" />
			</object> </video>
			<ul class="jie">
				<li id="select">文档</li>
				<li>问答</li>
				<li>测试</li>
			</ul>
		</div>
		<div class="footer"></div>
	</div>


</body>
</html>
