//Diego Davila 
//September 3, 2014
//CSE2
//lab02-Cyclometer
//Purpose: 
//Bycicle Cyclometer records time in seconds
//and number of rotations of front wheel in that time.
//Use this data to:
    //a. Print the number of minutes for each trip
    //b. Print the number of counts for each trip
    //c. Print the distance of each trip in miles
    //d. Print the distance for the two trips combined

//Class:
public class Cyclometer{
    
    //Main method requiered for every Java program:
    public static void main(String[] args) {
        
        int secsTrip1=480;    //time in seconds for Trip 1
        int secsTrip2=3220;   //time in seconds for Trip 2
        int countsTrip1=1561; //number of rotations of front wheel in Trip1
        int countsTrip2=9037; //number of rotations of front wheelin Trip2
        
        double wheelDiameter=27.0, //Diameter of front wheel
        PI=3.14159, //Numerical value of pi
        feetPerMile=5280, //Number of feet in one mile
        inchesPerFoot=12, //Number of inches in one foot
        secondsPerMinute=60; //Number of seconds in one minute
        double distanceTrip1, distanceTrip2,totalDistance; 
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)
            + " minutes and had " + (countsTrip1) + " counts");
         System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute)
            + " minutes and had " + (countsTrip2) + " counts");
        
        //Calculations:
        //Distance: Counts x Diameter x Pi (Counts x Circumpherence)
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //Distance traveled in inches for Trip1 
        distanceTrip1/=inchesPerFoot*feetPerMile;   //Distance in miles for Trip1
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Distance in miles for Trip2
        totalDistance=distanceTrip1+distanceTrip2; //Total distance (adding both trips)
        
        System.out.println("Trip 1 was " +distanceTrip1+ " miles");
        System.out.println("Trip 2 was " +distanceTrip2+ " miles");
        System.out.println("The total distance was " +totalDistance+ " miles");
        
        
        
    } //end of main method
}//end of class