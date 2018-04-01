<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
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
	
</script>

</head>
<body>
	<h2>${msg}</h2>
	<hr>

	<form name="booking1" method="post" action="/BYTEWHEELS/generatebill.html"
		onsubmit="return validateemail()">
		<div align="center" style="border: thick;" class="container">

			<table cellspacing="7" class="table table-hover">
				<tr>
					<td><h4>Check Booking Details</h4></td>
					<td><a href="/BYTEWHEELS/DateSelector.html">Change Booking
							Date</a></td>
				</tr>

			</table>

			<table class="table table-hover">
				<tr>
					<td>Car Model :</td>
					<td><input type="text" name="model" value="${car.model}"
						class="field left" readonly /></td>
				</tr>
				<tr>
					<td>Car Type :</td>
					<td><input type="text" name="type" value="${car.type}"
						class="field left" readonly /></td>
				</tr>
				<tr>
					<td>Car Cost($):</td>
					<td><input type="text" name="cost" value="${car.cost}"
						class="field left" readonly /></td>
				</tr>
				<tr>
					<td>Available cars :</td>
					<td><input type="text" name="availableCar"
						value="${car.availableCar}" class="field left" readonly /></td>
				</tr>
				<tr>
					<td>Selected days:</td>
					<td><input type="text" name="noOfDaysSelected"
						value="${car.noOfDaysSelected}" class="field left" readonly /></td>
				</tr>
				<tr>
					<td>Choose no of cars:</td>
					<td><input type="text" name="noOfCarsSelected"
						placeholder=" <= available car" width="70%" /></td>
				</tr>

				<tr>
					<td>Email Id :</td>
					<td><input type="text" name="emailId"/></td>
				</tr>

			</table>
			<br> <input type="submit" value="Confirm Booking">

		</div>
	</form>

</body>
</html>