import java.util.Random;

public class Game {
	public static void main(String[] args) {
		Human person1 = new Human(); //Creating Human Object
		Human person2 = new Human();
		Human person3 = new Human("Sara", 16);
		
		person2.setAge(5);
		person1.setName("Lila");
		person1.setAge(14);
		person1.eat();
		person1.work();
		
		System.out.println("age person 1 "+ person1.getAge());
		System.out.println("age  person 2 "+person2.getAge());
		System.out.println("age  person 3 "+person3.getAge());
		System.out.println(person1);	
		
		int rand =   (int)(Math.random()*20) +1;
		System.out.println(rand);
		
		Random rn= new Random();
		int n = rn.nextInt(44);
		
		
//		
//		System.out.println("Hunger: "+person1.hunger);
//		System.out.println("Food: "+person1.food);
//		
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Eating command:");
//		person1.eat();
//		
//		System.out.println("Hunger: "+person1.hunger);
//		System.out.println("Food: "+person1.food);
//		
//		System.out.println("Buying Food command:");
//		person1.buyFood();
//		
//		System.out.println("Working Command");
//		person1.work();
//		
//		System.out.println("Buying Food command:");
//		person1.buyFood();
//		
//		System.out.println("Working Command");
//		person1.work();
//		System.out.println("Working Command");
//		person1.work();
//		System.out.println("Eating command:");
//		person1.eat();
//		System.out.println("Working Command");
//		person1.work();
//		
		
	}
}
