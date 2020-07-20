package aula4Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie; // Biblioteca para criar cookies

/**
 * Servlet implementation class CriandoCookie
 */
@WebServlet("/CriandoCookie")
public class CriandoCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriandoCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		Cookie meuCookie = new Cookie("MeuCoockie", "Jessica"); // Criei vari�vel do tipo cookie que se chama meucookie, o valor dessa vari�vel � J�ssica, no caso, meu nome
		meuCookie.setMaxAge(60); //Esse m�todo informa a qtd de tempo (em segundos) que o cookie vai ficar na m�quina
		meuCookie.setSecure(false);//M�todo informa se o cookie deve ser transferido pelo protocolo http padr�o - nesse caso, a resposta � n�o
		meuCookie.setComment("Meu primeiro cookie"); //M�todo serve para criar coment�rio para o cookie - n�o � obrigat�rio
		response.addCookie(meuCookie); // M�todo adiciona o cookie que foi criado - nesse caso, meuCookie. Se esse m�todo n�o for criado, o cookie n�o � criado
		String html = "<html>" +
					  "<head><title>Criando um cookie</title></head>"+
					  "<body>"+
					  "<h2>Seu cookie foi criado com sucesso</h2>"+
					  "<a href=\"VisualizaCookie\">" + "Clique aqui para ver o cookie criado" + "</a>"+
					  "</body>"+
					  "</html>";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(html);
		out.close();
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
