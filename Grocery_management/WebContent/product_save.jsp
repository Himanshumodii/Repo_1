 <%@ page import="com.project3.*"%>
<jsp:useBean id="u" class="com.project3.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>
<%
  save d1=new save();
 d1.demo1(u);
 out.print("Save successfully");
%>  