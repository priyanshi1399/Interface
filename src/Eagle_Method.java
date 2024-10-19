public class Eagle_Method implements Bird_MethodImplementation{

    @Override
    public void fly(){
        System.out.println("Eagle Fly Implementation");
    }

    @Override
    public void noOfLegs(){

    }

    //Overriding Method can not have more restrict access specifiers.
    //It can not have In interface we have public void fly()
    //method is public but in Eagle class
   // if we are writing Protected then it will not work.
   /* @Override
    public void fly(){

    }*/


}


