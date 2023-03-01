public class DogDoorSimulator
{
    public static void main(String[] args)
    {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        remote.pressButton();
        System.out.println("Fido's has done ...");
        remote.pressButton();
        System.out.println("Fido's back inside ..");
        remote.pressButton();
    }
}

