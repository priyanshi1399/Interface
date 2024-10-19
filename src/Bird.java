public interface Bird {

    public void fly();

    public static void main(String [] args){
        //we can't create Object of Interface but we can create object of class
        //as interface is a data type it holds the reference in it

        Bird birdObject1=new Eagle();
        Bird birdObject2=new Hen();
        birdObject1.fly(); //it will call Eagle's fly method at runtime.
        birdObject2.fly(); //it will call hen's fly method at run time
    }
}


//It can be default or public and comma seperated interface extending interface not class
//see in Non-FlyingBird

//check the implementation of interface with classes in Hen and Eagle class

//So it is advantage Polymorphism can be achieved.
