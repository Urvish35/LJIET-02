package Assignment1;

import java.util.*;

class Student

{

	private String name;

	private int age;

	private int marks;

	

	public Student(String name, int age, int marks) 

	{

		super();

		this.name = name;

		this.age = age;

		this.marks = marks;

	}

	@Override

	public String toString() 

	{

		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";

	}

	

}

public class StudentArray

{

	public static void main(String[] args) 

	{

		Scanner sc = new Scanner(System.in);

		

		Student[] students = new Student[5];

		int count = 0;

		

		do 

		{

			System.out.println("Enter details for Student "+ (count + 1) + ":");

			

			System.out.println("Name: ");

			String name = sc.nextLine();

			

			System.out.println("Age: ");

			int age = Integer.parseInt(sc.nextLine());

			

			System.out.println("Marks: ");

			int marks = Integer.parseInt(sc.nextLine());

			

			students[count] = new Student(name,age,marks);

			count++;

			

			if(count == 5) 

			{

				break;

			}

			

			System.out.println("Do you want to enter details for another student? (yes/no): ");

			

		}while(sc.nextLine().equalsIgnoreCase("yes"));

		

		System.out.println("\nStudent Details:");

		

		for(int i = 0; i < count; i++) 

		{

			System.out.println("Student "+ (i+1) + ": " + students[i].toString());

		}

	}

}
