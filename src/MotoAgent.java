// Patryk Malinowski
// R00210173


//--------------------------------------------------
//
// CLASS MotoAgent
//
//--------------------------------------------------
/**
 * Our superclass for the A03 Project
 * representing all the agents (motorcycles)
 * for managing the dealership <br>.
 */
public class MotoAgent {

    //---------------------------------------
    //	Fields
    //---------------------------------------
    private final int motoId;


    //---------------------------------------
    //	Constructor
    //---------------------------------------

    /**
     * The constructor creates 1 instance (1 object) of the class MotoAgent<br>
     * @param motoId - The ID of the agent.
     */
    public MotoAgent(int motoId) {
        // 1. We initialise the fields
        this.motoId = motoId;
    }


    //---------------------------------------
    //	GET METHODS
    //---------------------------------------
    //---------------------------------------
    //	getCustomerId
    //---------------------------------------
    /**
     * Given a concrete agent (this), the function returns its motoId.<br>
     * We make the method final, to avoid the subclasses to override it.
     * @return The id of the agent.
     */
    public final int getMotorcycleId(){
        return this.motoId;
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
    public boolean equals(MotoAgent o) {
        return this.motoId == o.motoId;
    }


}
