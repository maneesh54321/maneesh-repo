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
	<section style="background-color:green;">
		<a href="resources/main.html">Goto Main Page</a>
		<button data-ng-click="gotoController()">Click Me</button>
		<p>{{responseData}}</p>
	</section>
	<footer style="background-color: red">
		<h3>My Website's Footer</h3>
	</footer>
</html>