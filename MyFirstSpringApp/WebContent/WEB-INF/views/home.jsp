<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My WebSite</title>
<script src="resources/js/angular.min.js"></script>
<script src="resources/js/home.js"></script>
</head>
<body data-ng-app="myFirstSpringApp" data-ng-controller="homePageController as Ctrl">
	<header style="background-color: red">
		<h3>My Website's Header</h3>
	</header>
	<section style="background-color:blue">
		<p>{{data}}</p>
	</section>
	<section style="background-color:blue">
		<a href="resources/main.html">Goto Main Page</a>
	</section>
	<footer style="background-color: red">
		<h3>My Website's Footer</h3>
	</footer>
</html>