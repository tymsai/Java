//Experiment no.2 
class cars
{
    int price;
    String name;
    cars(int price,String name)//Parameterized Constructor
    {
        this.price=price;
        this.name=name;
    }
    cars(cars cars)//copy constructor
    {
        price=cars.price;
        name=cars.name;       
    }
    int ShowPrice()
            {
                return price;
            }
    String ShowName()
            {
        return name;
            }
}
public class CopyConstructor {
    public static void main(String args[])
    {
        cars c1=new cars(1000,"alto");
        System.out.println("Invoking the Parameterized Constructor");
        System.out.println("name of 1st car:"+c1.ShowName());
        System.out.println("price of 1st car:"+c1.ShowPrice());
        
        cars c2=new cars(c1);
        System.out.println("Invoking the Copy Constructor using copy");
        System.out.println("name of 1st car:"+c1.ShowName());
        System.out.println("price of 1st car:"+c1.ShowPrice());
        
        cars c3=c2;
        System.out.println("invoking copy constructor using assignment");
        System.out.println("name of 1st car:"+c1.ShowName());
        System.out.println("price of 1st car:"+c1.ShowPrice());
        
        
    }
    
}
