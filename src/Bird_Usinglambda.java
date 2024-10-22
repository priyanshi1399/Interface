public interface Bird_Usinglambda {

    void canFly(String val);
    //here we will see its implementation that main advantage is to reduce the verbose
    //bcz for one abstract method there is no need for providing method name for implementation.
    //it tries to reduce the Verbose

    public static  void main(String [] args){

        Bird_Usinglambda eagleObject=(String value)->{
            System.out.println("Eagle Bird Implementation");
        };
  //here -> is the operator the { }
        eagleObject.canFly("Vertical");
    }

}

//if you have one line then block not required

/*
Bird_Usinglambda eagleObject=()->System.out.println("Eagle Bird Implementation");
//here we don't need block also
 */