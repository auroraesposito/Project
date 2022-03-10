package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Multisala {

	private List<Sala> sale;
	
	{
		sale = new ArrayList<Sala>();
		sale.add(new Sala("Sala 1", 100, 01));
		sale.add(new Sala("Sala 2", 100, 02));
		sale.add(new Sala("Sala 3", 100, 03));
		sale.add(new Sala("Sala 4", 100, 04));
	}
	
	
	
	
	
	
}
