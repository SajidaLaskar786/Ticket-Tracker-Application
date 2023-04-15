<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	<style>
		body{
			background-color:#eee;	
		}
		p{
			padding-top:7px;
		}
		button{
			margin-top:7px;
		}
		
	
	</style>
	
<title>Ticket Form</title>
</head>
<body>

	<div class="container">
		<h3>Ticket Directory</h3>
			<hr>
	
		<form method="POST" action="/ticket/save">
	
	
		<input type="hidden" name="id" value="${ticket.id }">
		
		<div><p><b>Title</b></p></div>
		<div  class="form-inline">
			<input type="text" name="title" value="${ticket.title }" placeholder="Enter Ticket Title">
		</div>
		
		<div><p><b>Short Description</b></p></div>
		<div  class="form-inline">
			<input type="text" name="ticketDescription" value="${ticket.ticketDescription }" placeholder="Enter Ticket Description">
		</div>
		
		<div><p><b>Date</b></p></div>
		<div  class="form-inline">
			<input type="text" name="ticketCreatedDate" value="${ticket.ticketCreatedDate }" placeholder="Enter Ticket Date">
		</div>
		
		<button type="submit" class="btn btn-info">Save</button>
		</form>
		<hr>
		<a href="/tickt/list" class="btn btn-info btn-sm">Go Back to Ticket List</a>
	</div>
</body>
</html>