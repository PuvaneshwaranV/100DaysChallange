import java.i.o.*;
import java.io.*;import java.lang.*;
public class input {
    public static void main(String[] args)
    {
        DataInputStream d= new DataInputStream(system.in);
        System.out.println("first name:");
        int a=Integer.parseInt(d.readLine());
        System.out.println("second nme:");
        int b=Integer.parseInt(d.readLine());
        System.out.println("full name"+a"+b);
    } 
    
}


