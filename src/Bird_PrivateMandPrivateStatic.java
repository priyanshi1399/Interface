public interface Bird_PrivateMandPrivateStatic {
    //This  is java 9 feature
    //Static method is public which in java 8 but in Java 9 there is Private static method available
    //we can provide the implementation of method but as a private access modifier in interface

    //we can not access it outside this interface ..only default and static can access it.
    void canFly(); //abstract //this is equivalent to public abstract void canFly()

    //for abstract can't provide implementation
    //ajav 8 feature
    public default void minimumFlyinhheight(){ //default method
        myStaticPublicMethod();//calling static method
        myPrivateMethod();//private method
        myPrivateStaticMethod(); //private static method
    }

    //java 8 feature
    static void myStaticPublicMethod(){
        myPrivateStaticMethod(); //from static we can call static method only

    }

    //java 9 feature
    private void myPrivateMethod(){
        //private method implementation

    }

    //java 9 feature
    private static void myPrivateStaticMethod(){
        //private static method implementation
    }
}
//why private method
//increase readibilty code
//multiple default method shares some code then can help
//suppose 5 default method and they have 80 % similar code base so it will be lot of code duplication
//80% code take in private and 20% write their own

//private can be define static and non static both
//ex of last method it can be normal private also


//non static can access both static and non static
//static can access static only
//Private interface method can not be abstract
//abstract method can be only public