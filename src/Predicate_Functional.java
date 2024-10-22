@FunctionalInterface
public interface Predicate_Functional <T>{

    //Represent the function ,that accepts one argument and returns a boolean

    //present ib package-java.util.function;

    boolean test(T t);


    public static  void main(String [] args){

        Predicate_Functional<Integer> isEven=(Integer val)->{
            if(val%2==0){
                return true;
            }
            else{
                return false;
            }
        };
        System.out.println(isEven.test(11));
    }
}

//Apart from thses oif you require any thing then mak one itherwise use it.