package es.studium.HolaMundoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundoServlet
 */
@WebServlet("/HolaMundoServlet")
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HolaMundoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		try
		{
			out.println("<html>");
			out.println("<head><title>Mi Primer Servlet</title></head>");
			out.println("<body>");
			out.println("<h1>Hola, mundo!</h1>");

			out.println("<p>Request UI: " + request.getRequestURI() + "</p>");
			out.println("<p>Protocolo: " + request.getProtocol() +"</p>");
			out.println("<p>Dirección remota: " +request.getRemoteAddr() + "</p>");

			out.println("Número aleatorio: <strong>" + Math.random() +"</strong></p>");
			out.println("</body>");
			out.println("</html>");
		}
			finally
			{
				out.close();
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}
