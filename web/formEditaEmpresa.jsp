<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/editaEmpresa" var="linkServletNovaEmpresa"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Editando Empresa</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="/gerenciador/entrada?acao=AlteraEmpresa" method="post">
            <div>
                Nome:<input type="text" name="nome" value="${empresa.nome}"/>
                Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
                <input type="hidden" name="id" value="${empresa.id}">
            </div>
            
            <br>
            <input type="submit" value="Salvar"/>
        </form>
    </body>
</html>
