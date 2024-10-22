@FunctionalInterface
public interface Function_Functional<T,R> {
    //Represent that accepts one
    //argument passes it and and produce a result

    R apply(T t ); //T is argument R is return Type


        public static void  main(String [] args){
            Function_Functional<Integer,String> integerToString=
                    (Integer num)->{
                String output=num.toString();
                return output;
                    };

            integerToString.apply(64);
        }

    }

