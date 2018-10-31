import java.util.Scanner;

public class AirlineRes {
	private boolean[] seats = new boolean[11];
	
	//variables
	private int seatChoice;
	private int seatAssign;
	private int numSeats;
	private String seatClass;
	
	public AirlineRes()
	{
		seatChoice=0;
		seatAssign=0;
		numSeats=0;
		seatClass="";
	}
	
	public void initialSeats()
	{
		for(int i=0;i<seats.length;i++)
		{
			seats[i]=false;
		}
	}
	
	public void askChoice()
	{
		Scanner scan =new Scanner(System.in);
		do{
			try
			{
				System.out.print("Would you like First Class (1) or Economy (2): ");
				seatChoice=scan.nextInt();
			}catch(NumberFormatException e)
			{
				System.out.println("We are sorry, but you did not enter a valid choice. Please enter 1 for first class or 2 for economy.");
				scan.next();
			}
			}while(!(seatChoice==1||seatChoice==2));
		
	}
	
	public void setSeatChoice(int sc)
	{
		seatChoice=sc;	
	}
	
	public int getSeatChoice()
	{
		return seatChoice;
	}
	
	public void setSeatAssign(int sa)
	{
		seatAssign=sa;
	}
	
	public void setSeatClass(String sc)
	{
		seatClass=sc;
	}
	
	public int getSeatAssign()
	{
		return seatAssign;
	}
	
	public int getNumSeats()
	{
		return numSeats;
	}
	
	public void searchFirst()
	{
		
			for(int i=1; i<=5;i++)
			{
				if(seats[i]==false)
				{
					seats[i]=true;
					setSeatAssign(i);
					numSeats++;
					break;
				}	
				else
					{
						setSeatAssign(0);			
					}
			}
			

	}
	
	public void searchEcon()
	{
		for(int i=6;i<=10;i++)
		{
			if(seats[i]==false)
			{
				seats[i]=true;
				setSeatAssign(i);
				numSeats++;
				break;
			}
			else
			{
				setSeatAssign(0);			
			}
		}

		
	}
	
	public void printPass()
	{
		System.out.printf("Seat Class: %s \tSeat Number: %d\n\n",seatClass,seatAssign);
	}

}
