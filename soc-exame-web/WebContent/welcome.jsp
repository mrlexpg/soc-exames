<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>### SOCEXAME - Sistema de Consulta de Exames ###</title>
</head>
<body>
	<h3>SOCEXAME - Bem-Vindo</h3>
	<h3>Menu</h3>	
	<ol>
		<li>
			<s:url action="pesquisar" var="aURL" /> 
			<s:a href="%{aURL}">Pesquisar Exames</s:a>
		</li>
		<li>
			<s:a href="javascript:alert('Incluir exame - Opção disponivel na proxima versão');">Incluir</s:a>
		</li>
		<li>
			<s:a href="javascript:alert('Alterar exame - Opção disponivel na proxima versão!');">Alterar</s:a>
		</li>		
		<li>			
			<s:a href="javascript:alert('Excluir exame - Opção disponivel na proxima versão!');">Excluir</s:a>
		</li>
		<li>
			<s:url action="listar" var="aURL" /> 
			<s:a href="%{aURL}">Listar Exames</s:a>
		</li>
	</ol>
</body>
</html>
