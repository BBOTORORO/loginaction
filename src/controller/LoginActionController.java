package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iclass.dao.NewMemberMybatisDao;
import org.iclass.vo.NewMember;

//new RequestKeyValue("/login.hrd", "POST")
public class LoginActionController implements Controller {

	@Override
	public void handle(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		
		String id= request.getParameter("userid");
		String password= request.getParameter("password");

		HttpSession session= request.getSession();
		
		
		if(id.equals("admin") && password.equals("admin")) {
			
			session.setAttribute("userid", id);		
		}
		response.sendRedirect(request.getContextPath());
	}

	
	
	
	
	
}