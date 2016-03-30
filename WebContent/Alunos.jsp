<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "to.AlunoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>
 <%
  AlunoTO to = (AlunoTO)request.getAttribute("AlunoTO");
 %> 
 <h3>Cliente Cadastrado </h3>
 <p>
 
 nome: <%=to.getNome()%> <br>
 telefone: <%=to.getTelefone()%> <br>
 endereco: <%=to.getEndereco()%> <br>
 email: <%=to.getEmail()%> <br>
 rg: <%=to.getRg()%> <br>
 Cpf: <%=to.getCpf()%> <br>
 </p>
</body>
</html>