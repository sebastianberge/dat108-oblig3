<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Deltakerliste</title>
</head>
<body>
	<h2>Deltakerliste</h2>
	<table class="pure-table">
		<c:forEach items="${deltakerliste}" var="deltaker">
    		<tr>      
        		<td>${deltaker.kjonn}</td>
        		<td>${deltaker.navn}</td>
        		<td>${deltaker.mobil}</td>
 
    		</tr>
		</c:forEach>
	</table>
	<p>
		<a href="loggut">Ferdig</a>
	</p>
</body>
</html>