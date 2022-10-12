

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Multiply
 */
@WebServlet("/multiply")
public class Multiply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Multiply() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int firstNum, secondNum;
		
		firstNum = Integer.parseInt(request.getParameter("first"));
		secondNum = Integer.parseInt(request.getParameter("second"));
		
		int result = firstNum*secondNum;
		
		// Sending Repsonse
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head>");
		out.print("<title>Add Two Number</title>");
		out.print("<body>");
		out.print("<h1 style = \"color:red\">Multiplication is " + result + "</h1");
		out.print("</body>");
		out.print("</html>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
