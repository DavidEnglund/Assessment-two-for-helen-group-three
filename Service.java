public class Service {
    
    private int lastService=0;
    private int serviceCount=0;
    
// return the last service
    public int getLastService()
    {
        return this.lastService;
    }

    // return how many services the car has got
    public int getServiceCout()
    {
        return this.serviceCount;
    }
    
    /**
     * the function recordServices expect the distance of each car, them it save in lastService and increase serviceCount
     * @param distance 
     */
    public void recordServices(int distance)
    {
        this.lastService = distance;
        this.serviceCount ++;
    }
    
}
