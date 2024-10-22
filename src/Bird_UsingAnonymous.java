@FunctionalInterface
public interface Bird_UsingAnonymous {

    void canFly(String val);

    public static void main(String [] args) {

        Bird_UsingAnonymous eagleObject = new Bird_UsingAnonymous() {
            //eagleObject interbnally it will create a class random name then implements Bird
            //known as Anonymous Class
            @Override
            public void canFly(String val) {
                System.out.println("Eagle Bird Implementation");
            }
        };

        eagleObject.canFly("Vertical"); //we can access here
    }


}
