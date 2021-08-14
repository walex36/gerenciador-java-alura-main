<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Nova Empresa</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="/gerenciador/novaEmpresa" method="post">
            <div>
                Nome:<input type="text" name="nome"/>
                Data Abertura: <input type="text" name="data"/>
            </div>
            
            <br>
            <input type="submit" />
        </form>
    </body>
</html>
