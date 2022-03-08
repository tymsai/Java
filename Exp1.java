//Experiment no.1                                                                                                                                                                              import java.util.Scanner;
class Box
{
    int w,h,d,vol,s;
    Box(int width,int height,int depth)
    {
        w=width;
        h=height;
        d=depth;
    }
    void Volume()
    {
        vol=w*h*d;
        System.out.println("Volume of box: "+vol);
    }
    void Surface()
    {
        s=2*(w*h+h*d+d*w);
        System.out.println("Surface of box: "+s);
    }
}
public class VolumeOfBox2 {
    public static void main(String[] args)
    {
        int w,h,d;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width,height and depth of a box: ");
        w=input.nextInt();
        h=input.nextInt();
        d=input.nextInt();
        Box b1 = new Box(w,h,d);
        b1.Surface();
        b1.Volume();
        input.close();
    }
}
