<!DOCTYPE html>
<html>
<head>
    <title>Informações da Sessão</title>
</head>
<body>
    <h3>Informações da Sessão:</h3>
    ID da Sessão: ${sessionID}<br>
    Data e Hora da Criação: ${creationTime}<br>
    Data e Hora do Último Acesso: ${lastAccessTime}<br>
    
    <c:if test="${message != null}">
        <h4>${message}</h4>
    </c:if>

    <form action="SessionInfoServlet" method="post">
        <input type="submit" value="Atualizar Sessão">
    </form>
</body>
</html>
