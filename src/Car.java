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
        int haveOil = checkEngine();
       if( haveFuel <= 0 ){
           on = false;
           System.out.println("It’s impossible to start the car without fuel.");

       } else if (haveOil <= 0) {
           on = false;
           System.out.println("It’s impossible to start the car without Oil.");
       } else{
           on = true;
           System.out.println("Vruuuum");
           System.out.println("The car is On now");
       }

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


    /**
     *  Private method that checks the car's Oil.
     *
     */
private int checkEngine(){
String CheckOil = oil <= 2?"The oil level is low " : "Oil temperature: 34ºC ";

    System.out.println(CheckOil);
    return oil;
}

    /**
     *  Set Oil in the car !
     * Max: 3
     */
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
