//@FunctionalInterface
/*public interface UseCase1_FunextendNonFunOther extends UseCase1_FunextendNonFun {

    void canFly(String val);
    //here it will show error
    // because of extend one other abstract method of other interface is  also included so it can have 2 abstract
    //so shows error to overcome this we have to make other parent one method default then it is ok
    //check in UseCase1Sol_FunextendNonFun
}
*/

//here is the Solution of above error-

@FunctionalInterface
public interface UseCase1_FunextendNonFunOther extends UseCase1Sol_FunextendNonFun{

    void canFly(String val);
    //we have made in UseCase1Sol_FunextendNonFunOther mathod default
}