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
		<form action="${pageContext.request.contextPath}/show/filter" method="get">
		
		<fieldset><legend>Buscar por</legend>
		
		<label>
			<select name="attribute">
  			<option value="author">Autor</option> 
  			<option value="isbn" selected>ISBN</option>
  			<option value="genre">Género</option>
			</select>
		</label>
		
		
		<label for="field6"><input type="text" class="input-field" name="value" value="" required/></label>
		
		
		<label><button type="submit"> Buscar </button> </label>
		<label><span> </span><button type="button" onclick="location.href='${pageContext.request.contextPath}/show'">Ver todos</button></label>
		</fieldset>
		</form>

	</div>	
</body>
</html>