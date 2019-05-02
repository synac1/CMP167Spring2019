
/*
 * 
 */
public class Human {
	//We have achieved encapsulation by having our instance variable private
	//We then will provide setters and getters to provide access
	private int age; //Instance variables belong to the object
	private String name;
	private double wealth;
	private boolean hasVehicle;
	private double hunger;
	private int food;
	private Vehicle[] vehicles; //array of vehicles

	public Human() { //Constructor  new Human();
		this.age        =  0; //this refers to the object, or instantiation of the class
		this.name       = "";
		this.wealth     = 0.0;
		this.hasVehicle = false;
		this.hunger     = 5.0;
		this.food       = 5;
		this.vehicles   = new Vehicle[100];
	}
	public Human(String name, int age) {//Overloaded Constructor
		this.age =  age;
		this.name = name;
		this.wealth     = 0.0;
		this.hasVehicle = false;
		this.hunger     = 5.0;
		this.food       = 5;
		this.vehicles   = new Vehicle[100];
	}
	//getter: Returns value of instance variable
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	//setter: Changes the values of instance variables
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	//The toString method provides a string representation of the object
	@Override
	public String toString() {
		return "Human:[ name: "+getName() +" , age:"+getAge()+" , wealth: "+this.wealth+"$]";
	}
	
	public int numberOfVehicles() {
		int total = 0;
		for (int i=0; i<vehicles.length; i++) {
			if(vehicles[i]!=null)
				total++;
			else
				break;
		}
		return total;
	}
	
	public void eat() {
		if (food>=4.5) { 
			hunger -= 1.0;
			food   -= 1;
			System.out.println("Yummy, I ate all");
		}
		else {
			System.out.println("Not enough food, please buy food");
		}
	}
	public void eat(double food) {//overloaded method
		hunger -= food/4.5;
		
	}
	public void grow() {
		age++;
	}
	public void work() {
		if(hunger<5) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("Whoah, I worked a lot");
		}
		else
			System.out.println("Too hungry to work");
	}
	public void buyFood() {
		if(wealth>5) {
			wealth -= 4.5;
			food++;
			System.out.println("Yoohoo! I bought some food");
		}
		else {
			System.out.println("No enough money, please work");
		}

	}


}
