public class Service {
    
    /**
     * declare variables
     */
    private double totalKM;
    private double lastServiceKM;
    private String message;
    private static double SERVICE_KILOMETER_LIMIT=100;
    
    /**
     * inicialization function parameters
     */
    public void setTotalKM(double totalKM) {
        this.totalKM = totalKM;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    /** constructor of this class*/
    public Service()
    {
        this.message = "The vehicle has not yet been serviced";
        this.lastServiceKM = 0;
    }
    
   /**
    * record function save the total kilometers of each car,
    * them put info about  whem was last services
    * them this function the difference between the total of kilometers of 
    * 
    * @param journey 
    */
    public void record(double journey)
    {
        this.totalKM = this.totalKM + journey;
        message =  "The vehicle was last serviced at "+ this.lastServiceKM;
        double average = this.totalKM - this.lastServiceKM;
        if(average>SERVICE_KILOMETER_LIMIT)
        {
            message = message + "\nError: Vehicle must be serviced first";
            this.lastServiceKM = this.totalKM;
        }
    }
    
}
