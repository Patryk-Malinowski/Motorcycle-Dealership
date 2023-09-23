// Patryk Malinowski
// R00210173
// Motorcycle Dealership Project

import java.util.Scanner;

//--------------------------------------------------
//
//	CLASS MyMain
//
//--------------------------------------------------


/**
 * This is the main class representing the management of a Motorcycle Dealership
 */
public class MyMain {

	/**
	 * This method prints the menu with various options for managing the dealership
	 */
	public static void printMenu() {
		System.out.print("------------------------------------\n");
		System.out.print("			    MENU			  	  \n");
		System.out.print("------------------------------------\n");
		System.out.print("0. Exit\n");
		System.out.print("1. Check All Stock\n");
		System.out.print("2. Add Stock\n");
		System.out.print("3. Remove Stock\n");
		System.out.print("4. Add Customer\n");
		System.out.print("5. Remove Customer\n");
		System.out.print("6. Display Customer Info\n");
		System.out.print("7. Display All Customer Id's\n");
		System.out.print("8. Create Order\n");
		System.out.print("9. Delete Order\n");
		System.out.println("\n\n");
	}



	//--------------------------------------------------
	//	selectIntOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid integer value (within a range) by keyboard.<br>
	 * @param sc - The scanner getting the input value by keyboard
	 * @param lb - The lower bound value accepted.
	 * @param ub - The upper bound value accepted.
	 * @return - The value entered by keyboard.
	 */
	public static int selectIntOption(Scanner sc, int lb, int ub) {

		//1. We create the output variable
		int res = -1;

		// 2. We create an auxiliary variable for the loop
		boolean validOption = false;

		//3. We keep asking for a valid option until one is given
		while (!validOption) {
			System.out.print("Please enter an integer value within the range " + lb + " and " + ub + "\n===> ");
			try {
				res = sc.nextInt();
				sc.nextLine();
				if ((res >= lb) && (res <= ub))
					validOption = true;
				else
					System.out.println("Sorry but the option must be within the range " + lb + " and " + ub + "\n");
			}
			catch (Exception e) {
				System.out.println("Sorry you did not enter an integer and then press the return key\n");
				sc.next();
			}
		}


		//4. We return res
		return res;
	}



	//--------------------------------------------------
	//	selectIntOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid integer value by keyboard.<br>
	 * @param sc - The scanner getting the input value by keyboard
	 * @return - The value entered by keyboard.
	 */
	public static int selectIntOption(Scanner sc){
		//1. We create the output variable
		int res = -1;

		// 2. We create an auxiliary variable for the loop
		boolean validOption = false;

		//3. We keep asking for a valid option until one is given
		while (!validOption) {
			System.out.println("Please enter an integer value");
			try {
				res = sc.nextInt();
				sc.nextLine();
				validOption = true;
			}
			catch (Exception e) {
				System.out.println("Sorry you did not enter an integer and then press the return key");
				sc.next();
			}
		}

		//4. We return res
		return res;
	}





	//--------------------------------------------------
	//	selectStringOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid String value by keyboard.<br>
	 * @param sc - The scanner getting the input value by keyboard
	 * @return - The value entered by keyboard.
	 */
	public static String selectStringOption(Scanner sc){

		//1. We create the output variable
		String res = "";

		// 2. We create an auxiliary variable for the loop
		boolean validOption = false;

		//3. We keep asking for a valid option until one is given
		while (!validOption) {
			try {
				res = sc.nextLine();
				if ((res.length() > 0) && (res.charAt(0) >= 'A') && (res.charAt(0) <= 'Z') && res.matches("[a-z, A-z]+"))
					validOption = true;
				else
					System.out.println("Sorry but the option must be a non-empty string starting by a capital letter and only containing letters");
			}
			catch (Exception e) {
				System.out.println("Sorry you did not enter a valid String and then press the return key");
				sc.next();
			}
		}

		//4. We return res
		return res;
	}






	//--------------------------------------------------
	//	selectStringMotoNameOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid String value by keyboard.<br>
	 * @param sc - The scanner getting the input value by keyboard
	 * @return - The value entered by keyboard.
	 */
	public static String selectStringMotoNameOption(Scanner sc){

		//1. We create the output variable
		String res = "";

		// 2. We create an auxiliary variable for the loop
		boolean validOption = false;

		//3. We keep asking for a valid option until one is given
		while (!validOption) {
			try {
				res = sc.nextLine();
				if ((res.length() > 0) && (res.charAt(0) >= 'A') && (res.charAt(0) <= 'Z') && res.matches("[a-z, A-Z, 0-9]+"))
					validOption = true;
				else
					System.out.println("Sorry but the option must be a non-empty string starting by a capital letter, it can contain letters and numbers");
			}
			catch (Exception e) {
				System.out.println("Sorry you did not enter a valid String and then press the return key");
				sc.next();
			}
		}

		//4. We return res
		return res;
	}


	//--------------------------------------------------
	//	selectPhoneNoOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid String value by keyboard.<br>
	 * @param sc - The scanner getting the input value by keyboard
	 * @return - The value entered by keyboard.
	 */
	public static String selectPhoneNoOption(Scanner sc){

		//1. We create the output variable
		String res = "";

		// 2. We create an auxiliary variable for the loop
		boolean validOption = false;

		//3. We keep asking for a valid option until one is given
		while (!validOption) {
			try {
				res = sc.nextLine();
				if ((res.length() > 0) && (res.charAt(0) >= '0') && (res.charAt(0) <= '9') && res.matches("[0-9]+"))
					validOption = true;
				else
					System.out.println("Sorry but the option must be a non-empty string containing numbers only. ");
			}
			catch (Exception e) {
				System.out.println("Sorry you did not enter the required String and then press the return key");
				sc.next();
			}
		}

		//4. We return res
		return res;
	}


	//--------------------------------------------------
	//	selectPhoneNoOption
	//--------------------------------------------------
	/**
	 * This function asks the user to enter a valid String value by keyboard.<br>
	 *
	 * @param sc - The scanner getting the input value by keyboard
	 */
	public static void pressEnterToContinue(Scanner sc){

		System.out.print("\n\nPress Enter to continue...");
		sc.nextLine();
	}


	//-------------------------------------------------------------------
	// interactiveSession
	//-------------------------------------------------------------------
	/**
	 * This function performs the interactive session to the user for managing the dealership.<br>
	 */
	public static void interactiveSession() {


		//1. We create the library database manager object
		DealershipImp d = new DealershipImp();


		// 2. We create some auxiliary variables
		boolean finish = false;
		int option;
		Scanner sc = new Scanner(System.in);


		//3. While the user wants to continue the session
		while (!finish) {

			//3.1. We clean the screen
			for (int i = 0; i <= 10; i++)
				System.out.println("\n");

			// 3.2. We print the menu
			printMenu();

			// 3.3. We ask for an option
			option = selectIntOption(sc, 0, 9);

			// 3.4. We create a few auxiliary variables
			String myStr;
			int myInt;
			boolean myBool;

			// 3.5. We perform the action
			switch (option) {
				case 0 -> finish = true;

				case 1 -> {
					// I. We print the message
					System.out.println("---------------\n1. Check All Stock\n---------------");

					// II. We perform the action
					d.displayAllMotoInfo();
					pressEnterToContinue(sc);
				}

				case 2 -> {
					// I. We print the message
					System.out.println("---------------\n2. Add Stock\n---------------");

					// II. We ask for the user input to define the item
					System.out.println("Please enter the name of the new motorcycle");
					myStr = selectStringMotoNameOption(sc);
					String name = myStr;
					System.out.println("Please enter the size (cc) of the new motorcycle");
					myInt = selectIntOption(sc);
					int size = myInt;
					System.out.println("Please enter the release year of the new motorcycle");
					myInt = selectIntOption(sc);
					int year = myInt;
					System.out.println("Please enter the colour of the new motorcycle");
					myStr = selectStringOption(sc);
					String colour = myStr;
					System.out.println("Please enter the price (€) of the new motorcycle");
					myInt = selectIntOption(sc);
					int price = myInt;

					// III. We attempt to add the Stock
					myInt = d.addMotorcycle(name, size, year, colour, price);

					// IV. We inform of the success of the operation
					System.out.println("New Motorcycle with MotoID " + myInt + " successfully created");
					pressEnterToContinue(sc);


				}


				case 3 -> {
					// I. We print the message
					System.out.println("---------------\n3. Remove Stock\n---------------");

					// II. We ask for the user input to define the item
					System.out.println("Please enter the id for the item to be removed");
					myInt = selectIntOption(sc);

					// III. We attempt to remove the Stock
					myBool = d.removeMotorcycle(myInt);

					// IV. We inform of the success of the operation
					if (!myBool) {
						System.out.println("Sorry, no item is registered with id = " + myInt + " so the remove operation can not proceed.");
					} else
						System.out.println("Item with id = " + myInt + " successfully removed");
					pressEnterToContinue(sc);

				}

				case 4 -> {
					// I. We print the message
					System.out.println("---------------\n4. Add Customer\n---------------");

					// II. We ask for the user input first name of the customer
					System.out.println("Please enter the first name of the new customer");
					myStr = selectStringOption(sc);
					String fname = myStr;

					System.out.println("Please enter the last name of the new customer");
					myStr = selectStringOption(sc);
					String lname = myStr;

					System.out.println("Please enter the phone number of the new customer");
					myStr = selectPhoneNoOption(sc);
					String phoneNo = myStr;

					// III. We attempt to add the user
					myInt = d.addCustomer(fname, lname, phoneNo);

					// IV. We inform of the success of the operation
					System.out.println("New customer with id " + myInt + " successfully created");
					pressEnterToContinue(sc);

				}

				case 5 -> {
					// I. We print the message
					System.out.println("---------------\n5. Remove Customer\n---------------");
					int myInt2;

					// II. We ask for the user input to identify the user to be removed
					System.out.println("Please enter the id for the customer to be removed");
					myInt = selectIntOption(sc);

					// III. We attempt to remove the user
					myInt2 = d.removeCustomer(myInt);

					// IV. We inform of the success of the operation
					if (myInt2 == -1)
						System.out.println("Sorry, no customer is registered with id = " + myInt + " so the remove operation cannot proceed.");
					else
						System.out.println("Customer with id = " + (myInt) + " successfully removed");
					pressEnterToContinue(sc);

				}

				case 6 -> {
					// I. We print the message
					System.out.println("---------------\n6. Display Customer Info\n---------------");

					// II. We ask for the user input to identify the customer
					System.out.println("Please enter the id for the customer to be displayed");
					myInt = selectIntOption(sc);

					// III. We attempt to display the user info
					d.displayCustomerInfo(myInt);
					pressEnterToContinue(sc);

				}

				case 7 -> {
					// I. We print the message
					System.out.println("---------------\n7. Display All Customer ID's\n---------------");

					// II. We perform the action
					d.displayAllCustomerIDs();
					pressEnterToContinue(sc);

				}

				case 8 -> {
					// I. We print the message
					System.out.println("---------------\n8. Create Order\n---------------");

					// II. We ask for the user input to identify the user id and the item id
					System.out.println("Please enter the id for the customer purchasing the motorcycle");
					myInt = selectIntOption(sc);
					System.out.println("Please enter the id for the motorcycle to be purchased");
					int myInt2 = selectIntOption(sc);

					// III. We attempt to purchase the motorcycle
					int myInt3 = d.purchaseMotorcycle(myInt, myInt2);

					// IV. We inform of the success of the operation
					if (myInt3 == -1) {
						System.out.println("Sorry, the motorcycle can not be purchased");
					} else
						System.out.println("New order with id = " + myInt3 + " successfully created");
					pressEnterToContinue(sc);

				}

				case 9 -> {
					// I. We print the message
					System.out.println("---------------\n9. Delete Order\n---------------");

					// II. We ask for the user input to identify the user id and the item id
					System.out.println("Please enter the id for the Customer that wants to cancel the order");
					myInt = selectIntOption(sc);
					System.out.println("Please enter the id for the motorcycle purchase to be cancelled");
					int myInt2 = selectIntOption(sc);

					// III. We attempt to borrow the item
					myBool = d.cancelOrder(myInt, myInt2);

					// IV. We inform of the success of the operation
					if (!myBool) {
						System.out.println("Sorry, the Order can not be cancelled");
						pressEnterToContinue(sc);

					} else
						System.out.println("The Order has been cancelled successfully.");
					pressEnterToContinue(sc);

				}



			}

		}
	}




	//--------------------------------------------------
	//	main
	//--------------------------------------------------
	/**
	 * This is the main entry point for the Java application.<br>
	 * @param args - Any argument passed when calling to the Java application.
	 */
	public static void main(String[] args) {
		// 1. We call to the method we want to try
		interactiveSession();
	}

}
