package org.zerock.w1.calc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*<servlet>
//	<servlet-name>inputController</servlet-name>
//	<servlet-class>org.zerock.w1.calc.InputController</servlet-class>
</servlet>*/
@WebServlet(urlPatterns = {"/calc/input" , "/index"}, name ="InputController" ) // servlet-name 및 class를 줄여서 사용한거다
public class InputController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InputController() {
    	super();
    	System.out.println("====InputController 서블릿 생성자");
    }
    
    
    // init => 한번만 실행된다 (웹브라우저 창을 열면 한번만 실행)
    @Override
    public void init() throws ServletException{
    	super.init();
    	System.out.println("이 내용은 init() 입니다");
    }
    // 요청
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 방식으로 요청했을 때 동작한다");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/index.jsp"); // 요청했을때 이 페이지를 보여준다
		dispatcher.forward(request, response);
	}
	
	// destroy => 메모리가 회수될때 실행된다 (웹브라우저 창을 닫으면)
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("이 내용은 destroy() 입니다");
	}

}
