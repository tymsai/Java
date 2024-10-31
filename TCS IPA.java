// Create solution class Implement Static method "associates forGivenTechnology" in solution class.
// This method will take a string parameter as array of associate objects.


// The method will return array of Associates where string parameter appears in technology
// attribute(with case insensitive search) and experienceInyears should be multiple of 5.


// Create class Associate with below attributes:
// associate id- string
// associate name- string
// Technology- string
// experienceInYears-int


// Write getters,setters and parameterized constructor.
// Create class solution with the main method.
// Implement Static method - associateForgiventechnology in solution class.
// This method will take a string parameter named technology along with the other parameter as array of objects.
// The method will return array of associate where the string parameter appears in the technology attribute (with case insensitive search) and the experienceInyears should be multiples of 5.
// This method should be called from main method and display the id of returned objects in ascending order.

 

// Before calling this method (associateForgiventechnology) in the main method use scanner object to read values for five associate objects referring the attributes in above sequence then read value for search parameter.
// Next call the method associateForgiventechnology,write the logic to print the ID's (in main method) And display result.


// Input

 

// Alex
// 101
// Java
// 15
// Albert
// 102
// Unix
// 20
// Alferd
// 103
// Testing
// 13
// Alfa
// 104
// Java
// 15
// Almas
// 105
// Java
// 29

// Java // Given technology


// Output

// ​

// 101
// 104


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
            
            Custom[] arr=new Custom[5];
            
            for(int i=0; i<arr.length; i++){
                String name=sc.nextLine();
                int id=sc.nextInt(); sc.nextLine();
                String tech=sc.nextLine();
                int exp=sc.nextInt(); sc.nextLine();
                
                arr[i]=new Custom(name, id, tech, exp);
            }
            String tech=sc.nextLine();
            ArrayList<Custom> ac2=associateForgiventechnology(tech, arr);
            for(int i=0; i<ac2.size(); i++){
                System.out.println(ac2.get(i).getId());
            }
    }
    
    
    public static ArrayList<Custom> associateForgiventechnology(String tech, Custom[] arr){
        ArrayList<Custom> ac=new ArrayList<Custom>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].getTech().equals(tech) && arr[i].getExp()%5==0){
                System.out.println("true");
                ac.add(arr[i]);
            }
        }
        return ac;
    }
}



class Custom{
    private int id;
    private String name;
    private String tech;
    private int exp;
    
    public Custom(String name, int id, String tech, int exp){
        this.id=id;
        this.name=name;
        this.tech=tech;
        this.exp=exp;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;        
    }
    public void setTech(String tech){
        this.tech=tech;
    }
    public void setExp(int exp){
        this.exp=exp;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getTech(){
        return tech;
    }
    public int getExp(){
        return exp;
    }
}
