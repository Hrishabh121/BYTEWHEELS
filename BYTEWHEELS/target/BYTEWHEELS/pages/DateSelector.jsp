<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
<title>BYTEWHEELS</title>
</head>
<body>
	<h2>${msg}</h2>

	<h3>Select Date Range to Rent Car</h3>
	
	<br>
	<form:errors path="selector.*"/>
	<br>
	
	<form action="/BYTEWHEELS/ListOfCars.html" method="post">
		<div align="center" style="border: thick;" class="container">
		<table class="table table-hover">

			<tr>
				<td>Select Start Date :</td>
				<td><input type="text" name="startdate"
					placeholder="dd/mm/yyyy" value="30/03/2018"/></td>
			</tr>
			<tr>
				<td>Select End Date :</td>
				<td><input type="text" name="enddate" 
					placeholder="dd/mm/yyyy" value="04/04/2018"/></td>
			</tr>
			<tr>
				<td>Select Type of cars :</td>
				<td><select name="type">
						<option value="All">All Cars</option>
						<option value="Compact">Compact</option>
						<option value="Full">Full</option>
						<option value="Large">Large</option>
						<option value="Luxury">Luxury</option>
					</select>
				</td>
			</tr>
			
		</table>
		<br>
		<input type="submit" value="Submit" >
		</div>
	</form>
</body>
</html>