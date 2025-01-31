package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/add-digits/
public class P17_LC258_AddDigits {
    public static void main(String[] args){
        //call from here...
    }

    public static int addDigits(int num) {
        //checking for the single digit
        while(num>=10)
        {
            num = sumOfDigit(num);
        }

        return num;
    }

    public static int sumOfDigit(int number)
    {
        int sum = 0;
        while(number != 0)
        {
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }

        return sum;
    }
}
