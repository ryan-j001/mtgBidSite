<%--
  Created by IntelliJ IDEA.
  User: RyanLeno
  Date: 2017-05-11
  Time: 04:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="login" method="post">
    <div>
        <table>
            <thead>
            <th>Username</th>
            <th>Password</th>
            </thead>
            <tr>
                <td><input name="userName" id="user-name-label"></td>
                <td><<input type="password" id="password-label" name="password"></td>
            </tr>
        </table>
    </div>
    <div>
        <input type="submit" value="login"/>
    </div>
    <div>
        <input type="submit" value="cancel"/>
    </div>



    </table>


</form>

</body>
</html>
