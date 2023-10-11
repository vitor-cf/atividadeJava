import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionInfoServlet")
public class SessionInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        
        String sessionID = session.getId();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String creationTime = sdf.format(new Date(session.getCreationTime()));
        String lastAccessTime = sdf.format(new Date(session.getLastAccessedTime()));

        // Adiciona ou incrementa o contador de acessos da sessão
        Integer accessCount = (Integer) session.getAttribute("accessCount");
        if (accessCount == null) {
            accessCount = 0;
        }
        session.setAttribute("accessCount", ++accessCount);

        String message = null;
        if (accessCount == 5) {
            message = "Esta é sua 5ª sessão!";
        }

        request.setAttribute("sessionID", sessionID);
        request.setAttribute("creationTime", creationTime);
        request.setAttribute("lastAccessTime", lastAccessTime);
        request.setAttribute("message", message);
        
        request.getRequestDispatcher("/sessionInfo.jsp").forward(request, response);
    }
}
