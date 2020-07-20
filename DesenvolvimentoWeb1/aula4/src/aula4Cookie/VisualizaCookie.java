package aula4Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisualizaCookie
 */
@WebServlet("/VisualizaCookie")
public class VisualizaCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie listaCookie[] = request.getCookies();
		Cookie nome = null;
		if(listaCookie != null) {
			for(int i=0; i < listaCookie.length; i++) {
				if(listaCookie[i].getName().equals("MeuCookie")) {
					nome = listaCookie[i];
					break;
				}
			}
		}
		
		String html = "<html>" +
					  "<head><title>Visualizando Cookie</title></head>" +
					  "<body>" +
					  "O cookie chamado <strong>MeuCookie</strong> tem o valor: " +
					  "<strong>" + nome.getValue() + "</strong>" +
					  "</body>"+
					  "</html>";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(html);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
