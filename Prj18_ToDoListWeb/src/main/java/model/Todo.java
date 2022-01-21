package model;

public class Todo {
	
	private boolean done;
	private String description;
	private int id;
	private static int counter = 0;
	


	public Todo(String description) {
		super();
		this.done = false;
		this.description = description;
		this.id = counter++;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [done=");
		builder.append(done);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
