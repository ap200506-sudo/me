class RideSharingSystem {
    Queue <Integer> rider;
    Queue <Integer> driver;

    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>();
        
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
        
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
        
    }
    
    public int[] matchDriverWithRider() {
        if(rider.isEmpty() || driver.isEmpty()){
            return new int []{-1,-1};
        }
        int driverId = driver.poll();
        int riderId = rider.poll();

        return new int[]{driverId, riderId};
        
    }
    
    public void cancelRider(int riderId) {
        rider.remove(riderId);
        
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */