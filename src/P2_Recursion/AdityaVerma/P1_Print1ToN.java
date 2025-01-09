package P2_Recursion.AdityaVerma;
import java.util.*;

public class P1_Print1ToN {
    public static void main(String[] args){
        print(5);
    }

    //printing 1 to N
    private static void print(int num){
        if(num == 1)    {
            System.out.println(num);
            return;
        }
        print(num - 1);  //print from 1 to N-1
        System.out.println(num);
    }
}
