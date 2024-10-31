import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Medicine[] arr=new Medicine[4];
        for(int i=0; i<arr.length; i++){
            String name=sc.nextLine();
            String batch=sc.nextLine();
            String rog=sc.nextLine();
            int price=sc.nextInt(); sc.nextLine();
            
            arr[i]=new Medicine(name, batch, rog, price);
        }
        
        String rog=sc.nextLine();
        ArrayList<Medicine> arr2=getPriceByDisease(rog, arr);
        
        for(int i=0; i<arr2.size(); i++){
            System.out.println(arr2.get(i).getPrice());
        }
        
    }
    
    public static ArrayList<Medicine> getPriceByDisease(String rog, Medicine[] arr){
        ArrayList<Medicine> arr2=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].getRog().equalsIgnoreCase(rog)){
                arr2.add(arr[i]);
            }
        }
        return arr2;
    }
}

class Medicine{
    private String name;
    private String batch;
    private String rog;
    private int price;
    
    public Medicine(String name, String batch, String rog, int price){
        this.name=name;
        this.price=price;
        this.rog=rog;
        this.batch=batch;
    }
    
    public void setRog(String rog){
        this.rog=rog;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBatch(String batch){
        this.batch=batch;
    }
    public void setPrice(int price){
        this.price=price;
    }
    
    public String getRog(){
        return rog;
    }
    public String getName(){
        return name;
    }
    public String getbatch(){
        return batch;
    }
    public int getPrice(){
        return price;
    }
    
}
