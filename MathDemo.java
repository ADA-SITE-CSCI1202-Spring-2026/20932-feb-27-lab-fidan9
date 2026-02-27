public class MathDemo {

    public static int min(int a, int b){
        return (a < b) ? a : b;
    }

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }

    public static int sum(int[] args){
        int total = 0;
        for(int num : args){
            total += num;
        }
        return total;
    }

    public static float mean(int[] args){
        if(args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8};

        System.out.println("Min of 5 and 10: " + MathDemo.min(5, 10));
        System.out.println("Max of 5 and 10: " + MathDemo.max(5, 10));
        System.out.println("Sum of array: " + MathDemo.sum(numbers));
        System.out.println("Mean of array: " + MathDemo.mean(numbers));
        System.out.println("Factorial of 5: " + MathDemo.factorial(5));
    }
}