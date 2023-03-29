package org.zerock.w1.calc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc/makeResult")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CalcController() {
        super();
    }
    
    // 응답
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		System.out.printf(" 넘겨받은 1번째 숫자 : %s %n",num1);
		System.out.printf(" 넘겨받은 2번째 숫자 : %s %n",num2);
		response.sendRedirect(request.getContextPath()+"/index"); 
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp"); // 요청했을때 이 페이지를 보여준다
//		dispatcher.forward(request, response);
	}

}
