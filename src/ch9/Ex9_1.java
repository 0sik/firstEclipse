 class Person{
	 long id; // this.id
	 
	 public boolean equals(Object obj) {
		 if(!(obj instanceof Person))
			 return false;
		 Person p = (Person)obj;
		 return this.id == p.id;
	 }
	 Person(long id){
		 this.id = id;
	 } 
	 
 }
public class Ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		if(p1.equals(p2))
			System.out.println("p1 p2 °°");
		else
			System.out.println("p1 p2 ´Ù");	
		
	}

}
