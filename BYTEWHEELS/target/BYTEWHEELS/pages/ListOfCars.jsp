<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
<title>BYTEWHEELS</title>

<script type="text/javascript">
	function changeFunc() {
		var selectBox = document.getElementById("selectBox");
		var selectedValue = selectBox.options[selectBox.selectedIndex].value;

		if (selectedValue == 'All Cars')

	}
</script>
</head>
<body>
	<div align="center"><h2>${msg}</h2></div>
	<hr>
	<div align="center" style="border: thick;" class="container">
		<form:form action="/booking.html" method="POST" name="booking">

			<table cellspacing="10" class="table table-hover">
				<tr>
					<td><h4>Available Cars Details</h4></td>
					
					<td><h5><a href="/BYTEWHEELS/DateSelector.html">Change Booking Date</a></h5></td>
					
				</tr>
			</table>
			<hr>
			<br>
			
			<table cellpadding="5" border="1" class="table table-hover">
				<tr>
					<th>Model</th>
					<th>Cost($)</th>
					<th>Type</th>
					<th>Available Cars</th>
					<th>Book</th>
				</tr>
				<c:if test="${fn:length(carlist) == 0}">
				<table cellspacing="5">
						<tr>
							<td>No cars Available for selected Days</td>
						</tr>
				</table>
				</c:if>
				<c:forEach items="${carlist}" var="car">
					<tr>
						<td><c:out value="${car.model}" /></td>
						<td><c:out value="${car.cost}" /></td>
						<td><c:out value="${car.type}" /></td>
						<td><c:out value="${car.availableCar}" /></td>
						<td><c:choose>
								<c:when test="${car.availableCar == 'NOT AVAILABLE'}">
       								 #
   								</c:when>
								<c:otherwise>
									<a
										href="<c:url value="/booking.html">
									             <c:param name='model' value="${car.model}"   />
									             <c:param name='cost' value="${car.cost}"/>
									             <c:param name='type' value="${car.type}"/>
									             <c:param name='availableCar' value="${car.availableCar}"/>
         							          </c:url>">
										Click to Book </a>
								</c:otherwise>
							</c:choose></td>
					</tr>

				</c:forEach>
			</table>
			<br>
		</form:form>
	</div>

</body>
</html>