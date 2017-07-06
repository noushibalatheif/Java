package jp;

public class employee 
{
	String name;
	String designation;
	String gender;
	int age;
	int pf;
	int gratuity;
	int salary;
	public employee(String name,String designation,String gender,int age,int pf,int gratuity,int salary)
	{
		this.name=name;
		this.designation=designation;
		this.gender=gender;
		this.age=age;
		this.pf=pf;
		this.gratuity=gratuity;
		this.salary=salary;
	}
	
	public int calculatesalary()
	{
		return(salary-(pf+gratuity));
	}
	void empdisplay()
	{
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Total Salary : "+calculatesalary());
 }

}
