<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: illia
  Date: 1/25/18
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Social</title>
</head>
<body>

<h3>Connect to Facebook</h3>

<form action="<c:url value="/connect/facebook"/>" method="POST">
    <input type="hidden" name="scope" value="email" />
    <div class="formInfo">
        <p>You aren't connected to Facebook yet. Click the button to connect this application with your Facebook account.</p>
    </div>
    <p><button type="submit">Connect to Facebook</button></p>
</form>

</body>
</html>
