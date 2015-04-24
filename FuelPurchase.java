package assesment2group3;

// I am going to add a totla fuel litres and cost so i can work out 
// fuel economy by that as well as adding method to buy fuel
public class FuelPurchase {
	private double	fuelEconomy;
        private double litres = 0;
        private double cost = 0;
	public FuelPurchase(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}

	public double getFuelEconomy() {
		return fuelEconomy;
            //return this.cost / this.litres;
	}
        
        public double getFuel(){
            return this.litres;
        }

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy;
	}
        public void purchaseFuel(double amount,double price){
            this.litres += amount;
            this.cost += price;
        }
}
