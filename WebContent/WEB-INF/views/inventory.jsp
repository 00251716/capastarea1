<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inventario</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>

	   <c:if test="${filtering}">
       <p>Se encontraron <strong class="text-danger">${fn:length(bookList)}</strong> resultados para <strong class="text-danger">${value}</strong> en 
       
       
       <c:choose>
         
         <c:when test = "${attribute == 'isbn'}">
            <strong class="text-danger">ISBN</strong>
         </c:when>
         
         <c:when test = "${attribute == 'genre'}">
            <strong class="text-danger">g&eacute;nero</strong>
         </c:when>
         
         <c:when test = "${attribute == 'author'}">
           <strong class="text-danger">autor</strong>
         </c:when>
      
        </c:choose>
       
       
        </c:if>
        <c:if test="${!filtering}">
            <p>Hay <strong class="text-danger">${countBooks}</strong> libros en existencia, de <strong class="text-danger">${countAuthors}</strong> autores diferentes</p>
        </c:if>
	
    <table>
    	<thead>
    		<tr>
    			<th>ISBN</th>
    			<th>Título</th>
    			<th>Autor</th>
    			<th>Género</th>
    			<th>Existencias</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${bookList}" var="book">
                <tr>
                <td>${book.isbn}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.genre}</td>
                <td>${book.quantity}</td>
                </tr>
    		</c:forEach>
    	</tbody>
    </table>
</body>
</html>