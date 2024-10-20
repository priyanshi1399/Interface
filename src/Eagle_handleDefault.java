public class Eagle_handleDefault implements Bird_HandleDefault,LivingThing_HandleDefault {

    //here 2 interface are implemented by class

    //they have default same method in them (in interfaces)
    //So we need to provide the implementation here like below
    //because which object it will call when we create object of it issue generated.
    public boolean canBreathe(){
        return true;
    }


}
