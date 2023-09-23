// Patryk Malinowski
// R00210173

import java.util.ArrayList;


//--------------------------------------------------
//
//	CLASS Customer
//
//--------------------------------------------------



/**
 * This class models a customer of the dealership.<br>.
 */
public class Customer extends Agent{

    //---------------------------------------
    //	Fields
    //---------------------------------------#
    private final String fName;
    private final String lName;
    private String phoneNo;
    private final ArrayList<Order> activeOrders;


    //---------------------------------------
    //	Constructor
    //---------------------------------------

    /**
     *Construcotr for the Customer class.
     *
     *  @param customerID The unique identifier for the customer.
     *  @param fName The first name of the customer.
     *  @param lName The last name of the customer.
     *  @param phoneNo The phone number of the customer.
     */
    public Customer(int customerID, String fName, String lName, String phoneNo) {
        super(customerID);
        this.fName = fName;
        this.lName = lName;
        this.phoneNo = phoneNo;
        this.activeOrders = new ArrayList<Order>();
    }




    //---------------------------------------
    //	GET METHODS
    //---------------------------------------
    /**
     * Getter method to retrieve the first name of the customer.
     *
     * @return The first name of the customer.
     */
    public String getFName(){
        return this.fName;
    }

    /**
     * Getter method to retrieve the last name of the customer.
     *
     * @return The last name of the customer.
     */

    public String getLName(){
        return this.lName;
    }

    /**
     * Getter method to retrieve the phone number of the customer.
     *
     * @return The phone number of the customer.
     */
    public String getPhoneNo(){
        return this.phoneNo;
    }



    //---------------------------------------
    //	getActiveOrders
    //---------------------------------------
    /**
     * Given a concrete customer (this), the function returns the active orders of the customer.<br>
     * @return The active orders of the customer.
     */
    public ArrayList<Order> getActiveOrders(){
        return this.activeOrders;
    }


    //---------------------------------------
    //	SET METHODS
    //---------------------------------------

    //---------------------------------------
    //	setPhoneNo
    //---------------------------------------
    /**
     * Sets the new phone number of the customer.
     * @param phoneNo The new phone number used to overwrite the old one
     */
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    //---------------------------------------
    //	EXTRA METHODS
    //---------------------------------------

    //---------------------------------------
    //	toString
    //---------------------------------------
    /**
     * Given a concrete user (this), the function overrides the Object method toString.<br>
     */
    public String toString(){
        // 1. We create the output variable
        String res;

        // 2. We append the user info
        res = "Customer ID: " + this.getCustomerId() + "\nFirst Name: " + this.fName + "\nLast Name: " + this.lName + "\nPhoneNo: " + this.phoneNo + "\n";

        // 3. We return res
        return res;
    }




    //---------------------------------------
    //	isCustomerInCustomersList
    //---------------------------------------
    /**
     * This method attempts to find it a user is in the usersList<br>
     * @param customerID - The id of the customer.
     * @param myList - The list of customers where we are looking for.
     * @return The index in myList where the agent with id is located at; (-1) if it is not in the list.
     */
    public static int isCustomerInCustomersList(int customerID, ArrayList<Customer> myList){
        // 1. We create the output variable
        int res = -1;

        // 2. We create the baseline from the id
        Agent baseline = new Agent(customerID);

        // 2. We search for the baseline in the list
        int size = myList.size();
        int index = 0;

        // 3. If we found the customerID in the list, we assign its index to res
        while ((res == -1) && (index < size)){
            if (baseline.equals(myList.get(index)))
                res = index;
            else
                index++;
        }

        // 4. We return res
        return res;
    }


}
