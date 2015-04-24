package Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 041501218
 */
public class PerKmRental {
    //setting variables.these are all i need. stop trying to make it more comlpicated thom
    private final double CostPerKilometer;
    private double TotalKmRented;
    /*
    *saying that when there is no other value given cost per vehicle defaults to 1
    *
    * rent the car for x km
    */
    
    public PerKmRental(double cost)
    {
        this.CostPerKilometer = cost;
    }

    public double getCostPerKilometer(int km) 
    {//return: cost of renting. This is a quote for an estimated price.
        //the calculation for the costperkilometer.
        return CostPerKilometer*km;
    }
    
    public double getRentedKm()
    {//tells how many km has been rented for in total.
        return TotalKmRented;
    }
   
    public void RentedKmJourney(int journey)
    {//return: distance in one rental drive. This records that the vehicle has been rented (and can't overlap for the same day).
       TotalKmRented += journey;
    }
}
