<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>### SOCEXAME - Sistema de Consulta de Exames - Pesquisa
	de Exame ###</title>
</head>
<body>
	<h3>Pesquisar Exame</h3>
	<s:form action="pesquisarExame">
		<s:textfield name="idConsulta" label="Id"></s:textfield>
		<s:submit value="Pesquisar"></s:submit>
	</s:form>
	<br>
	<table>
		<tr>
			<td>
				<h5>
					<a href="javascript:history.back(1);">Voltar ao menu</a>
				</h5>
			</td>
		</tr>
	</table>
</body>
</html>