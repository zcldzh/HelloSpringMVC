<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="false" %>
<html>
<head>
	<title>Order Details</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<c:if test="${fn:length(orders) > 0}">
		<table border="1">
			<tr><th>Order Id</th><th>Product Name</th><th>Quantity</th><th>Price</th></tr>
			<c:forEach items="${orders}" var="orderDetails" varStatus="status">
				<tr>
	               	<td>
						${orderDetails.id}
					</td>
					<td>
						${orderDetails.productName}
					</td>
					<td>
						${orderDetails.quantity}
					</td>
					<td>
						${orderDetails.price}
					</td>
					</tr>
			</c:forEach>           
		</table>
	</c:if>
</body>
</html>