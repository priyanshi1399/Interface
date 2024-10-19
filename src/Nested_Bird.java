public interface Nested_Bird {
    //Interface within Interface

    public void canFly();

    public interface NonFlyingBird{

        public void canRun();
    }

    public static  void main(String[] args){

        Nested_Bird.NonFlyingBird obj=new NestedEagle2();
        obj.canRun();
    }
}
//Check in NestedEagle1 & NestedEagle2-->nested from parent/  child with example
//if we want to implement it from both the classes parent and Child->CombinedNestedEagle Class
//Interface can hold the Object so making NestedEagle2 child obj holds by interface