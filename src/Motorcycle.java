// Patryk Malinowski
// R00210173

import java.util.ArrayList;


//--------------------------------------------------
//
//	CLASS Motorcycle
//
//--------------------------------------------------


/**
 * This class models a motorcycle in the stock list of the dealership.<br>.
 */
public class Motorcycle extends MotoAgent{

    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final String name;
    private final int size;
    private final int year;
    private final String colour;
    private final double price;
    private Order currentlyOrdered;


    //---------------------------------------
    //	Constructor
    //---------------------------------------
    /**
     * Constructor for the Motorcycle class.
     *
     * @param motoId   The unique identifier for the motorcycle.
     * @param name     The name of the motorcycle.
     * @param size     The size (cc) of the motorcycle.
     * @param year     The registered year of the motorcycle.
     * @param colour   The color of the motorcycle.
     * @param price    The price (€) of the motorcycle.
     */
    public Motorcycle(int motoId, String name, int size, int year, String colour, double price) {
        super(motoId);
        this.name = name;
        this.size = size;
        this.year = year;
        this.colour = colour;
        this.price = price;

        // 3. The item is not borrowed
        this.currentlyOrdered = null;
    }




    //---------------------------------------
    //	GET METHODS
    //---------------------------------------

    /**
     * Getter method to retrieve the name of the motorcycle.
     *
     * @return The name of the motorcycle.
     */
    public final String getMotorcycleName(){
        return this.name;
    }

    /**
     * Getter method to retrieve the size (cc) of the motorcycle.
     *
     * @return The size (cc) of the motorcycle.
     */

    public final int getMotorcycleSize(){
        return this.size;
    }

    /**
     * Getter method to retrieve the registered year of the motorcycle.
     *
     * @return The registered year of the motorcycle.
     */
    public final int getMotorcycleYear(){
        return this.year;
    }

    /**
     * Getter method to retrieve the color of the motorcycle.
     *
     * @return The color of the motorcycle.
     */
    public final String getMotorcycleColour(){
        return this.colour;
    }

    /**
     * Getter method to retrieve the price (€) of the motorcycle.
     *
     * @return The price (€) of the motorcycle.
     */
    public final double getMotorcyclePrice(){
        return this.price;
    }



    //---------------------------------------
    //	getCurrentlyOrdered
    //---------------------------------------
    /**
     * Given a concrete motorcycle (this), the function returns the order object it is associated to (null if not currently on an existing order).<br>
     * @return The order object it is associated to (null if not currently on an existing order).
     */
    public Order getCurrentlyOrdered(){ return this.currentlyOrdered; }

    //---------------------------------------
    //	SET METHODS
    //---------------------------------------

    //---------------------------------------
    //	setCurrentlyOrdered
    //---------------------------------------
    /**
     * Given a concrete motorcycle (this), the function updates its order object.<br>
     * @param newOrder - The new order object to be associated to the motorcycle.
     */
    public void setCurrentlyOrdered(Order newOrder){ this.currentlyOrdered = newOrder; }

    //---------------------------------------
    //	EXTRA METHODS
    //---------------------------------------



    //---------------------------------------
    //	isMotorcycleInMotorcyclesList
    //---------------------------------------
    /**
     * This method attempts to find a motorcycle is in the motorcyclesList<br>
     * @param motoID - The id of the motorcycle.
     * @param myList - The list of motorcycles where we are looking for.
     * @return The index in myList where the agent with id is located at; (-1) if it is not in the list.
     */
    public static int isMotorcycleInMotorcyclesList(int motoID, ArrayList<Motorcycle> myList){
        // 1. We create the output variable
        int res = -1;

        // 2. We create the baseline from the id
        MotoAgent baseline = new MotoAgent(motoID);

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
