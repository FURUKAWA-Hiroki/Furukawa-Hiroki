<%-- HTML・JSP　課題2 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<%-- substractionメソッド --%>
<%! int substraction(int numA, int numB){
    return numA - numB;
}
%>

    <meta charset= "UTF-8">
    <title>JSP TASK</title>
</head>
<body>
    <h1>125 - 15 = <%= substraction(125, 15)%></h1>
    <h1>17 - 21 = <%= substraction(17, 21)%></h1>

    </body>
</html>