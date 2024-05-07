<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>등록화면</title>
    <style>
        label {
            display: inline-block;
            width: 120px;
        }
        input {
            margin-bottom: 10px; 
        }
    </style>
</head>
<body>
    <h1>
        회원가입
    </h1>
    <form action="/login" method="post">
    	<input type="hidden" name="action" value="insert">
        <label>아이디 : </label> <input type="text" id="userid" name="userid" required="required"> <br/>
        <label>비밀번호 : </label>   <input type="password" id="userpassword" name="userpassword" required="required"><br/>
        <label>비밀번호확인 : </label>   <input type="password" id="userpassword2" name="userpassword2" required="required"><br/>
        <label>이름 : </label>   <input type="text" id="username" name="username" required="required"><br/>
        <label>주소 : </label>   <input type="text" id="address" name="address" required="required"><br/>
        <label>전화번호 : </label>   <input type="text" id="phone_number" name="phone_number" required="required"><br/>
        <label>성별 : </label>   <input type="text" id="gender" name="gender" required="required"><br/>
        <label>이메일: </label>  <input type="text" id="useremail" name="useremail" required="required"><br/>
    <div>
        <input type="submit" value="등록">
        <a href="users?action=list">취소</a>
    </div>
    
    </form>
    
</body>
</html>