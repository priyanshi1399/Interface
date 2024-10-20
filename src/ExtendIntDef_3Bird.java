public interface ExtendIntDef_3Bird extends ExtendIntDef_3LivingThing {
    //It is providing its own implementation

    //This is kind of overriding
    //It can give its own implementation + it can also use the implementation of parent Interface and add certain more functionality.
    default  boolean canBreathe(){
        boolean canBreatheorNot= ExtendIntDef_3LivingThing.super.canBreathe();
        //using parent one
        return canBreatheorNot;
    }

    //it can add more functionality , or it can add totallynew functionality
}
