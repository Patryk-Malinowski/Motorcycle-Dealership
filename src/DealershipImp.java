// Patryk Malinowski
// R00210173

import java.util.ArrayList;


//--------------------------------------------------
//
//	CLASS DealershipImp
//
//--------------------------------------------------


/**
 * This class implements the interface Dealership.
 * representing the management of a dealership<br>.
 * We make the class final, to avoid any further class specialising it more.
 */
public final class DealershipImp implements Dealership {


    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final ArrayList<Customer> customersList;
    private final ArrayList<Motorcycle> motorcyclesList;

    private static int nextCustomerId = 1;
    private static int nextMotoId = 1;
    private static int nextOrderId = 1;


    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * The constructor creates 1 instance (1 object) of the class DealershipImp<br>
     */
    public DealershipImp(){
        // 1. We assume the Dealership does not have any customers or motorcycles
        this.customersList = new ArrayList<Customer>();
        this.motorcyclesList = new ArrayList<Motorcycle>();
    }



    //---------------------------------------
    //	addCustomer
    //---------------------------------------
    /**
     * This method attempts to add a Customer to the Dealership<br>
     * @param fname - The first name of the customer.
     * @param lname - The last name of the customer.
     * @param phoneNo - The phone number of the customer.
     * @return The id of the user created.
     */
    public int addCustomer(String fname, String lname, String phoneNo){
        // 1. We create the output variable
        int res = DealershipImp.nextCustomerId;

        // 2. We create the new customer object
        Customer newCustomer = new Customer(res, fname, lname, phoneNo);

        // 3. We add it to the customers list
        this.customersList.add(newCustomer);

        // 4. We increase the static variable of the class
        DealershipImp.nextCustomerId++;

        // 5. We return res
        return res;
    }



    //---------------------------------------
    //	removeCustomer
    //---------------------------------------
    /**
     * This method attempts to remove a user to the library<br>
     * @param customerID - The id of the customer.
     * @return (-1) if customer does not exist; 0 if removed.
     */
    public int removeCustomer(int customerID){
        // 1. We create the output variable
        int res = -1;

        // 2. We search for the customerID in the customersList
        int index = Customer.isCustomerInCustomersList(customerID, this.customersList);

        // 3. If the index is not -1
        if (index != -1){

            // 3.1. We remove the customer
                res = 0;
                this.customersList.remove(index);
            }

        // 4. We return res
        return res;
    }

    //---------------------------------------
    //	displayCustomerInfo
    //---------------------------------------
    /**
     * This method attempts to display the customer info by the screen<br>
     * @param customerID - The id of the customer.
     */
    public void displayCustomerInfo(int customerID) {
        // 1. We search for the customerID in the customersList
        int index = Customer.isCustomerInCustomersList(customerID, this.customersList);

        // 2. If the index is not -1
        if (index != -1){
            // 2.1. We get the user
            Customer myCustomer = this.customersList.get(index);

            // 2.2. We get the info
            String info = myCustomer.toString();

            // 2.3. We print the info
            System.out.println(info);
        }

        // 3. Otherwise, we inform that the customer id is not registered
        else
            System.out.println("Sorry, no customer is registered with id = " + customerID + " so the display customer info operation cannot proceed.");


    }

    //---------------------------------------
    //	displayCustomerInfo
    //---------------------------------------
    /**
     * This method attempts to display all the customerId's by the screen<br>
     */
    public void displayAllCustomerIDs() {
        System.out.println("---------------\n  Customer IDs\n---------------");
        for (Customer aux : this.customersList) {
            System.out.println(aux.getCustomerId());
        }
    }



    //---------------------------------------
    //	addMotorcycle
    //---------------------------------------
    /**
     * This method attempts to add a Customer to the Dealership<br>
     * @param name - The name of the motorcycle.
     * @param size - The size (cc) of the motorcycle.
     * @param year - The registered year of the motorcycle.
     * @param colour - The colour of the motorcycle.
     * @param price - The price (€) of the motorcycle.
     * @return The id of the motorcycle created.
     */
    public int addMotorcycle(String name, int size, int year, String colour, double price) {
        // 1. We create the output variable
        int res = DealershipImp.nextMotoId;

        // 2. We create the new book object
        Motorcycle newMoto = new Motorcycle(res, name, size, year, colour, price);

        // 3. We add it to the library list
        this.motorcyclesList.add(newMoto);

        // 4. We increase the static variable of the class
        DealershipImp.nextMotoId++;

        // 5. We return res
        return res;
    }



    //---------------------------------------
    //	removeMotorcycle
    //---------------------------------------
    /**
     * This method attempts to remove a motorcycle from the dealership<br>
     * @param motoID - The id of the Motorcycle.
     * @return Whether the item could be removed or not.
     */
    public boolean removeMotorcycle(int motoID) {
        // 1. We create the output variable
        boolean res = false;

        // 2. We search for the userID in the usersList
        int index = Motorcycle.isMotorcycleInMotorcyclesList(motoID, this.motorcyclesList);

        // 3. If the index is not -1
        if (index != -1){
            res = true;
            this.motorcyclesList.remove(index);
        }

        // 4. We return res
        return res;
    }


    //---------------------------------------
    //	displayAllMotoInfo
    //---------------------------------------
    /**
     * This method displays details of all motorcycles to the screen<br>
     */
    public void displayAllMotoInfo() {
        System.out.println("---------------\n  All Stock\n---------------");
        for (Motorcycle aux : this.motorcyclesList) {
            System.out.println("Moto ID: " + aux.getMotorcycleId());
            System.out.println("Name: " + aux.getMotorcycleName());
            System.out.println("Size (cc): " + aux.getMotorcycleSize());
            System.out.println("Colour: " + aux.getMotorcycleColour());
            System.out.println("Year: " + aux.getMotorcycleYear());
            System.out.printf("Price: €%.2f", aux.getMotorcyclePrice());
            System.out.println("\n\n");
        }
    }


    //---------------------------------------
    //	purchaseMotorcycle
    //---------------------------------------
    /**
     * This method attempts to order a motorcycle of the dealership<br>
     * @param customerID - The id of the customer ordering the motorcycle.
     * @param motoID - The id of the motorcycle to be ordered.
     * @return The id of the order being performed (-1 if not possible to order).
     */
    public int purchaseMotorcycle(int customerID, int motoID){
        // 1. We create the output variable
        int res = -1;

        // 2. We get the index of the user and the item in userList and itemsList
        int userIndex = Customer.isCustomerInCustomersList(customerID, this.customersList);
        if (userIndex == -1)
            System.out.println("Sorry, there is no customer with " + customerID + " in the CustomersList");

        int itemIndex = Motorcycle.isMotorcycleInMotorcyclesList(motoID, this.motorcyclesList);
        if (itemIndex == -1)
            System.out.println("Sorry, there is no motorcycle with " + motoID + " in the MotorcyclesList");

        // 3. If both customer and motorcycle exist, we need to ensure that:
        //    (a) the motorcycle is available
        if ((userIndex >= 0) && (itemIndex >= 0)) {
            // 3.1. We access to the user and item
            Customer myUser = this.customersList.get(userIndex);
            Motorcycle myItem = this.motorcyclesList.get(itemIndex);

            // 3.2. We check that the item is not borrowed
            Order itemCurrentlyOrdered = myItem.getCurrentlyOrdered();

            if (itemCurrentlyOrdered == null)
                res = auxPurchaseMotorcycle(myUser, myItem);
            else
                System.out.println("Sorry, the motorcycle with id " + motoID + " is already on an order.");
        }

        // 4. We return res
        return res;
    }


    //---------------------------------------
    //	auxPurchaseMotorcycle
    //---------------------------------------
    /**
     * This method proceeds with the ordering of the motorcycle<br>
     * @param myCustomer - The customer ordering the motorcycle.
     * @param myMoto - The motorcycle to be ordered.
     * @return The id of the borrow being performed.
     */
    private int auxPurchaseMotorcycle(Customer myCustomer, Motorcycle myMoto) {
        // 1. We create the output variable
        int res = DealershipImp.nextOrderId;

        // 2. We update the id
        DealershipImp.nextOrderId++;

        // 3. We create the order object
        Order myOrder = new Order(res,
                myCustomer.getCustomerId(),
                myMoto.getMotorcycleId()
        );

        // 4. We update the customer by adding the order to its active orders
        myCustomer.getActiveOrders().add(myOrder);

        // 5. We update the motorcycle by setting the order as its active order
        myMoto.setCurrentlyOrdered(myOrder);

        // 6. We return res
        return res;
    }


    //---------------------------------------
    //	cancelOrder
    //---------------------------------------
    /**
     * This method attempts to borrow an item of the library<br>
     * @param customerID - The id of the customer cancelling the motorcycle order.
     * @param motoID - The id of the motorcycle to cancel its order.
     * @return Whether the motorcycle order is successfully cancelled or not.
     */
    public boolean cancelOrder(int customerID, int motoID){
        // 1. We create the output variable
        boolean res = false;

        // 2. We get the index of the customer and the motorcycle in customersList and motorcyclesList
        int userIndex = Customer.isCustomerInCustomersList(customerID, this.customersList);
        if (userIndex == -1)
            System.out.println("Sorry, there is no user with " + customerID + " in the UsersList");

        int itemIndex = Motorcycle.isMotorcycleInMotorcyclesList(motoID, this.motorcyclesList);
        if (itemIndex == -1)
            System.out.println("Sorry, there is no item with " + motoID + " in the ItemsList");

        // 3. If both customer and motorcycle exist, we need to ensure that the customer has ordered the motorcycle
        if ((userIndex >= 0) && (itemIndex >= 0)){
            // 3.1. We access to the customer
            Customer myUser = this.customersList.get(userIndex);
            Motorcycle myItem = this.motorcyclesList.get(itemIndex);

            // 3.2. We search for the motorcycle in its orders list
            ArrayList<Order> orderList = myUser.getActiveOrders();
            int index = Order.isMotorcycleInPurchasedList(motoID, orderList);

            // 3.3. If the conditions are met, we proceed to cancel the motorcycle order.
            if (index != -1) {
                // I. We set res to true
                res = true;

                // II. We remove the order from the customer
                orderList.remove(index);

                // III. We set the motorcycle to not currently ordered
                myItem.setCurrentlyOrdered(null);
            }
            else
                System.out.println("Sorry, the customer with id " + customerID + " did not have the motorcycle with id " + motoID + " on order");
        }

        // 4. We return res
        return res;
    }

}

