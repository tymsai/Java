// /*
// Create a class HeadSets with below attributes:

// headsetName - String
// brand-String 
// price - int
// available- boolean

// The above attributes should be private, write getters, setters and parameterized constructor as required.

// Create class Solution with main method.
// Implement two static methods - findTotalPriceForGivenBrand and findAvailableHeadsetWithSecondMinPrice in Solution class.

// findTotalPriceForGivenBrand method:
// --------------------------------------
// The method will return the total price of Headsets from array of Headset objects for the given brand(String parameter passed).
// If no Headsets with the given brand is present in the array of Headsets objects, then the method should return 0.

// findAvailableHeadsetWithSecondMinPrice method:
// -----------------------------------------------
// This method will take array of Headset objects as an input parameter and returns the available Headset object with the 
// second lowest/minimum price from the given array of objects. 

// If no Headsets with the above condition is present in the array of Headsets objects, then the method should return null.

// Note : 
// No two Headsets will have the same price.
// All the searches should be case insensitive.

// The above mentioned static methods should be called from the main method.

// For findTotalPriceForGivenBrand method - The main method should print the returned total price as it is if the returned 
// value is greater than 0 or it should print "No Headsets available with the given brand".
// Eg: 4500
// where 4500 is the total Headsets price

// For findAvailableHeadsetWithSecondMinPrice method - The main method should print the headsetsName and price from the 
// returned Headsets object if the returned value is not null.
// If the returned value is null then it should print "No Headsets available".

// Eg:Logitech Wired
// 1500
// where Logitech Wired is the headsetName and 1500 is the price

// Before calling these static methods in main, use Scanner object to read the values of four Headset objects referring 
// attributes in the above mentioned attribute sequence.
// Next, read the value of String parameter for capturing brand.

// Consider below sample input and output:

// Input1:
// ----------------
// boAt BassHeads
// boAt
// 1220
// true
// Over Ear Wired
// boAt
// 549
// true
// In Ear with Mic
// JBL
// 450
// true
// Buds 2 Neo
// RealMe
// 500
// true
// boAt

// Output:
// ---------------
// 1769
// Buds 2 Neo
// 500


// Input2:
// --------------------
// boAt BassHeads
// boAt
// 1220
// false
// Over Ear Wired
// boAt
// 1549
// false
// In Ear with Mic
// JBL
// 450
// false
// Buds 2 Neo
// RealMe
// 500
// false
// boAt
// Output:
// --------------
// 2769
// No Headsets available
// --------------------------------------------------
// Sample code snippet for reference:
// Please use below code to build your solution.
// --------------------------------------------------
// import java.util.Scanner;
// public class MyClass
// {
// public static void main(String[] args)
// {
// //code to read values
// //code to call required method
// //code to display the result
// }
// public static int findTotalPriceForGivenBrand (/* required parameters to be added */)
// {
// Restricted for circulation outside TCS Xplore 9
// //method logic
// }
// public static HeadSets findAvailableHeadsetWithSecondMinPrice (/* required parameters to be 
// added */)
// //method logic
// }

// class HeadSets 
// {
// //code to build the class
// }
// -------------------------------------------------
// Note on using Scanner object:
// Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc.
// Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.
// Consider below input values:
// 1001
// Savings
// Referring below code:
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// String str = sc.nextLine(); -> here we expect str to have value Savings.Instead it may be "".
// If above issue is observed, then it is suggested to add one more explicit call to nextLine() after 
// reading numeric value.
// */


import java.util.*;
class Head {
	private String name;
	private String brand;
	private int price;
	private boolean avail;

	public Head(String name, String brand, int price, boolean avail) {
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.avail=avail;
	}

	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getAvail() {
		return avail;
	}
}

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Head[] arr=new Head[4];
		for(int i=0; i<arr.length; i++) {
			String name=sc.nextLine();
			String brand=sc.nextLine();
			int price=sc.nextInt();
			sc.nextLine();
			boolean avail=sc.nextBoolean();
			sc.nextLine();
			arr[i]=new Head(name, brand, price, avail);
		}
		String str=sc.nextLine();
		int total=findTotalPriceForGivenBrand(arr,str);
		Head article=findAvailableHeadsetWithSecondMinPrice(arr);
		System.out.println(total);
		if(article!=null) {
			System.out.println(article.getName());
			System.out.println(article.getPrice());

		} else {
			System.out.println("No Headsets available");

		}
	}
	public static Head findAvailableHeadsetWithSecondMinPrice(Head[] arr) {
		int max=Integer.MAX_VALUE;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			al.add(arr[i].getPrice());
		}
		Collections.sort(al);
		int temp=al.get(1);
		for(int i=0; i<arr.length; i++) {
			if(temp==arr[i].getPrice()) {
				return arr[i];
			}
		}
		return null;
	}
	public static int findTotalPriceForGivenBrand(Head[] arr, String str) {
		int total=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getBrand().equalsIgnoreCase(str)) {
				total+=arr[i].getPrice();
			}
		}
		return total;
	}
}
