public class Car {
    boolean on = false;
    int fuel;

    public void isOn() {
        on = true;
        System.out.println("Vruuuuum");
        System.out.println("The car is On now");
        checkFuel();
    }

    public void setFuel(int newFuel) {
        fuel = newFuel;
    }

    private void checkFuel() {
        if (fuel <= 15) {
            System.out.println("The gasoline is running out " + fuel + " Liter! ");
        }
    }


}
