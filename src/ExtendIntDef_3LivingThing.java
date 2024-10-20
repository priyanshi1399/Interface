public interface ExtendIntDef_3LivingThing {
    //Example of How to Extend Interface if it uses Default Method
    //This is the 3rd Way of Extending Interface if it uses Default Method
    //involves ExtendIntDef_3Bird Interface, ExtendIntDef_3Eagle Class

    default boolean canBreathe(){
        return true;
    }
}
