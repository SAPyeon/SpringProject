<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="${pageContext.request.contextPath}/users/register"
		method="post">
		<div>
			id <input type="text" name="id" />
		</div>
		<div>
			pw <input type="password" name="password" />
		</div>
		<div>
			name <input type="text" name="name" />
		</div>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<div>
			<input type="submit" value="회원가입" />
		</div>
	</form>
</body>
</html>