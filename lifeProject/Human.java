/*
 * Author: Yanilda
 * desc: 
 * created
 */
public class Human {
	//instance Variables
	public int age;
	public int food;
	public double wealth;
	public double hunger;
	public boolean hasVehicle;
	public String name;
	
	
	public void eat() {
		if(food>0)
			hunger -= 1.0; 
		else
			System.out.println("No enough please buy food");
	}
	public void grow() {
		age++;
	}
	public void work() {
		if(hunger<5)
			wealth += 10.5;
		else
			System.out.println("Too hungry to work");
	}
	public void buyFood() {
		if(wealth>5) {
			wealth -= 4.5;
			food++;
		}
		else {
			System.out.println("No enough money, please work");
		}
		
	}
	
	
	
}
