/*
Create a class Fruits with below attributes as private
● int fruitId
● String fruitName
● int price
● int rating

Write getters, setters and parameterized constructor in the abovementioned attribute 
sequence as required.

Create class Solution with main method

Implement One static method-

● findMaximumPriceByRating

findMaximumPriceByRating in the solution class. 
This method will take array of Fruit objects, int paramater and returns the maximum priced fruit 
object from array of Fruit objects whichever has rating greater than the rating 
(rating parameter passed). This method should be called from main method.

Write code to perform following tasks:

1. Take necessary input variable and call findMaximumPriceByRating.

For this method- The main method should print the fruitId from returnedobject. As if the 
returned value is not null, or it should print "No such Fruit".

Note:- Before calling this static method, use Scanner object to read thevalues of four Fruits 
objects. No two Fruits will have same price. All thesearches should be case insensitive.
Consider below sample input and output to test your code.


Input
-------------------
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3

Output
-----------------
888



*/


import java.util.*;
class Fruit{
    private int id;
    private String name;
    private int price;
    private int rating;
    
    public Fruit(int id, String name, int price, int rating){
        this.id=id;
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Fruit[] arr=new Fruit[4];
        for(int i=0; i<arr.length; i++){
            int id=sc.nextInt(); sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt(); sc.nextLine();
            int rating=sc.nextInt(); sc.nextLine();
            arr[i]=new Fruit(id,name,price,rating);
        }
        int num=sc.nextInt(); sc.nextLine();
        Fruit res=findMaximumPriceByRating(arr, num);
        System.out.println(res.getId());
    }
    public static Fruit findMaximumPriceByRating(Fruit[] arr, int num){
        int max=0;
        int max_i=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].getRating()>num){
                if(arr[i].getPrice()>max){
                    max=arr[i].getPrice();
                    max_i=i;
                }
            }
        }
        Fruit arr2=arr[max_i];
        // System.out.println(max);
        return arr2;
    }
}
