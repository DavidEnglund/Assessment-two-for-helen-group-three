package assesment2group3;
import java.text.DecimalFormat;

 
public class Vehicle {
	private String	manufacturer;
	private String	model;
	private int	makeYear;

	private Journey	journey;
        private service serv;
	private perDayRental dayrent;
        private PerKmRental kmrent;
        
	//@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;

	/** 
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
                serv = new service(100);
                dayrent = new perDayRental(39.95);
                kmrent = new PerKmRental(2.50);
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
                serv = new service(1000);
                dayrent = new perDayRental(39.95);
                kmrent = new PerKmRental(2.50);
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Vehicle: " + makeYear + " " + manufacturer + " " + model);
		//System.out.println("Model: " + model);
		//System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers() + " using " + new DecimalFormat("#.00").format(fuelPurchase.getFuel()) + " litres of fuel");
		System.out.println("This vehicle has had its last service at: " + serv.getLastService() + "KM it's due for a service at " + (serv.getLastService()+serv.getServiceLimit()) + "KM");
                System.out.println(" this vehicle has a fuel economy of: " + new DecimalFormat("#0.00").format(fuelPurchase.getFuel()/ journey.getKilometers()) + " litres per KM");
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}
        // adds fule to the cars record
        public void addFuel(double litres, double price){
            
            fuelPurchase.purchaseFuel(litres, price);
        }
        
        // add a service to the vehicle
       
        public void addService(){
            int record = (int)journey.getKilometers();
           serv.recordService(record);
        }
        // rent per day method that checks if the car has been serviced recently and will stop it form being reneted if it was
        // returns price of rental
        public void rentPerDay(int days){
            // if the last service + service limit is more than total km's traveld dont hire and tell user sorry
            // other wis call the hire method form the rentperday class
            if(serv.getLastService()<serv.getServiceLimit()+journey.getKilometers()){
                System.out.println("You have rented this vehicle for " + days + " days costing: " + new DecimalFormat("#0.00").format(dayrent.rent(days)));
            }
        }
        
        //pretty much what the rent per day does but per KM 
        public void rentPerKM(int km){
             // if the last service + service limit is more than total km's traveld dont hire and tell user sorry
            // other wis call the hire method form the rentperkm class
            if(serv.getLastService()<serv.getServiceLimit()+journey.getKilometers()){
                kmrent.RentedKmJourney(km);
                System.out.println("You have rented this vehicle for " + kmrent.getRentedKm() + " days costing: " + new DecimalFormat("#0.00").format(kmrent.getCostPerKilometer(km)));
            }
        }

}
