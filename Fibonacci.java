//Negative Number Handling

//Explanation:- The fibonacci function does not handle
                //  negative numbers. If you pass a negative
                //   number, the function will go into infinite
                //    recursion because there is no base case for
                //     negative values.


public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0||n==1)
            return n;
        else if(n<0)
            return -1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=-3;
        int result=fibonacci(n-1);
        if(result == -1){
            System.out.println("Invalid entry");
        }else{
            System.out.println("The Fibonacci number at position "+n+" is "+result);
        }
    }
}
