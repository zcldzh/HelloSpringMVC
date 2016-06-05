<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page session="false" %>
<html>
<head>
	<title>User Names</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<c:if test="${fn:length(userNames) > 0}">
		<table border="1">
			<tr><th>Id</th><th>First Name</th><th>Last Name</th></tr>
			<c:forEach items="${userNames}" var="userName" varStatus="status">
				<tr>
					<td>
						${userName.id}
					</td>
	               	<td>
						${userName.firstName}
					</td>
					<td>
						${userName.lastName}
					</td>
					</tr>
			</c:forEach>           
		</table>
	</c:if>
</body>
</html>