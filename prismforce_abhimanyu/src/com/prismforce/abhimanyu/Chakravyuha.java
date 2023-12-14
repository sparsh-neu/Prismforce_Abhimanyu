/**
 * 
 */
package com.prismforce.abhimanyu;

import java.util.Random;

/**
 * @author sparshsinha
 *
 */
public class Chakravyuha {

	static void battle (int power, int a, int b) {
		
		Random rd = new Random(); // creating Random object
	    int[] k = new int[11];
	      
	    for (int i = 0; i < k.length; i++) 
	    	k[i] = 1 + rd.nextInt(100); // Creating 11 circles of random powers between 1 and 100
	      
	    
	      
    	System.out.println("Abhimanyu's initial power -> " + power);
		System.out.println("Number of times Abhimanyu can skip fighting enemies -> " + a);
		System.out.println("Number of times Abhimanyu can recharge -> " + b);
  
		System.out.println("Power of every enemy:");
		
		for (int i = 0; i < k.length; i++) 
	    	System.out.println(k[i]); 
		
		int f= 0;
		int p = power;
		int l = 0;
		
		for (int i = 0; i < k.length; i++) {
			if (i == 3 || i ==7) { 
				k[i-1] = k[i-1]/2; // k3 and k7 enemies are endured with power to regenerate themselves once with half of their initial power and can attack Abhimanyu from behind if he is battling in iteratively next circle
				p = p - k[i-1];
			}
			
			if (p >= k[i]) {
				p = p - k[i];
			}
			else if (p < k[i] && a != 0) { // Satisfying the fight skipping scenario
				a--;
			}
			else if (p < k[i] && b != 0) { // Satisfying the re-charge scenario
				p = power;
				b--;
			}
			else {
				f = 1; // Abhimanyu loses
				l = i + 1; // Level at which Abhimanyu loses
				break;
			}
		}
		
		if (f == 0)
			System.out.println("\nYES !! Abhimanyu will make out of Chakravyuha and reach the Pandavas army");
		else
			System.out.println("\nNO !! Abhimanyu will not make out of Chakravyuha and will be deateated at Level - " + l);
	}
}
