package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.dao.NewMemberMybatisDao;


public class RegisterController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		NewMemberMybatisDao dao = NewMemberMybatisDao.getInstance();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
		dispatcher.forward(request, response); 
		
		
	}

}
