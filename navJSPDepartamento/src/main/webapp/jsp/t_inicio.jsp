<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscador</title>
</head>
<body>

<c:forEach items="${listaDepartamentos}" var="dep">
 <p>${dep.id}-${dep.nombre}</p>
</c:forEach>

</body>
</html>