//
//
//
//	gravity.java
//	lab3
//	gravity.c converted into gravity.java
//		--updated to include user input
//
//


class Gravity{
		
	public static void main(String argv[]){
		
		// Declare Variables
		double velocity = 0;
		double distance = 0;
		double time = 10;
		
		// Get user input (time as a float value)
			


		// Compute the velocity
		velocity = 32.0 * time;
			
		// Compute the distance
		distance = 32 * time * time /2 ;
		
		
		// Print the result
		System.out.format("An object falling %4.2f feet in %4.2f seconds ", distance, time);
		System.out.format("is traveling %4.2f ft/sec\n", velocity);
		
		
	}

}


