package aula3Get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOlaPersonalizado
 */
@WebServlet("/ServletOlaPersonalizado") // URL
public class ServletOlaPersonalizado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOlaPersonalizado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * O m�todo doGet recebe como par�metro o request e o response, onde request � a requisi��o/a entrada dos dados e o response � o m�todo utilizado como resposta/sa�da dos dados
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// "Capturar" um par�metro personalizado, nesse caso, o nome. Esse nome ser� passado atraves do m�todo GET para o servlet
		//Vari�veis
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String profissao = request.getParameter("profissao");
		
		
		String html = "<html><body>"
				    + "<h1>Ol�, "+nome+ "!!!</h1>"+
						"<p>"+ "Idade: "+idade+ "</br>"+
							" Profissao: "+profissao+
						"</p>"
					+ "</body></html>";
		
		response.getWriter().append(html);
				
		
		
	}

	
}
