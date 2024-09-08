//Exception:- ArrayIndexOutOfBoundsException
//Explanation:- array number , which only has 5 elements (indices 0 to 4),
        // Accessing index 10 is out of bounds.


//Exception:- Exception in thread "main" java.lang.ArithmeticException: / by zero
//Explaination:-  Division by zero is not allowed and throws an ArithmeticException.

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};

        try {
            System.out.println(number[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds.");
        }

        int result =divide(10,0);
        System.out.println("Result: "+result);
    }

    public static int divide(int a, int b){
        // try{
        //     return a/b;
        // }catch(ArithmeticException e){
        //     System.out.println("ArithmeticException: number divided zero");
        //     return 0;
        // }
        return a/b;
    }
}
