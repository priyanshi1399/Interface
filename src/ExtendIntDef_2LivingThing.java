public interface ExtendIntDef_2LivingThing {
    //Exaple of How to Extend Interface if it uses Default Method
    //This is the 2nd Way of Extending Interface if it uses Default Method
    //involves ExtendIntDef_2Bird Interface, ExtendIntDef_2Eagle Class
    default boolean canBreathe(){
        return true;
    }

}
