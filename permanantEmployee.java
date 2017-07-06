package jp;

public class permanantEmployee extends employee
{
	public permanantEmployee(String name, String designation, String gender, int age, int pf, int gratuity, int salary)
	{
		super(name, designation, gender, age, pf, gratuity, salary);
	}

	int permanentCode;

	public void setpcode(int pcode)
	{
		this.permanentCode=pcode;
	}
	
	public int getpcode()
	{
		return  permanentCode;
	}
	
	void disp()
	{
		System.out.println("PermanentCode : "+ permanentCode);
	}

}
