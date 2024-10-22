@FunctionalInterface
public interface Supplier_Functional<T> {
    T get();
    //use supplier when you dont want to pass input parameter and you want something out of that


    public class Main{
        public static void main(String[] args) {
            Supplier_Functional<String> isEvenNumber = () -> "this is the data I am returning";

            System.out.println(isEvenNumber.get());
        }
    }
}

//OR below one is also correct
/*
public static void main(String[] args) {
            Supplier_Functional<String> isEvenNumber = () -> {
            return "this is the data I am returning";
};
            System.out.println(isEvenNumber.get());
        }

 */

