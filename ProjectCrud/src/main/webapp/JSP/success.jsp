<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <table border ="2">
     <tr>
      <th>name</th>
     <th>username</th>
     <th>password</th>
     <th>ACTION</th>
     </tr>
     <c:forEach items ="${data}" var ="m">
     <tr>
     <td>${m.name}</td>
     <td>${m.username}</td>
     <td>${m.password}</td>
    <td><a href ="delete?name=${m.name}">DELETE</a>||<a href = "edit?rollno=${m.rollno}">Edit</a></td>
   </tr>
   
     </c:forEach>
     </table>

</body>
</html>