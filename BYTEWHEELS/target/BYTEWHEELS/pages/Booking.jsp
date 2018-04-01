<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>BYTEWHEELS</title>

<script>
	function validateemail()  { 
		noofcarsselected();
		
		var x=document.booking1.emailId.value;  

		var atposition=x.indexOf("@");  
		var dotposition=x.lastIndexOf(".");  
		if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
		  alert("Please enter a valid e-mail address Ex: abc@xyz.com");  
		  return false;  
	    }  
	}  
	
	
	function noofcarsselected(){  
		
		var availableCar=document.booking1.availableCar.value;  
		var noOfCarsSelected=document.booking1.noOfCarsSelected.value;  
		
		var difference=availableCar-noOfCarsSelected;
		
		if(difference<0){  
			alert("Selected no of Cars should be Less than Available Cars!"); 
			return false;  
		}  
		else{   
			return true;  
		}  
		}  
	
	$(document).ready(function(){
	    $('[data-toggle="popover"]').popover(); 
	});
	
</script>

</head>
<body>
	<div align="center" class="container">
		<h2>${msg}</h2>
	</div>

	<hr>

	<form name="booking1" method="post"
		action="/BYTEWHEELS/generatebill.html" onsubmit="return validateemail()">
		<div align="center" style="border: thick;" class="container">

			<table cellspacing="7" class="table table-hover">
				<tr>
					<td><h4>Enter Booking Details</h4></td>
					<td><h5><a href="/BYTEWHEELS/DateSelector.html">Change Booking
							Date</a></h5></td>
				</tr>

			</table>

			<table cellspacing="7" class="table table-hover">
				<tr>
					<td>Car Model :</td>
					<td><input type="text" name="model" value="${car.model}"
						class="field left" readonly  class="field left" /></td>
				</tr>
				<tr>
					<td>Car Type :</td>
					<td><input type="text" name="type" value="${car.type}"
						class="field left" readonly  class="field left" /></td>
				</tr>
				<tr>
					<td>Car Cost($):</td>
					<td><input type="text" name="cost" value="${car.cost}"
						class="field left" readonly  class="field left" />
				<tr>
					<td>Available cars :</td>
					<td><input type="text" name="availableCar"
						value="${car.availableCar}" readonly class="field left"  /></td>
				</tr>
				<tr>
					<td>Selected no of Days:</td>
					<td><input type="text" name="noOfDaysSelected"
						value="${car.noOfDaysSelected}" readonly class="field left"  /></td>
				</tr>
				<tr>
					<td>Choose no of cars :</td>
					<td><input type="text" name="noOfCarsSelected"
						class="form-control"
						title="It should be less than or equal to available no of car" /></td>
				</tr>

				<tr>
					<td>Email Id :</td>
					<td><input type="text" name="emailId" class="form-control"
						title="Should be in the format of abc@xyz.com" /></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Submit" class="btn btn-light">
			
		</div>
		</form>
</body>
</html>