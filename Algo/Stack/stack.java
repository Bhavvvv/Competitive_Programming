import java.util.*;
import java.io.*;
public class stack{
    public static void main(String args[])
    {
            int[] array = new int[10];
            int count=0;
            while(true)
            {
            System.out.println("Choose an option ");

            System.out.println("1.Insert ");
            System.out.println("2.delete ");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            Scanner sc=new Scanner(System.in);
            int input= sc.nextInt();
            
            if(input==1)
            {
                System.out.println("Insert an element you want to add in the array");
                array[count]=sc.nextInt();
                count++;
            }
            else if(input==2)
            {
                count--;
                System.out.println("Element Deleted" + array[count+1]);
            }
            else if(input==3)
            {
                for(int i=0;i<count;i++)
                {
                    System.out.println(array[i]);

                }
            }
            else
                break;
            }



    }
}