<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action = "update">
   <pre>
        <input type = "hidden" name ="rollno" value = "${data.rollno}">
        
   name:<input type ="name" name ="name" value ="${data.name}"> 
   username:<input type ="username" name = "username" value = "${data.username}">
   password:<input type ="password" name = "password" value = "${data.password}">
   
   <input type = "submit" value = "UPDATE">
   
   
   </pre>
   </form>




</body>
</html>