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
	 * O método doGet recebe como parâmetro o request e o response, onde request é a requisição/a entrada dos dados e o response é o método utilizado como resposta/saída dos dados
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// "Capturar" um parâmetro personalizado, nesse caso, o nome. Esse nome será passado atraves do método GET para o servlet
		//Variáveis
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String profissao = request.getParameter("profissao");
		
		
		String html = "<html><body>"
				    + "<h1>Olá, "+nome+ "!!!</h1>"+
						"<p>"+ "Idade: "+idade+ "</br>"+
							" Profissao: "+profissao+
						"</p>"
					+ "</body></html>";
		
		response.getWriter().append(html);
				
		
		
	}

	
}
