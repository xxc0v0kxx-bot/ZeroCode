package curriculum.j;

abstract public class Employee implements Billable{
	
	private String id;
	private String name;
    
 // Mainで出力できるようにgetterを追加
 	public String getId() {
 		return id;
 	}

 	public String getName() {
 		return name;
 	}

	public Employee(String id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public abstract int costForDay(int hoursWorked);{
	
	
}}
