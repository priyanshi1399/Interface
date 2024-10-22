@FunctionalInterface
public interface UseCase3_FuncExtendFunc {
    //This is Usecase 3 when functional Interface extending Other Functional Interface

    public boolean canBreathe();

    //Check in UseCase3_FuncExtendFuncOther Interface

    public static void  main(String [] args){

        UseCase3_FuncExtendFunc obj1=()->true;

        System.out.println(obj1.canBreathe());
    }
}
