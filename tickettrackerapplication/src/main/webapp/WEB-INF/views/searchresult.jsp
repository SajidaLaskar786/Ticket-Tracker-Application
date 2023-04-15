<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Search Result</title>
</head>
<body bgcolor="#eee">
	<div class="container">
		<h3>Ticket Directory</h3>
			<hr>
		<table class="table table-bordered table-striped">
			<tr class="thead-dark">
				<th>#</th>
				<th>Title</th>
				<th>Description</th>
				<th>Date</th>
			</tr>
			<tr>
				<td>${ticket.id}</td>
				<td>${ticket.title}</td>
				<td>${ticket.ticketDescription}</td>
				<td>${ticket.ticketCreatedDate}</td>
			
			</tr>
		</table>
		<hr>
		<a href="/ticket/list" class="btn btn-info btn-sm">Go Back to Ticket List</a>
	</div>
	
</body>
</html>