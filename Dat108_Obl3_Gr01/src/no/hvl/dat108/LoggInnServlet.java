package no.hvl.dat108;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoggInnServlet
 */
@WebServlet("/LoggInnServlet")
public class LoggInnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String loginMessage = "";
		
		request.getRequestDispatcher("WEB-INF/paalemdingsskjema.jsp");
		
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		//if p�melding g�r korrekt, send til p�meldingsbekreftelse, else gi feilmelding
		
	}

}
