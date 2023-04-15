<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	<style>
		#create{
			display:inline-block;
			position:absolute;
			top:73px;
			right:128px;
		}
	</style>
<title>Ticket Tracker Application</title>
</head>
<body bgcolor="#eee">
<div class="container">
	<h3>Ticket Directory</h3>
		<hr>
	<div class="form-inline">
		<form action="/ticket/search">
			<input type="text" name="title" value="${ticket.title }">
			<button type="submit" class="btn btn-info">Search</button>
		</form>	
		<a href="/ticket/showFormForAdd" class="btn btn-info btn-sm" id="create">Create Ticket</a>
	</div>
	<table class="table table-bordered table-striped">
		<tr class="thead-dark" text-align="center">
			<th>#</th>
			<th>Title</th>
			<th>Description</th>
			<th>Date</th>
			<th colspan="3">Action</th>
		</tr>
		<c:forEach items="${tickets }" var="list">
	
		<tr>
			<td>${list.id }</td>
			<td>${list.title }</td>
			<td>${list.ticketDescription }</td>
			<td>${list.ticketCreatedDate }</td>
			<td>
				<a href="/ticket/showFormForUpdate?id=${list.id}" 
				class="btn btn-info btn-sm">Edit</a>
			</td>
			<td>
				<a href="/ticket/list" 
				class="btn btn-info btn-sm">View</a>
			</td>
			<td>
				<a href="/ticket/delete?id=${list.id}" 
				class="btn btn-info btn-sm">Delete</a>
			</td>
		</tr>
		</c:forEach>
		</table>
</div>
</body>
</html>