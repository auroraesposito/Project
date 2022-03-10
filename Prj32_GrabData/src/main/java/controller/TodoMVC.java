package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import dal.TodoDAOImpl;
import entities.Todo;

/**
 * Servlet implementation class TodoMVC
 */
@WebServlet("/todos")
public class TodoMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private TodoDAOImpl repo = new TodoDAOImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoMVC() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Todo> all = repo.getAll();

		response.getWriter().append(all.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("title") != null) {
			int userId = Integer.parseInt(request.getParameter("user_id"));
			String title = request.getParameter("title");
			String status = request.getParameter("status");
			
			LocalDateTime dueOn = LocalDateTime.now();
			Todo t = new Todo(0, userId, title, dueOn, status);
			
			repo.addTodo(t);
			System.out.println(t);
		}
		doGet(request, response);
	}

}
