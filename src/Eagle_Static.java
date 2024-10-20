public class Eagle_Static implements  Bird_Static {

    public void  digestiveSystemTestMethod(){
        if(Bird_Static.canBreathe()){

            //do something

            //It can use it by creating method  but static method can not be overriden by class
            //we can just use it ..making method and using it
            //Eagle can not override it
            //access with Bird_Static.canBreathe.
        }
    }
}


//Why can't we make stream default why not static
//static can not be overriden but there are many classes they have overriden it
//default is possible to override but static we can't override it.