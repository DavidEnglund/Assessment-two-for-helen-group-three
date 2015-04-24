package assesment2group3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 041500784
 */
public class perDayRental {
   // gi ( that is probably spelt wrong) is not here and the one he did wasn't going to work with the main app so I 
    // am doing it again here
    
    // this is the total number of days the car has been rented for
    private int daysRented=0;
    // this is the cost to rent it per day
    private double costPerDay;
    
    //this is the init method that tells the class how much it will cost to rent per day
    public perDayRental(double cost){
        costPerDay = cost;
        
    }
    // this method just tells you how much it will cost to rent it for as many days as you give it
    public double getPricePerDay(int days){
        return costPerDay*days;
    }
    // this method tells you how many days total the car has been rented for
    public int getDaysRented(){
        return daysRented;
    }
    // this method rents the car for as many days given to it upping the total days rented and the return the cost
    public double rent(int days){
        daysRented+=days;
        return costPerDay*days;
    }
}
