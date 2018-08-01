<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>### SOCEXAME - Sistema de Consulta de Exames - Listagem
	de Exames ###</title>
</head>
<body>
	<h3>Lista de Exames Cadastrados</h3>
	<table border="1">
		<tr>
			<td>Id Consulta</td>
			<td>Tipo Exame</td>
			<td>Data Exame</td>
			<td>Resultado</td>
		</tr>
		<c:forEach items="${exames}" var="exame">
			<tr>
				<td>${exame.idConsulta}</td>
				<td>${exame.tipoExame}</td>
				<td><fmt:formatDate type = "date" value = "${exame.dataExame}" pattern="dd/MM/yyyy"/> </td>
				<td>${exame.resultado}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
    <a href="javascript:history.back(1);">Voltar ao menu</a>
</body>
</html>