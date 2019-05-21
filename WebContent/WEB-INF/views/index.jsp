<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="resources/style.css">
<meta charset="UTF-8">
<title>Biblioteca</title>
</head>
<body>
	
	<div class="form-style-3">
		<form action="${pageContext.request.contextPath}/" method="get">
		
		<fieldset><legend>Buscar por</legend>
		<label for="field6"><span>ID<span class="required">*</span></span><input type="number" class="input-field" name="studentId" value="" /></label>
		
		<select name="choice">
  		<option value="first">First Value</option> 
  		<option value="second" selected>Second Value</option>
  		<option value="third">Third Value</option>
		</select>
		
		<label><span> </span><input type="submit" value="Enviar" /></label>
		</fieldset>
		</form>
	</div>	
</body>
</html>