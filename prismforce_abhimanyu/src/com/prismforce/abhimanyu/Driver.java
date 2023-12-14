/**
 * 
 */
package com.prismforce.abhimanyu;

/**
 * @author sparshsinha
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CASE 1:\n");
		Chakravyuha.battle(30, 1, 2); // Test Case 1
		System.out.println("\n\n=====================================================================================\n\n");
		System.out.println("CASE 2:\n");
		Chakravyuha.battle(110, 4, 2); // Test Case 2
	}

}


/*
 * 
 * OUTPUT for 2 cases: 
 * 
 * CASE 1:

Abhimanyu's initial power -> 30
Number of times Abhimanyu can skip fighting enemies -> 1
Number of times Abhimanyu can recharge -> 2
Power of every enemy:
27
77
73
68
61
47
35
23
59
12
89

NO !! Abhimanyu will not make out of Chakravyuha and will be deateated at Level - 5


=====================================================================================


CASE 2:

Abhimanyu's initial power -> 110
Number of times Abhimanyu can skip fighting enemies -> 4
Number of times Abhimanyu can recharge -> 2
Power of every enemy:
100
91
100
38
2
22
32
37
46
2
3

YES !! Abhimanyu will make out of Chakravyuha and reach the Pandavas army

 */