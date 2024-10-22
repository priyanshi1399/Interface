@FunctionalInterface
public interface Consumer_Functional<T> {
    //It is the first type of  functional Interface
    //-represent an operation that accept a single imput parameter and returns no result

    //present in package: java.util.function;

  void accept( T t) ; //it is accepting one input parameter

  public static  void main(String [] args){

      //It is accepting Integer and not returning just processing
      Consumer_Functional<Integer> loggingObject=(Integer val)->{
          if(val>10){
              System.out.println("Logging");
          }
      };
      loggingObject.accept(11); //can access ...internally invoke pass 11
  }

}
