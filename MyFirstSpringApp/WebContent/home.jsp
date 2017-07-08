<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My WebSite</title>
<script src="js/angular.min.js"></script>
<script src="js/home.js"></script>
</head>
<body data-ng-app="myFirstSpringApp"
	data-ng-controller="homePageController as Ctrl">
	<header style="background-color: red">
		<h3>My Website's Header</h3>
	</header>
	<section style="background-color: green;">
		<a href="WEB-INF/viewsMain.html">Goto Main Page</a>
	</section>
	<footer style="background-color: red">
		<h3>My Website's Footer</h3>
	</footer>
</body>
</html>