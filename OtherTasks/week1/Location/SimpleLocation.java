public class SimpleLocation {
    public double latitude;
    public double longitude;
    
    public SimpleLocation(double lat, double lon) {
        this.latitude = lat;
        this. longitude = lon;
    
    }
    
    public SimpleLocation() {
        this.latitude = 32.9;
        this.longitude = -117.2;
    }
    
    public double distance (SimpleLocation other){
        return this.latitude + other.latitude;
                //this.longitude + other.longitude;
        
    }
}