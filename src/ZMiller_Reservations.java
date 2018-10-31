import java.util.Scanner;
public class ZMiller_Reservations {

	public static void main(String[] args) {
		AirlineRes res1=new AirlineRes();
		String upgrade="";
		String confirm="yes";
		boolean upgradeFlag=false;
		Scanner scan =new Scanner(System.in);
		
		res1.initialSeats();
		do{
			if(!(upgradeFlag))
			{
				res1.askChoice();
			}
			if(res1.getSeatChoice()==1)
			{
				res1.searchFirst();
				res1.setSeatClass("First Class");

				if(res1.getSeatAssign()==0 && !(upgradeFlag))
				{
					System.out.print("First Class is full. Do you want to Economy? ");
					upgrade=scan.next();
					System.out.println(upgrade);
					
					if((upgrade.compareTo(confirm)==0))
					{
						res1.setSeatChoice(2);
						res1.setSeatAssign(25);
						upgradeFlag=true;
					}
				}
			}
			else
			{
				res1.searchEcon();
				res1.setSeatClass("Economy");
				if(res1.getSeatAssign()==0 && !(upgradeFlag))
				{
					System.out.print("Economy is full. Do you want to upgrade to First Class?");
					upgrade=scan.next();
					
					if(upgrade.compareTo(confirm)==0)
					{
						res1.setSeatChoice(1);
						res1.setSeatAssign(25);
						upgradeFlag=true;
					}
				}
			}
			if(res1.getSeatAssign()!=25)
			{
				res1.printPass();
				upgradeFlag=false;
			}
		}while(res1.getNumSeats()<10);
		System.out.println("\nFlight is full. No more reservations are being accepted at this time.");
		scan.close();

	}

}
