import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Informações pessoais
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String dataNascimento = request.getParameter("dataNascimento");
        String email = request.getParameter("email");

        // Informações acadêmicas
        String instituicao = request.getParameter("instituicao");
        String curso = request.getParameter("curso");
        String anoFormatura = request.getParameter("anoFormatura");

        // Informações profissionais
        String empresa = request.getParameter("empresa");
        String cargo = request.getParameter("cargo");

        // Cor favorita
        String corFavorita = request.getParameter("corFavorita");

        // Lógica para salvar os dados (por exemplo, no banco de dados)

        // Redirecionamento ou resposta
        response.getWriter().print("Usuário cadastrado com sucesso!");
    }
}
