<%@page import="vo.UserVO"%>
<%@page import="dao.Userdao"%>
<%@page import="service.UserServiceImpl"%>
<%@page import="service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adduser.jsp</title>
</head>
<body>
<h3>회 원 가 입 처 리 </h3>

<%
   String id = request.getParameter("id");
   String pw = request.getParameter("pw");
   String name = request.getParameter("name");
   String role = request.getParameter("role");

   Userdao dao = new Userdao();
   UserService service = new UserServiceImpl(dao);

   UserVO vo = new UserVO();
   vo.setId(id);
   vo.setName(name);
   vo.setPassword(pw);
   vo.setRole(role);
   
   int c = service.addUser(vo);
   
%>

입력정보 :  <%= id %> / <%= pw %> / <%=name %> / <%= role %>

<%
   if(c == 0){
%>
<h4>회 원 가 입 실 패</h4>
<%
}
%>
<br>
<a href="index.html" >home으로</a>
</body>
</html>




