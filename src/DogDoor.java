public class DogDoor
{
    private boolean open;


    public DogDoor()
    {
        this.open =false;
    }
    public void open()
    {
        System.out.println("the door is open");
        open=true;
    }
    public void close()
    {
        System.out.println("the door is closed");
        open =false;
    }
    public boolean isOpen()
    {
        return open;
    }
}
