package org.prasad;

class Employee
{
	public void details()
	{
		System.out.println("Employee Details would be Stored Here");
		System.out.println();
	}
}


interface Person{
	public void personDetails();
	}




public class AnonymousCls {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.details();
		
		// Anonymous Class would be created within the braces
		
		Employee emp1 = new Employee () {
			@Override
			public void details()
			{
				System.out.println("Anonymous Emp Class Would be created");
				System.out.println();
			}
		};
		emp1.details();
		
		// Interface implemented by class which is anonymous class inside the created object through reference of person
		
		Person person = new Person() { 
			
			public void personDetails()
			{
				System.out.println("Person Details would be Implemented inside the anonymous Class");
				System.out.println();
			}
			
		};
 	person.personDetails();
		
	}

}
