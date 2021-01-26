package main;

import org.hibernate.Session;
import hibernate.HibernateUtils;
import robot.RobotEntity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class App {
	
	static Session session;
	static robot.RobotEntity robot = new robot.RobotEntity();
	
	public static void writeToDB(String robotName, String  robotWeight, String robotPower) throws IOException {
		
		try {
			session = HibernateUtils.buildSessionFactory().openSession();
			session.beginTransaction();
			
			try {
				robot.setName(robotName);
				robot.setWeight(Long.parseLong(robotWeight));
				
				if (robotPower.equals("on")) {
					robot.setSwitchedOn(true);
				} else {
					robot.setSwitchedOn(false);
				}	
			}catch(NumberFormatException a) {	
				System.out.print("ID and Weight Should be Numbers and Not Null");
				a.printStackTrace();
			}
		
		session.save(robot);
		session.getTransaction().commit();
			
		
		} catch (Exception sqlException) {
			sqlException.printStackTrace();
			if (null != session.getTransaction()) {
				session.getTransaction().rollback();
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}
		
	}
}

