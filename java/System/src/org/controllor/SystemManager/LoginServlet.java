package org.controllor.SystemManager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model.SystemManage.LoginDao;
import org.model.SystemManage.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
		boolean flag = LoginDao.login(user);
		String message =null;
        
        if(!flag){
        	message = "用户名或密码有误!";
        	request.getSession().setAttribute("message", message);
            request.getRequestDispatcher("登录界面.jsp").forward(request, response);
            return;
        }else{
        	message = "登录成功!";
        	request.setAttribute("message", message);
            request.getRequestDispatcher("欢迎界面.jsp").forward(request, response);
        return;
        }
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		doGet(request, response);
	}

}
