public class EarthVolume {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378;
		
		// Radius of Earth in Miles
		double radiusMiles = radiusKm * 0.621371;


        // Volume in kilometers3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Volume in Miles3
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Output the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " +volumeMiles3 ); 
    }
}
