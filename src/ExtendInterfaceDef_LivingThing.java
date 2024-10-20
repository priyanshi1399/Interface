public interface ExtendInterfaceDef_LivingThing {
    //Exaple of How to Extend Interface if it uses Default Method
    //This is the 1st Way of Extending Interface if it uses Default Method
    default boolean canBreathe(){
        return true;
    }

    public static void main(String [] args){
        ExtendInterfaceDef_Eagle eagleObj=new ExtendInterfaceDef_Eagle();
        eagleObj.canBreathe();

        //So it will be directly accessible

    }
}

// involves ExtendInterfaceDef_Bird Interface, ExtendInterfaceDef_Eagle Class