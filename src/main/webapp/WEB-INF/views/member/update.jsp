<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/>
</sec:authorize>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>수정</title>
    <style>
        label {
            display: inline-block;
            width: 200px;
        }
        input {
            margin-bottom: 10px; 
        }
    </style>
</head>
<body>
    <h1>
        수정 결과 화면
    </h1>
	<c:if test="${updated != 0}">
		수정되었습니다 
	</c:if>
	<div>	   
		<a href="users?action=list">목록</a>
		<a href="users?action=view&userid=${param.userid}">상세보기</a>
	
		<form action="member" method="post">
			<input type="hidden" name="action" value="list">
			<input type="submit" value="목록">
		</form>     
		<form action="member" method="post">
			<input type="hidden" name="action" value="view">
			<input type="submit" value="상세보기">
		</form>     
	</div>
</html>