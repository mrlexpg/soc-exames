<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>### SOCEXAME - Sistema de Consulta de Exames - Login Page ###</title>
</head>
<body>
<h3>Bem-vindo usuário, por favor login para acesso</h3>
<s:form action="login">
	<s:textfield name="name" label="Usuário"></s:textfield>
	<s:textfield name="pwd" label="Senha" type="password"></s:textfield>
	<s:submit value="Login"></s:submit>
</s:form>
</body>
</html>