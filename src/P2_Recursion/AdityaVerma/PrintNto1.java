package P2_Recursion.AdityaVerma;
import java.util.*;
public class PrintNto1 {
    public static void main(String[] args)
    {
        print(5);
    }

    //print the number from N to 1
    private static void print(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        print(num - 1);
    }
}
