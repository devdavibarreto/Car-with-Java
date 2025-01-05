/**
 *  This is the general Car class containing its components and everyday functions. Cool, right? How about testing it?
 */
public class Car {
    boolean on = false;
    int fuel;
    int oil;

    /**
     *  Turn On the car !
     */
    public void isOn() {
        int haveFuel = checkFuel();
       if( haveFuel <= 0){
           on = false;
           System.out.println("It’s impossible to start the car without fuel.");

       }else{
           on = true;
           System.out.println("Vruuuuum");
           System.out.println("The car is On now");
       }
        checkEngine();
    }

    /**
     *  Set Fuel in the car !
     *  Max = 40
     */
    public void setFuel(int newFuel) {
        if(newFuel > 41){
            System.out.println("Quantity greater than allowed");
        }else {
            fuel = newFuel;
        }

    }

    /**
     *  Private method that checks the car's fuel.
     *
     */
    private int checkFuel() {
        if (fuel <= 15) {

            System.out.println("The gasoline is running out " + fuel + " Liter! ");
        }
        return fuel;
    }


private void checkEngine(){
String CheckOil = oil <= 2?"The oil level is low " : "Oil temperature: 34ºC ";

    System.out.println(CheckOil);
}

public void setOil(int oilNew){
        if (oilNew > 3){
            System.out.println("Quantity above the allowed limit.");
        } else if (oilNew == 0) {
            System.out.println("The oil level is Zero");
        } else {
            oil = oilNew;
            System.out.println("Oil temperature: 34ºC ");
        }

}
}
