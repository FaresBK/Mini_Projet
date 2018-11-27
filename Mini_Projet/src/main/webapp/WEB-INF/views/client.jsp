<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>client</title>
</head>
<body>
<form:form method="POST" action="loge"  class="from-group">
<div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <form:input type="text"   path="Email"  class="form-control" placeholder="Nom"/>
    </div>
  <div class="form-group col-md-6">
     <label for="inputPassword4">Passwored</label>
     <form:input  type="text"  path="passwored" class="form-control"  placeholder="Prenom"/>
</div>
<button type="submit" class="btn btn-primary">login</button>
</form:form>
</body>
</html>