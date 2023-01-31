package controller;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.iclass.dao.NewMemberMybatisDao;
import org.iclass.vo.NewMember;

import mybatis.SqlSessionBean;

//new RequestKeyValue("/login.hrd", "POST")
public class LoginActionController implements Controller {

	@Override
	public void handle(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
	 	NewMemberMybatisDao dao =  NewMemberMybatisDao.getInstance();
	 	
	 
	 	String id =	request.getParameter("id");
	 	
		String password= request.getParameter("password");
		
		Map<String, String> map = new HashMap<String, String>();
		
		HttpSession session= request.getSession();
		PrintWriter out = response.getWriter();
		
		map.put("id", id);
		map.put("password", password);
		
		NewMember vo = dao.login(map);
		
		if(id.equals("id") && password.equals("password")) {
			session.setAttribute("userid", id);
		
		out.print("<script>");
		out.print("alert('로그인 성공!');");
		out.print("</script>");
		}
	}

}
	
	
	
