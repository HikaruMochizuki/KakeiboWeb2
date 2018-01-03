package controller;


import static constants.Names.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Checker;


/**
 * Servlet implementation class InputWindowController
 */
@WebServlet("/InputWindowController")
public class InputWindowController extends HttpServlet {
	private static final long serialVersionUID = 1L;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputWindowController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Logger logger = LogManager.getLogger(InputWindowController.class);

		String date = request.getParameter(DATE);
		String store = request.getParameter(STORE);
		String purchase = request.getParameter(PURCHASE);

		Checker checker = new Checker();
		//logger.debug("Input Check");
		System.out.println("Input Check");
		checker.checkInputs(date, store, purchase);


		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/view/InputWindow.html");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
