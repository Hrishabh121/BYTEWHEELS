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
<div align="center"><h2>${msg}</h2>
	<hr>
	<h4>Invoice of Your Ride</h4>
	</div>
	
	<div align="center" style="border: thick;" class="container">
	
		<table cellspacing="7" class="table table-hover">
			<tr>
				<td><h4>Check Booking Details</h4></td>
				<td><h4><a href="/BYTEWHEELS/DateSelector.html">Book Again</a></h4></td>
			</tr>
			
		</table>

		<table border="1" cellspacing="2" cellpadding="5" class="table table-hover">
			<tr>
				<td>Per Day Car Cost($):</td>
				<td>${bill.costofVehicle}</td>
			</tr>
			<tr>
				<td>Rented for :</td>
				<td>${bill.noofDaysselected}</td>
			</tr>
			<tr>
				<td>Selected No. of Cars:</td>
				<td>${bill.noofvehicle}</td>
			</tr>
			
			<tr>
				<td>Final Amount($):</td>
				<td>${bill.totalbill}</td>
			</tr>
					
		</table>
		
		<br>
		<hr>
		<h3>We have sent Invoice mail to your mailId : <%=session.getAttribute("emailId")%></h3>
		<h3>Thank You for Booking with us. </h3>
		
	</div>
	
</body>
</html>