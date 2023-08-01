<%@ page import="com.project1.*"%>
<jsp:useBean id="u" class="com.project.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%
  User1 d1=new User1();
  d1.save(u);
 %>
 <html>
  <body>
   <h1>Successful Register</h1>
  </body>
 </html>