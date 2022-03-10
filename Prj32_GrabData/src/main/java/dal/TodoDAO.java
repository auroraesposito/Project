package dal;

import java.util.List;

import entities.Todo;

public interface TodoDAO {
	
	String TAB = "todos";
	String FIND_ALL = "select * from" + TAB;
	String INSERT = "insert into " + TAB + " (user_id, title, due_on, status) values(?,?,?,?)";
	
	List<Todo> getAll();
	void addTodo(Todo t);

}
