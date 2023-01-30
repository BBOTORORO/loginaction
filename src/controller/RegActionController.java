package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iclass.dao.NewMemberMybatisDao;
import org.iclass.vo.NewMember;



public class RegActionController implements Controller {

	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	 	request.setCharacterEncoding("UTF-8");
	 	String temp = request.getParameter("age");
		int age =-1;
		
		try{
			age =Integer.parseInt(temp);
			
		}catch(NumberFormatException e){}
		
		
		
		String id =	request.getParameter("id");
	 	String name =	request.getParameter("name");
	 	String email =	request.getParameter("email");
	 	String password =	request.getParameter("password");
	 	String gender =	request.getParameter("gender");
	 	String [] hobbies =request.getParameterValues("hobby");
	 	
	 	NewMemberMybatisDao dao= NewMemberMybatisDao.getInstance();
	
	 	int result=0;
	 	
	 
	 		 	result = dao.insert(NewMember.builder()
	    		.id(id)
	    		.name(name)
	    		.password(password)
	    		.email(email)
	    		.age(age)
	    		.gender(gender.equals("male")?"1":gender.equals("female")?"2":"3")
	    		.hobbies(Arrays.toString(hobbies))
				.build()
				);
				
		
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<script>");
	
		if(result==1) {
			
			out.print("alert('등록완료');");
			
		}else {
			out.print("alert('등록실패');");
		}
		out.print("location.href='index.hrd'");
		out.print("</script>");
	}

}
