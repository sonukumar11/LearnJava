public class JavaLoops {
    public static void main(String[] args){
        int result = sumOddRange(1 , 100);
        System.out.println("The Sum of the odd values between the range 1 to 100 is " + result);
        System.out.println("Generating the same result with the while loop");
        result = sumOddRangeWhile(1 , 100);
        System.out.println("Using While, Sum of the odd values between the range 1 to 100 is " + result);
    }

    public static int sumOddRange(int start , int end){
        int total = 0;

        for(int i=start;i<=end;i++){
            if(i % 2 != 0){
                total += i;
            }
        }
        return total;
    }

    public static int sumOddRangeWhile(int start , int end){
        int total = 0;
        while(start <= end){
            if(start % 2 != 0){
                total += start;
            }
            start++;
        }
        return total;
    }
}
