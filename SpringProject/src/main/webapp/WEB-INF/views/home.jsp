<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
    prefix="sec"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>WELCOME!!</h1>
	<c:if test="${not empty pageContext.request.userPrincipal }">
		<a href="/users/logout">로그아웃하기</a>
		<p>${pageContext.request.userPrincipal.name}님 로그인</p>
		<%-- <p>${pageContext.request.userPrincipal}</p> --%>
	</c:if>
	<c:if test="${empty pageContext.request.userPrincipal }">
		<a href="/users/login">로그인하기</a>
		<a href="/users/register">회원가입하기</a>
	</c:if>
	<sec:authorize access="hasRole('ROLE_USER')">
	<a href="/users/member">멤버전용</a>
	</sec:authorize>
	<a href="/users/member">멤버전용</a>
${pageContext.request.authType}
	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
