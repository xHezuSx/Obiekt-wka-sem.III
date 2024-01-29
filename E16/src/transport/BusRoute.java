package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if (routeNumber == null || routeNumber.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
    boolean isLongRoute(){
        return routeNumber.length() > 4;
    }
    void printDetails(){
        System.out.println(routeNumber+": "+startLocation+" -> "+endLocation);
    }
}
