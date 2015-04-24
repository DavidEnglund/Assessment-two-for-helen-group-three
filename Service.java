public class Service {
    
    /**
     * declare variables
     */
    private int totalKM;
    private int lastServiceKM;
    private String message;
    
    /**
     * function parameters
     */

    public String getMessage() {
        return message;
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
    public void record(int distance, int service_kilometer_limit)
    {
        //fisrtly the program save the distance, every time this function is called, always sum distance.
        this.totalKM = this.totalKM + distance;
        // then its show when was last service
        message =  "The vehicle was last serviced at "+ this.lastServiceKM;
        // secondly the program calculate if the car need a service, it take the total kilometers less the last service.
        int diference = this.totalKM - this.lastServiceKM;
        // then if the diference between total kilometres and last service is more than kilometer limit.
        if(diference>service_kilometer_limit)
        {
            // show a message where it warn the car must need to be service before to use.
            message = message + "\nError: Vehicle must be serviced first";
            // finally the last service value is restart with the total kilometres the car has when show a alarm the program.
            this.lastServiceKM = this.totalKM;
        }
    }
    
}
