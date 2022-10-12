import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class SecondServlet extends HttpServlet{			// 1. Extend HttpServlet
	
	
	// 3 Method
	
	// 1st | It will execute immediatly at the starting point of servlet
	// We don not implemenent in most of cases
	public void init() {
		
	}
	
	
	
	/*
	 *  User Makes a Request
	 *  Two Types
	 *  Get Request
	 *  Post Request
	*/
	
	//2nd Method this method will handle our user request
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

			int firstNum, secondNum;
			
			firstNum = Integer.parseInt(request.getParameter("first"));
			secondNum = Integer.parseInt(request.getParameter("second"));
			
			int result = firstNum+secondNum;
			
			// Sending Repsonse
			PrintWriter out = response.getWriter();
			
			out.println("<!DOCTYPE html><html><head>");
			out.print("<title>Add Two Number</title>");
			out.print("<body>");
			out.print("<h1 style = \"color:red\">Addition is " + result + "</h1");
			out.print("</body>");
			out.print("</html>");

			out.close();
		}
		
		//2nd Method this method will handle our user request
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
			
		}
	
	
	
	// 3rd | Whenever we will close our servlet
	
	// We don not implemenent in most of cases
	public void destroy() {
		
	}

}
