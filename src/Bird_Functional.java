//Functional interface that has one abstract method
//IT is also know as SAM->Single abstract method
//functional interface restrict you to add only one abstract Method

@FunctionalInterface
public interface Bird_Functional {
    void canSwim();
}
//If I will try to add one other abstract method then it will throw error


//public interface Bird{
//void canFly(String val);
//}

//This is also known as functional interface but now in first interface you try to add other
//abstract it will give error but here in second it will not give
//Functional Interface keyword use-when you have to restrict.


