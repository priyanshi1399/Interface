public interface DefaultUse_Bird {

    public void canFly();

    default int getMinimumFlyHeight(){
        return 100;
        //here we dont have to implement it in child
    }


   public static void main(String [] args){
        DEfaultUse_Eagle eagleObj=new DEfaultUse_Eagle();
        eagleObj.getMinimumFlyHeight(); //able to call it
   }
}

//if any new method requirement comes then normally
// both child classes DefaultUse_eagle & DefaultUse_Sparrow has  to implement it.

//this is disadvantage of Interface.

//To overcome this default keyword used.

//comes at the stream() introduced because it was introduced in Interface and there are so many
//classes which implement collection Interface so to avoid tis Uses default keyword.

//here also concept is same.

//With the use of default keyword  you dont have to implement it in child classes you have to provide implementation in interface parent.

