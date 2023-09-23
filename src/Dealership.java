// Patryk Malinowski
// R00210173

//--------------------------------------------------
//
//	INTERFACE Dealership
//
//--------------------------------------------------


/**
 * This is the main interface for the A03 Project,
 * representing the management of a dealership<br>.
 */
public interface Dealership {


    //---------------------------------------
    //	addUser
    //---------------------------------------
    /**
     * This method attempts to add a customer to the dealership<br>
     * @param fname - The first name of the customer.
     * @param lname - The last name of the customer.
     * @param phoneNo - The phone number of the customer.
     * @return Whether the customer could be added or not.
     */
    int addCustomer(String fname, String lname, String phoneNo);


    //---------------------------------------
    //	removeUser
    //---------------------------------------
    /**
     * This method attempts to remove a customer from the dealership<br>
     * @param customerID - The id of the customer.
     * @return (-1) if customer does not exist; 0 if removed.
     */
    int removeCustomer(int customerID);


    //---------------------------------------
    //	displayUserInfo
    //---------------------------------------
    /**
     * This method attempts to display the customer info on the screen<br>
     * @param customerID - The id of the customer.
     */
    void displayCustomerInfo(int customerID);


    //---------------------------------------
    //	displayAllUserIDs
    //---------------------------------------
    /**
     * This method displays all customerIDs by the screen<br>
     */
    void displayAllCustomerIDs();


    //---------------------------------------
    //	addBook
    //---------------------------------------
    /**
     * This method attempts to add a motorcycle to the dealership<br>
     * @param name - The name of the motorcycle.
     * @param size - The author of the item.
     * @param year - The year the item was release.
     * @param colour - The genre of the item.
     * @param price - The number of pages of the book.
     * @return The id of the motorcycle created.
     */
    int addMotorcycle(String name,
                int size,
                int year,
                String colour,
                double price
    );



    //---------------------------------------
    //	removeItem
    //---------------------------------------
    /**
     * This method attempts to remove a motorcycle from the dealership<br>
     * @param motoID - The id of the motorcycle.
     * @return Whether the item could be removed or not.
     */
    boolean removeMotorcycle(int motoID);




    //---------------------------------------
    //	displayAllMotoInfo
    //---------------------------------------
    /**
     * This method displays details of all motorcycles to the screen<br>
     */
    void displayAllMotoInfo();


}
