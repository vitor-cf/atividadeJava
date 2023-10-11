<!DOCTYPE html>
<html>
<head>
    <title>Formulário de Cadastro de Usuário</title>
</head>
<body>
    <form action="RegisterUserServlet" method="post">
        <!-- Informações pessoais -->
        <h3>Informações Pessoais:</h3>
        Nome: <input type="text" name="nome"><br>
        Sobrenome: <input type="text" name="sobrenome"><br>
        Data de Nascimento: <input type="date" name="dataNascimento"><br>
        Email: <input type="email" name="email"><br>
        
        <!-- Informações acadêmicas -->
        <h3>Informações Acadêmicas:</h3>
        Instituição: <input type="text" name="instituicao"><br>
        Curso: <input type="text" name="curso"><br>
        Ano de Formatura: <input type="text" name="anoFormatura"><br>

        <!-- Informações profissionais -->
        <h3>Informações Profissionais:</h3>
        Empresa: <input type="text" name="empresa"><br>
        Cargo: <input type="text" name="cargo"><br>
        
        <!-- Cor favorita -->
        <h3>Cor Favorita:</h3>
        <input type="color" name="corFavorita"><br><br>

        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
