<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/>
</sec:authorize>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Information</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        .button-container {
            margin-top: 20px;
        }
        .button-container button {
            padding: 10px 20px;
            font-size: 16px; 
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
	<h1>회원목록</h1>
	
	
	  
    <form id="searchForm" action="list.jsp" method="get" >
    	<label>이름 : </label>
    	<input type="text" id="searchKey" name="searchKey" value="${param.searchKey}">
    	<input type="submit" value="검색">
    </form>
    
    <form id="listForm" action="users" method="post">
    	<input type="hidden" id="action" name="action" value="views">
    	<input type="hidden" id="userid" name="userid" >
    </form>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>주소</th>
            <th>전화번호</th>
            <th>성별</th>
        </tr>
       
        <tr>
            <td onclick="jsView('${principal.member_id}')"  style="cursor:pointer;">${principal.member_id}</td>
            <td><a href="users?action=view&userid=${principal.member_id}">${principal.member_name}</a></td>
            <td>${principal.member_address}</td>
             <td>${principal.member_phone_number}</td>
              <td>${principal.member_gender}</td>
           
        </tr>

    </table>
<script>
function jsView(uid) {
	
	userid.value = uid;
	
	
	listForm.submit();
	
}
</script>      
    <div class="button-container">
        <a href="member?action=insertForm">등록</a>
    </div>
</body>
</html>