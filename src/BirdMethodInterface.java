public interface BirdMethodInterface {

    void fly();

    public void hasBeak();

    //can not be final beacuse by putting final it can not be overriden in child class
    //but here it is declared only it has to be implemented in child class .So method in interface can not be final.
}
