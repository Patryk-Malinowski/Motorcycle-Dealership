// Patryk Malinowski
// R00210173


//--------------------------------------------------
//
// CLASS Agent
//
//--------------------------------------------------
/**
 * Our superclass for the A03 Project
 * representing all the agents (customers)
 * for managing the dealership <br>.
 */
public class Agent {

    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final int customerId;


    //---------------------------------------
    //	Constructor
    //---------------------------------------

    /**
     * The constructor creates 1 instance (1 object) of the class Agent<br>
     * @param customerId - The ID of the agent.
     */
    public Agent(int customerId) {
        // 1. We initialise the fields
        this.customerId = customerId;
    }


    //---------------------------------------
    //	GET METHODS
    //---------------------------------------
    //---------------------------------------
    //	getCustomerId
    //---------------------------------------
    /**
     * Given a concrete agent (this), the function returns its customerId.<br>
     * We make the method final, to avoid the subclasses to override it.
     * @return The id of the agent.
     */
    public final int getCustomerId(){
        return this.customerId;
    }

    //---------------------------------------
    //	SET METHODS
    //---------------------------------------



    //---------------------------------------
    //	EXTRA METHODS
    //---------------------------------------



    //---------------------------------------
    //	equals
    //---------------------------------------
    /**
     * Given a concrete agent (this), the function overrides the Object method equals.<br>
     * @param o - The other agent we want to compare 'this' to.
     * @return - Whether 'this' and 'o' are equal.
     */
    public boolean equals(Agent o) {
        return this.customerId == o.customerId;
    }


}
