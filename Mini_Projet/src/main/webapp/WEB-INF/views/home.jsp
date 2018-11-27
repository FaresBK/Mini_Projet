
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<form:form method="POST" action="addclient">
    <button type="submit" class="btn btn-primary btn-lg btn-block">login</button>
</form:form>
<form:form method="POST" action="login">
    <button type="submit" class="btn btn-secondary btn-lg btn-block">inscription</button>    
</form:form>
</body>
</html>
