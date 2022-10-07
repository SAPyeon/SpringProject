<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/login.css">
</head>
<body>
	<div id="container">
		<div id="header"></div>
	</div>
	<div id="main">
		<div id=line>
			<form action="${pageContext.request.contextPath}/users/loginProcess" method="post">
				<h1>login</h1>
				<h1>${error}</h1>
				<div id="id">
					<input type="text" placeholder="id" class="text_id" name="id">
					<input type="password" placeholder="password" class="text_id" name="pw">

				</div>
				<div id="checkbox">
					<label><input type="checkbox" value="save"
						class="checkbox"> 아이디 저장</label> <label><input
						type="checkbox" value="notsave" class="checkbox">보안접속</label>
				</div>
				<div class="loginbutton">
					<div>
						<input type="submit" id="button_login" value="로그인"/>
						<!-- <button id="button_login" type="submit">로그인</button> -->
					</div>
				</div>
				<div id="find_id">
					<div>
						<button id="button_findid" type="button">아이디/비밀번호 찾기</button>
					</div>
				</div>
				<div id="create_id">
					<div>
						<button id="button_createid" type="button">회원가입</button>
					</div>
				</div>
				<div id="kakao_login" class="loginbutton">
					<div>
						<button id="button_kakaologin" type="button">카카오로 로그인</button>
					</div>
				</div>
				<div id="naver_login" class="loginbutton">
					<div>
						<button id="button_naverlogin" type="button">네이버로 로그인</button>
					</div>
				</div>
				 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
		</div>
	</div>


	<div id="footer"></div>
</body>
</html>