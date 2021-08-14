<%-- 
    Document   : novaEmpresaCriada
    Created on : 30/07/2021, 13:56:32
    Author     : Desenvolvimento
--%>

<%@page import="modelos.EmpresaModelo"%>
<%
    EmpresaModelo empresa = (EmpresaModelo)request.getAttribute("empresa");
    String nomeEmpresa = empresa.getNome();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4>Empresa <%= nomeEmpresa %> adicionada!</h4>
    </body>
</html>
