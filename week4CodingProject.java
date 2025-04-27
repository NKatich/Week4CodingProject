package codingProject;

import java.util.Random;

public class week4CodingProject {

	public static void main(String[] args) {
		// 1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		// Start of 1)
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Using the {}, this allows us to give specific values to each spot in the index of the array.
		
		// a) Programmatically subtract the value of the first element in the array from the last element in the array (do not use ages[7] in your code).
		//    Print the result to the console.
		
		// Start of 1a)
		int firstIndex = ages[0]; // Grabs the first element in the index and stores in into a new variable, firstIndex. Indexes are zero-based, so the first one is at 0.
		int lastIndex = ages[ages.length - 1]; // Grabs the last element in the index and stores in into a new variable, lestIndex.
											   // ages.length will get the total length of the array
											   // and doing the math ages.length - 1 will give the last element in the index, as it will always be one less
											   // than the actual length (8 - 1 = 7).
		int subtract = lastIndex - firstIndex; // Subtracts the first from the last, and stores it in the new variable "subtract". (93 - 3 = 90)
		System.out.println(subtract);		   // Prints the result "subtract" to the console (90).
		
		// b) Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		// 		i. Make sure that there are 9 elements of type int in this new array.
		//		ii. Repeat the subtraction from Step 1.a (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2).
		//      iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		// c) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		// Start of 1b)
		int[] ages2 = {15, 21, 33, 45, 35, 68, 29, 52, 89}; // (i) Using the {}, we again give this new int array ages2 9 elements.
		int firstIndex2 = ages2[0]; 						// Once again grabs the first element in the index, this time from ages2, and store it in new variable firstIndex2.
		int lastIndex2 = ages2[ages2.length - 1]; 			// Like last time, this will make a new variable, lastIndex2, and do the math to calculate the last element,
		int subtract2 = lastIndex2 - firstIndex2;			// (ii) This will do the same subtraction as last time. The most important thing is that it uses the math "age2.length -1"
															// which will dynamically calculate the index values, so that any length of array is possible.
		// For instance... (iii)
		int[] ages3 = {32, 43, 74, 95};
		int fI3 = ages3[0];
		int lI3 = ages3[ages3.length - 1];
		int s3 = lI3 - fI3;
		System.out.println(s3); // This new array, ages3, is only 4 elements long. The code block is exactly the same except for variable names.
								// With the given values, the console should print out 63.
		// Start of 1c)
		int sumOfAges2 = 0;									// This create a new variable, sumOfAges2, and set it to a value of 0.
		for (int i = 0; i < ages2.length; i++) {   			// This for loop will iterate from i, starting at 0, through each element of the ages2 array, in this case,
															// through 8. This can be dynamic as it uses ages2.length, rather than a set value.
			sumOfAges2 += ages2[i];							// This allows the value of the current element of that iteration, i, and adds it to sumOfAges2. 
		}													// This loop will go until the value of i is no longer true; in this case, once i = 9.
		int averageAges2 = sumOfAges2 / ages2.length;       // This creates a final variable, averageAges2.
															// It calculates this by taking the sum of all elements in ages2 (in this case 387)
															// and divides it by the total length of the array (9 in this case).
		System.out.println(averageAges2);					// This will print out the average of the ages in the ages2 array. (43)
		
		// 2) Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
		// 		a) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		// 		b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		// Start of 2)
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // The "String" type will create an array of Strings. After that, the name of the array is "names".
																		  // Finally, using {} we can specify the values in the array. With Strings, we need to use "" to
																		  // use them properly.
		
		// Start of 2a)
		int letters = 0;				// This initializes a variable "letters" to 0. It will store the sum of the lengths of names in the array.
		for (String name : names) {		// This enhanced for loop will iterate through each element in the "names" array and assign each current iteration the "name" variable.
			letters += name.length();	// Inside the loop, the "names.length" will return the number of characters in each current "name" String. This will be added to the
										// "letters" variable each time.
		}
		double avgLetters = (double) letters / names.length;		// After the loop is done, "letters" will have the total amount of characters from all of the names.
																	// It will then divide this by the number of names (names.length), and will store the average 
		System.out.println(avgLetters);								// in the "avgLetters" variable.This will print out the average to the console (in this case, 3.0).
		
		// Start of 2b)
		StringBuilder stringNames = new StringBuilder();	// I used a StringBuilder Object as it is more efficient and time saving than using the "+" operator
															// for each concatenation. 
		for (int i = 0; i < names.length; i++) {			// This is a traditional for loop that goes through the "names" array with index "i", starting from 0
															// and going to the length of the array - 1.
			stringNames.append(names[i]);					// Inside the loop, "names[i}" takes the name at the current index iteration "i". Using "append()", it is added to
															// "stringNames".
			if (i < names.length - 1) {						// This next if statement checks if the current name is the last name in the array.
				stringNames.append(" ");					// If it is not, it will add a space (" ") with the append function to separate it.
			}
		}
		System.out.println(stringNames.toString());			// Once finished, "stringNames" has all of the names concatenated with spaces between them. Using "toString()" it
															// will convert them back to a String and print it to the console.
		
		
		// 3) How do you access the last element of any array?
		// You can always access the last element of any array by putting arrayName[arrayName.length - 1]. As arrays are aero-based, meaning it starts at 0 instead of 1, 
		// you need to count from the number of elements in the array and go one lower, otherwise it will throw an OutOfBoundsException.
		
		// 4) How do you access the first element of any array?
		// You can always access the first element of any array by putting arrayName[0]. Since arrays are zero-based, they will always start at 0 instead of 1.
		
		// 5) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and
		// add the length of each name to the nameLengths array.
	
		// Start of 5)
		int[] nameLengths = new int[names.length];		// This creates a new integer array called "nameLengths", and is set to the size of the "names" array using
														// [names.length].
		for (int i = 0; i < names.length; i++) {		// Standard for loop, using the same iteration method as above.
			nameLengths[i] = names[i].length();		// Inside the loop, "nameLengths[i]" assigns the calculated length to the current element "i" in the "nameLengths"
														// array. On the other side, "names[i]" accesses the current name at index "i" in the "names" array, and using ".length()"
														// calls the current name to get the number of characters that make up that name.
		}
		for (int i = 0; i < nameLengths.length; i++) {
			System.out.println(nameLengths[i]);				// To check it, printing out to the console the "nameLengths" array using a for loop, we should see 3, 5, 3, 5, 4, 3
				
			}
		
		// 6) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		// Start of 6)
		int sumLengths = 0;					// This makes a new int variable "sumLengths" and initializes it at 0.
		for (int length : nameLengths) {	// Enhanced for loop, iterating through each element in "nameLengths" and storing the current one in the "length" variable.
			sumLengths += length;			// Inside the loop, this will add the current "length" variable to "sumLengths".
		}
		System.out.println(sumLengths);		// Printing to the console, the value should be 23.
		
		// 7) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in "Hello"
		//	  and 3, I expect the method to return "HelloHelloHello").
		
		// Start of 7)
		String word = "Goodbye";								// New String variable "word" created with value "Goodbye".
		int counter = 4;										// New int variable "counter" created with value "4".
		String repeatedWord = repeatTheWord(word, counter);		// New String variable "repeatedWord" created, using the result of the method created called "repeatTheWord".
																// The inputs are the variables "word" and "counter", which correspond to the correct parameters of String and
																// int in the method.
		System.out.println(repeatedWord);						// This will print out the String the number of times in "counter" (GoodbyeGoodbyeGoodbyeGoodbye).
		
		// 8) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name
		//    as a String separated by a space).
		
		// Start of 8)
		String name1 = "Jim";							// New String variable "name1" created with value "Jim".
		String name2 = "Lahey";							// New String variable "name2" created with value "Lahey".
		String fullName = makeFullName(name1, name2);	// New String variable "fullName" created, using the result of the method created called "makeFullName"
														// The inputs are the variables "name1" and "name2", which correspond to the two String parameters in the method.
		System.out.println(fullName);					// This will print out the two names into a single String with a space between them. (Jim Lahey).
		
		
		// 9) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		// Start of 9)
															// I made two examples to test this, the first resulting true and the second resulting false.
		int[] array1 = {35, 45, 55};						// New array of integers "array1" created with the values "35, 45, 55".
		boolean result1 = isSumMoreThan100(array1);			// New boolean variable "result1" created, using the result from method created called "isSumMoreThan100".
															// The input is the values stored in the array "array1", which matches the parameter in the method.
		System.out.println(result1);						// This will print out either true or false(In this case, 35+45+55=135>100==true).
		
		int[] array2 = {2, 4, 6, 8, 10};					// New array of integers "array2" created with the values "2, 4, 6, 8, 10".
		boolean result2 = isSumMoreThan100(array2);			// New boolean variable "result2" created, using the result from method created called "isSumMoreThan100".
															// The input is the values stored in the array "array2", which matches the parameter in the method.
		System.out.println(result2);						// This will print out either true or false(In this case, 2+4+6+8+10=30!>100==false).
		
		// 10) Write a method that takes an array of double and returns the average of all the elements in the array.
		
		// Start of 10)
															// I made two examples to test this once again.
		double[] values1 = {1.5, 2.5, 3.5, 4.5};			// New array of doubles "values1" created with the values "1.5, 2.5, 3.5, 4.5".
		double avg1 = giveAverage(values1);					// New double variable "avg1" created, using the result from the method created called "giveAverage".
															// The input is the values stored in the array "values1", which matches the parameter in the method.
		System.out.println(avg1);							// This will print out the average of the values in the array. (In this case, 3.0 is the result.)
		
		double[] values2 = {15.5, 20.0, 25.5, 30.0, 35.5};  // New array of doubles "values2" created with the values "15.5, 20.0, 25.5, 30.0, 35.5".
		double avg2 = giveAverage(values2);					// New double variable "avg1" created, using the result from the method created called "giveAverage".
															// The input is the values stored in the array "values2", which matches the parameter in the method.
		System.out.println(avg2);							// This will print out the average of the values in the array. (In this case, 25.3 is the result.)
		
		// 11) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater
		//     than the average of the elements in the second array.

		// Start of 11)
																			// I made two examples like before.
		double[] doubleArray1 = {1.0, 2.0, 3.0, 4.0};						// New double array "doubleArray1" created with values "1.0, 2.0, 3.0, 4.0".
		double[] doubleArray2 = {2.0, 2.0, 2.0, 2.0};						// New double array "doubleArray2" created with values "2.0, 2.0, 2.0, 2.0".
		boolean doubleResult1 = isAvgGreater(doubleArray1, doubleArray2);	// New boolean variable "doubleResult1" created, using the result from method created called
																			// "isAvgGreater". The input is the values stored in the double arrays "doubleArray1" and
																			// "doubleArray2", which matches the parameters in the method.
		System.out.println(doubleResult1);									// This will print out either true or false (In this case, 2.5 > 2 == true).
		
		double[] doubleArray3 = {6.0, 6.0};									// New double array "doubleArray3" created with values "6.0, 6.0".
		double[] doubleArray4 = {8.0};										// New double array "doubleArray4" created with value "8.0".
		boolean doubleResult2 = isAvgGreater(doubleArray3, doubleArray4);	// New boolean variable "doubleResult2", using the result from method created called
																			// "isAvgGreater". The input is the values stored in the double arrays "doubleArray3" and
																			// "doubleArray4", which matches the parameters in the method.
		System.out.println(doubleResult2);									// This will print out either true or false (In this case, 6.0 !> 8.0 == false).
		
		// 12) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside 
		//     and if moneyInPocket is greater than 10.50.
		
		// Start of 12)
															// There are a few examples to test.
		System.out.println(willBuyDrink(true, 15.00));		// This will print to the console the result using the method "willBuyDrink", with it being hot outside, and having
															// $15.00 in pocket. The result is true since both values are true.
		System.out.println(willBuyDrink(false, 20.00));		// This will print to the console the result using the method "willBuyDrink", with it not being hot outside, and
															// having $20.00 in pocket. Since one value is false (not hot outside), the result is false.
		System.out.println(willBuyDrink(true, 10.00));		// This will print to the console the result using the method "willBuyDrink", with it being hot outside, and having
															// $10.00 in pocket. Since one value is false (not enough money), the result is false.
		
		// 13) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		// This method simulates rolling six-sided dice a specified number of time and calculates the average value of rolls.
		// I am huge into gaming, and am trying to get more into table-top gaming in particular. Using a tool like this could help in the future to determine the randomness
		// of large numbers of rolls and simulating those rolls.
		
		// Start of 13)
		// Note: I have imported java.util.random for this example.							
		int rolls1 = 100;															// This takes a number of rolls, in this case 100, and creates a new int variable
																					// called "rolls1" to store it.
		double rollAvg1 = calculateAvgDiceRoll(rolls1);								// This creates a double called "rollAvg1" and stores the output of the new method
																					// "calculateAvgDiceRoll", with the input being the number of rolls (i.e. "rolls1" or 100)
		System.out.println("Average of " + rolls1 + " dice rolls: " + rollAvg1);	// This will print the result to the console.
		
		int rolls2 = 1000;															// This takes a number of rolls, in this case 1000, and creates a new int variable
																					// called "rolls2" to store it.
		double rollAvg2 = calculateAvgDiceRoll(rolls2);								// This create a double called "rollAvg2" and stores the output of the new method
																					// "calculateAvgDiceRoll", with the input being the number of rolls (i.e. "rolls2" or 1000)
		System.out.println("Average of " + rolls2 + " dice rolls: " + rollAvg2);	// This will print the result to the console.
		
	
		
		
		
		}
		// Start of method for 7)
		public static String repeatTheWord(String word, int n) {	// The method is created using public static, meaning that it is accessible from any other class.
																	// The String is the return type (output), "repeatTheWord" is the name of the method that we can use to
																	// call it. "String word" is the word that needs repeated and "int n" is the number of times
																	// it needs to be concatenated; both of these are the parameters.
			StringBuilder result = new StringBuilder();				// Using StringBuilder for efficiency and time-saving vs. using "+" and " ".
			for (int i = 0; i < n; i++) {							// Standard for loop, iterating n times from i = 0 to i < n.
				result.append(word);								// Inside the loop, for each iteration it will append the word to itself until it i in no longer less than n
			}
			return result.toString();								// After n iterations, the method will return the resulting String (using .toString() to convert it) to
																	// wherever it is called.
		}
		//S tart of method for 8)
		public static String makeFullName(String firstName, String lastName) {		// Like the previous method, it will use public static so that any class may use it.
																					// It will use a String as the return type, and the method is named "makeFullName".
																					// The parameters are two Strings, "firstName" and "lastName".
			return firstName + " " + lastName;										// Since it is a small, single instance, we can create a single line to concatenate the
		}																			// two Strings, separated by a space " ", and return that result to the main method.
		// Start of method for 9)
		public static boolean isSumMoreThan100(int[] num) {		// Once again, public static method so any class may use it. The return type is boolean, so that we may see if
																// the result is either true or false. The name is "isSumMoreThan100", and the parameter is an array of integers
																// named "num".
			int sum = 0;										// This creates a new int variable called "sum" with a value of 0.
			for (int number : num) {							// Enhanced for loop that goes through each element in the array "num" and assigns each current iteration
																// to the variable "number".
				sum += number;									// Inside the loop, the current value in "number" is added to "sum" variable.
			}
			return sum > 100;									// After the loop is done, this line checks if all the values added together in "sum" are more than 100, and
																// returns either true or false.
		}
		// Start of method for 10)
		public static double giveAverage(double[] num) {		// Like previous methods, public static so any class can call it. Return type is double so it can give a
																// floating-point decimal instead of an integer. Method name is "giveAverage", and the parameter is an array
																// of doubles named "num".
			double sum = 0;										// This creates a new double variable called "sum" with a value of 0.
			for (double number : num) {							// Enhanced for loop that goes through each element in the array "num" and assigns each current iteration
																// to the variable "number".
				sum += number;									// Inside the loop, the current value in "number" is added to "sum" variable.
			}
			return sum / num.length;							// Once the loop is done, the average is calculated by dividing "sum" by the total number of elements in the
																// "num" array using "num.length", and the return is output.
		}
		// Start of method for 11)
		public static boolean isAvgGreater(double[] array1, double[] array2) {		// Like previous methods, public static so any class can call it. Return type is double so
																					// it can give a floating-point decimal rather than an integer. Method name is
																					// "isAvgGreater"m and the parameters are two double arrays named "array1" and "array2".
			double sum1 = 0;														// This creates a new double variable "sum1" with a value of 0.
			for (double num : array1) {												// Enhanced for loop that goes through each element in the array "num" and assigns each
																					// current iteration to the double array variable "array1".
				sum1 += num;														// Inside the loop, the current value in "num" is added to "sum1" variable.
			}
			double  avg1 = sum1 / array1.length;									// This calculates the average of the values in "array1" by taking "sum1" and dividing by
																					// the total number of values in the array; it will then store this value into a new double
																					// variable named "avg1".
			
			double sum2 = 0;														// This next section does the same as the above, but for the other array, "array2".
			for (double num : array2) {
				sum2 += num;
			}
			double avg2 = sum2 / array2.length;
			
			return avg1 > avg2;														//Finally, it takes the two values and compares the two. It will return either true or false
		}
		// Start of method for 12)
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {  // Like previous methods, public static so any class can call it. Return type is
																						  // boolean (true or false), Method name is "willBuyDrink", and the parameters are
																						  // a boolean "isHotOutside" and a double "moneyInPocket".
			return isHotOutside && moneyInPocket > 10.50;								  // This line checks if the inputs for "isHotOutside" is true or false, AND if
																						  // the value of "moneyInPocket" is greater than 10.50. If both are true, the return is
																						  // true, and if either is false, the return is false.
		}
		// Start of method for 13)
		public static double calculateAvgDiceRoll(int numOfRolls) {		// This is a new method called "calculateAvgDiceRoll", that can be called from any class (public static)
																		// with a return type of double, and the parameter being an int named "numOfRolls".
			Random random = new Random();								// This creates a new instance of the java.util.Random class to generate random numbers.
			int totalSum = 0;											// This creates a new int variable "totalSum" with a value of 0.
			for (int i = 0; i < numOfRolls; i++) {						// Standard for loop, starting at i = 0, and iterating until i = numberOfRolls.
				int roll = random.nextInt(6) + 1;						// Inside the loop, it creates a new int variable "roll" and it will generate a random integer between 
				totalSum += roll;										// 1 (inclusive) and 7 (exclusive). This simulates the rolling of a six-sided die. It then adds the 
			}															// result of the current roll to "totalSum".
			return (double) totalSum / numOfRolls;						// After finishing the loop, it calculates the average by dividing "totalSum" by "numOfRolls", forces
		}																// it as a double, and returns the average.
	}




