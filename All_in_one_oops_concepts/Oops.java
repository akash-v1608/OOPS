class Account{
	private String username;  // making private hides the variables. 
	private String password;
	Account(String username,String password)
	{
		this.username=username;
		this.password=password;
	}

	boolean isValidUser(String username,String password)  // to achieve encapsulation we need extra validation step.
	{
		if(this.username.equals(username) && this.password.equals(password))
			return true;
		else
			return false;
	}

}

interface Catalogue  // example of interface 
{
	 public void display();

}

class Greetings implements Catalogue
{
	public void display()
	{
		System.out.println("Welcome to Ticket Booking System for now train ticket service is available");
	}
}

abstract class Information    // example of abstarction 
{
	abstract void info_();
}


public class Oops
{
	public static void main(String[] args)
	{
		Account user=new Account("akash","123");
		Greetings greetings=new Greetings();
		greetings.display();

		Travel travel=new Travel(250,10);
		travel.info();


		if(user.isValidUser("akash","123"))
		{
				
						Train train=new Train(250,10);
						System.out.println(train.book(2,100));
						System.out.println(train.book(4,200,200));
						System.out.println(travel.book());		
		}
		else
			System.out.println("Authentication failed");

	}
}


class Travel extends Train{
	
	// example for inheritance.
		Travel(int baseprice,int charge)
		{
			super(baseprice, charge);
		}
	String book()
	{
	
		return "Train Tickets booked through Travel class ";
	}
}






class Train extends Information{

int baseprice;
int charge;
int fare;
Train(int baseprice,int charge)
{
	this.baseprice=baseprice;
	this.charge=charge;

}

String book(int passengers,int distance)  // ploymorphism examples , method overloading. 
{
	fare= (baseprice+distance*charge)*passengers;
	return "train ticket booked succesfully";
}
String book(int passengers,int distance,int discount)
{
	 fare=(baseprice+distance*charge)*passengers-discount;
	return "train ticket booked succesfully";

}
void info_()
{
	System.out.println("This class is written for booking train tickets");
}
void info()
{
	System.out.println("This class is written for booking train tickets");
}


}