package widgetstore.web;

import main.App;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyForm")
public class RobotDetailsServlet extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String robotName = request.getParameter("robot-name");
		String robotWeight = request.getParameter("robot-weight");
		String robotPower = request.getParameter("robot-power");
		
		
			App.writeToDB(robotName, robotWeight, robotPower);
			out.println("The robot was added to the database.");
	}
}