import java.util.*;  

public class mainfile
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("Main Menu:");
			System.out.println("1. View Passenger Locations");
			System.out.println("2. View Train Locations");
			System.out.println("3. Manage Passengers");
			System.out.println("4. Manage Trains");
			System.out.println("5. Manage Routes");
			System.out.println("6. Quit");
			Scanner userinput = new Scanner(System.in);
			String chosenoption = userinput.nextLine();
			userinput.close();
			switch(chosenoption[0])
			{
				case '1':
					view_passenger_locations();
					break;
				case '2':
					view_train_locations();
					break;
				case '3':
					manage_passengers();
					break;
				case '4':
					manage_trains();
					break;
				case '5':
					manage_routes();
					break;
				case '6':
					System.out.println("Quitting...");
					return;
				default:
					System.out.println("Invalid response.");
			}
		}
	}
	public static void view_passenger_locations()
	{
		Scanner userinput = new Scanner(System.in);
		String chosenoption;
		while(true)
		{
			//display RidingTrain
			//display WaitingInStation
			System.out.println("1. Move Passenger");
			System.out.println("2. Back");
			chosenoption = userinput.nextLine();
			if(chosenoption[0] == '1')
			{
				System.out.println("Enter passenger ID:");
				chosenoption = userinput.nextLine();
				if(true) //passenger ID valid
				{
					System.out.println("1. Move Passenger to Train");
					System.out.println("2. Move Passenger to Station");
					chosenoption = userinput.nextLine();
					if(chosenoption[0] == '1')
					{
						System.out.println("Enter train ID:");
						chosenoption = userinput.nextLine();
						if(true) //train ID valid
						{
							//remove the passenger from RidingTrain and WaitingInStation
							//add passenger to RidingTrain with the new train ID
							System.out.println("Passenger moved successfully.");
						}
						else
						{
							System.out.println("No train with that ID found.");
						}
					}
					else if(chosenoption[0] == '2')
					{
						System.out.println("Enter station ID:");
						chosenoption = userinput.nextLine();
						if(true) //station ID valid
						{
							//remove the passenger from RidingTrain and WaitingInStation
							//add passenger to WaitingInStation with the new station ID
							System.out.println("Passenger moved successfully.");
						}
						else
						{
							System.out.println("No station with that ID found.");
						}
					}
					else
					{
						System.out.println("Invalid response.");
					}
				}
				else
				{
					System.out.println("No passenger with that ID found.");
				}
			}
			else if(chosenoption[0] == '2')
			{
				System.out.println("Returning to main menu...");
				userinput.close();
				return;
			}
			else
			{
				System.out.println("Invalid response.");
			}
		}
	}
	public static void view_train_locations()
	{
		Scanner userinput = new Scanner(System.in);
		String chosenoption;
		while(true)
		{
			//display DockedAtStation
			//display TravelingDownRoute
			System.out.println("1. Move Train");
			System.out.println("2. Back");
			chosenoption = userinput.nextLine();
			if(chosenoption[0] == '1')
			{
				System.out.println("Enter train ID:");
				chosenoption = userinput.nextLine();
				if(true) //train ID valid
				{
					System.out.println("1. Move Train to Station");
					System.out.println("2. Move Train to Route");
					chosenoption = userinput.nextLine();
					if(chosenoption[0] == '1')
					{
						System.out.println("Enter station ID:");
						chosenoption = userinput.nextLine();
						if(true) //station ID valid
						{
							//remove the train from DockedAtStation and TravelingDownRoute
							//add train to DockedAtStation with the new station ID
							System.out.println("Train moved successfully.");
						}
						else
						{
							System.out.println("No station with that ID found.");
						}
					}
					else if(chosenoption[0] == '2')
					{
						System.out.println("Enter route ID:");
						chosenoption = userinput.nextLine();
						if(true) //route ID valid
						{
							//remove the train from DockedAtStation and TravelingDownRoute
							//add train to TravelingDownRoute with the new route ID
							System.out.println("Passenger moved successfully.");
						}
						else
						{
							System.out.println("No route with that ID found.");
						}
					}
					else
					{
						System.out.println("Invalid response.");
					}
				}
				else
				{
					System.out.println("No train with that ID found.");
				}
			}
			else if(chosenoption[0] == '2')
			{
				System.out.println("Returning to main menu...");
				userinput.close();
				return;
			}
			else
			{
				System.out.println("Invalid response.");
			}
		}
	}
	public static void manage_passengers()
	{
		Scanner userinput = new Scanner(System.in);
		String chosenoption;
		while(true)
		{
			//display Passenger
			System.out.println("1. Add Passsenger");
			System.out.println("2. Edit Passenger");
			System.out.println("3. Remove Passenger");
			System.out.println("4. Back");
			chosenoption = userinput.nextLine();
			if(chosenoption[0] == '1')
			{
				System.out.println("Enter passenger ID:");
				String passengerid = userinput.nextLine();
				System.out.println("Enter passenger first name:");
				String firstname = userinput.nextLine();
				System.out.println("Enter passenger last name (can be blank):");
				String lastname = userinput.nextLine();
				System.out.println("Enter destination station ID:");
				String destinationstation = userinput.nextLine();
				System.out.println("Enter starting station ID:");
				String startingstation = userinput.nextLine();
				if(true) //passenger can be successfully added to Passenger and WaitingInStation
				{
					//add passenger to Passenger and WaitingInStation
					System.out.println("Passenger created successfully.");
				}
				else //passenger can't successfully be added to Passenger, due to, say, their referenced station IDs not matching existing station IDs
				{
					System.out.println("Passenger could not be created successfully. Check for invalid data.");
				}
			}
			else if(chosenoption[0] == '2')
			{
				//incomplete
			}
			else if(chosenoption[0] == '3')
			{
				System.out.println("Enter passenger ID:");
				chosenoption = userinput.nextLine();
				if(true) //a passenger with that ID exists
				{
					//incomplete
				}
				else
				{
					System.out.println("No passenger with that ID found.");
				}
			}
			else if(chosenoption[0] == '4')
			{
				System.out.println("Returning to main menu...");
				userinput.close();
				return;
			}
			else
			{
				System.out.println("Invalid response.");
			}
		}
	}
	public static void manage_trains()
	{

	}
	public static void manage_routes()
	{

	}
}