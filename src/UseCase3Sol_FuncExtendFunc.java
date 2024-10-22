
@FunctionalInterface
public interface UseCase3Sol_FuncExtendFunc extends UseCase3_FuncExtendFunc {

    //this can override it
    //if both has same method
    //by default public boolean Breathe like this is being overriden So its allowed
    boolean canBreathe();
    //to access it check main of UseCase3_FuncExtendFunc
}
