@FunctionalInterface
public interface Bird1_FunctionalExample {

    void canFly(String val);

    default void getHeight(){

    }

    static void canEat(){

    }

    String toString(); //Object class method
}
//Each class is object of parent..method present in abstract class like toString() thses all
//not considered as abstract.

//because whatever you make Interface and you have defined object method
//then the class which is implementing that interface dosent have to implement thsi method.
//bcz each class is the extending the Object class.
//check in testInterface and TestClassImplementation for Understanding..