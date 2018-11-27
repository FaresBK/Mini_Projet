
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Registration Page</title>
</head>
<body>

<form:form method="POST" action="conveti"  class="from-group">
 <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nom</label>
      <form:input type="text"  path="nom"  class="form-control" placeholder="Nom"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Prenom</label>
      <form:input  type="text"  path="prenom" class="form-control"  placeholder="Prenom"/>
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Email</label>
    <form:input  type="Email"  path="Email" class="form-control"  placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="inputAddress2">Passwored</label>
    <form:input type="password" class="form-control"  path="passwored" placeholder="Passwored"/>
  </div>
 <button type="submit" class="btn btn-primary">Sign in</button>

</form:form>

</body>
</html>