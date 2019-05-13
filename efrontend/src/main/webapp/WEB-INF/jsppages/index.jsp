<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="author" content="Gowsigan">
<meta name="viewport" content="width=device=width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>	
</script>
<title>EPROJECT</title>
<style>
.container-fluid {
background-color:grey;
}
</style>
</head>
<body class="bg">

<div class="container-fluid">
<center><h3>ESHOPPING</h3></center>
</div>

<div class="container"><br>
<head>
<%@ include file="Header.jsp"%>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
</body>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
<!-- Indicators -->
<ol class="carousel-indicators">
<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
<li data-target="#myCarousel" data-slide-to="1"></li>
<li data-target="#myCarousel" data-slide-to="2"></li>
</ol>

<!-- Wrapper for slides -->
<div class="carousel-inner">
<div class="item active">
<img src="<c:url value="/resources/images/eshopping.jpg"/>" style="width: 100%;height: 100%">
</div>

<div class="item">
<img src="<c:url value="/resources/images/eshopping2.jpg"/>" style="width: 100%;height: 100%">
</div>

<div class="item">
<img src="<c:url value="/resources/images/eshopping3.jpg"/>" style="width: 100%;height: 100%">
</div>
</div>

<!-- Left and right controls -->
<a class="left carousel-control" href="#myCarousel" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left"></span>
<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#myCarousel" data-slide="next">
<span class="glyphicon glyphicon-chevron-right"></span>
<span class="sr-only">Next</span>
</a>
</div>
</body>

</html>

