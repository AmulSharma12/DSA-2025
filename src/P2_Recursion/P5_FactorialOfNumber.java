package P2_Recursion;

public class P5_FactorialOfNumber {
    public static void main(String[] args){
        int factorial = fact(5);
        System.out.println(factorial);
    }

    private static int fact(int N){
        if(N == 0)  return 1;
        return N * fact(N-1);
    }
}
