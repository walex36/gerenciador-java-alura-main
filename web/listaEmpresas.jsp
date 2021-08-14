<%-- 
    Document   : listaEmpresas
    Created on : 30/07/2021, 14:30:29
    Author     : Desenvolvimento
--%>

<%@page import="beans.EmpresaBean"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Empresas</title>
    </head>
    <body>
        <div>Lista de Empresas:</div>
        
        <ul>
            <c:forEach items="${listaEmpresas}" var="empresa">
                <li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></li>
            </c:forEach>
        </ul>
    </body>
</html>
