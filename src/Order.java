// Patryk Malinowski
// R00210173

import java.util.ArrayList;


//--------------------------------------------------
//
//	CLASS Order
//
//--------------------------------------------------


/**
 * This class models an order for the dealership<br>.
 */
public class Order {

    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final int orderID;
    private final int customerID;
    private final int motoID;

    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * The constructor creates 1 instance (1 object) of the class Order<br>
     * @param orderID - The ID of the order.
     * @param customerID - The ID of the customer.
     * @param motoID - The ID of the motorcycle.
     */
    public Order(int orderID, int customerID, int motoID) {
        // 1. We initialise the fields
        this.orderID = orderID;
        this.customerID = customerID;
        this.motoID = motoID;
    }


    //---------------------------------------
    //	GET METHODS
    //---------------------------------------


    //---------------------------------------
    //	getItemID
    //---------------------------------------
    /**
     * Given a concrete order (this), the function returns the id of its motorcycle.<br>
     * @return The id of the motorcycle.
     */
    public int getMotoID(){
        return this.motoID;
    }


    //---------------------------------------
    //	EXTRA METHODS
    //---------------------------------------


    //---------------------------------------
    //	toString
    //---------------------------------------
    /**
     * Given a concrete order (this), the function overrides the Object method toString.<br>
     */
    public String toString(){
        // 1. We create the output variable
        String res;

        // 2. We append the borrow info
        res = "" + this.orderID + "\t" + this.customerID + "\t" + this.motoID + "\n";

        // 3. We return res
        return res;
    }


    //---------------------------------------
    //	isMotorcycleInPurchasedList
    //---------------------------------------
    /**
     * This method attempts to find it an item is in the purchasedList<br>
     * @param motoID - The id of the motorcycle.
     * @param myList - The list of orders where we are looking.
     * @return The index in myList where the agent with id is located at; (-1) if it is not in the list.
     */
    public static int isMotorcycleInPurchasedList(int motoID, ArrayList<Order> myList){
        // 1. We create the output variable
        int res = -1;

        // 2. We search for the motorcycle in the list
        int size = myList.size();
        int index = 0;

        // 3. If we found the motoID in the list, we assign its index to res
        while ((res == -1) && (index < size)){
            if (myList.get(index).getMotoID() == motoID)
                res = index;
            else
                index++;
        }

        // 4. We return res
        return res;
    }





}
