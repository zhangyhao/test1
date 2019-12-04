<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
<link href="css/index3.css" rel="stylesheet">
</head>
<body>
<table>
<tr>
	<td>id</td>
	<td>姓名</td>
	<td>生日</td>
</tr>
<c:forEach items="${list}" var="l">
	<tr>
		<td>${l.aid}</td>
		<td>${l.aname}</td>
		<td><fmt:formatDate value="${l.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
	</tr>
</c:forEach>
</table>
</body>
</html>