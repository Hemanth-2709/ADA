package program2A;
import java.util.Scanner;
class Staff
{
 	String sid,name,ph;
 	float sal;
	void getdetails()
 	{
   		Scanner s=new Scanner(System.in);
   		System.out.println("Enter Id");
   		sid=s.next();
   		System.out.println("Enter Name");
   		name=s.next();
   		System.out.println("Enter phone number");
   		ph=s.next();
   		System.out.println("Enter Salary");
   		sal=s.nextFloat();
   }
	void putdetails()
	{
		System.out.println("-----Staff Details are-----");
		System.out.println("Staff Id is:"+sid);
		System.out.println("Staff Name is:"+name);
		System.out.println("Staff Phone number is:"+ph);
		System.out.println("Staff Salary is:"+sal);}   
}
class Teaching extends Staff
{
	String dom,pub;
	Teaching()
 	{
	  	getdetails();
    	Scanner s=new Scanner(System.in);
  		System.out.println("Enter domian");
   		dom=s.next();
  		System.out.println("Enter Publications");
  		pub=s.next(); 
  	}
 	void dispTeach()
 	{
   		putdetails();
   		System.out.println("Staff Domain is:"+dom); 
   		System.out.println("Staff has Published:"+pub);
  	}
}
class Technical extends Staff
{
	String skills;
	Technical()
	{
 		getdetails();
 		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Skills");
  		skills=s.next();
 	}
 	void dispTech()
 	{
  		putdetails();
System.out.println("Skills of the Staff:"+skills);
 	}
}
class Contract extends Staff
{
	int period;
	Contract()
	{
		getdetails();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Contract period in yrs");
      	period=s.nextInt();
	}
void dispContract()
{
	 	putdetails();
	 	System.out.println("Staff Contract period is:"+period+"yrs");
}
}
public class Demo
{
	public static void main(String arg[])
{
		System.out.println("Enter the details of Teaching Staff");  
		Teaching t1=new Teaching();  // Teaching Staff
		System.out.println("Enter the details of Technical Staff");
		Technical t2= new Technical();//Technical Staff
		System.out.println("Enter the details of Contract Based Staff");
		Contract c=new Contract(); //Contract based Staff
		System.out.println("Teaching Staff");
		t1.dispTeach();
		System.out.println("Technical Staff");
		t2.dispTech();
		System.out.println("Contract Based Staff");
		c.dispContract();
}
}
