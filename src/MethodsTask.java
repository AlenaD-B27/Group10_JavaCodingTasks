public class MethodsTask {

    public static void evenOrOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }

    public static void withoutDivideOperator(int num1, int num2){

        int result = 0;
        while (num1 >= num2){
            num1 -= num2;
            result++;

        }
        System.out.println(result);
    }



    public static void main(String[] args) {

    evenOrOdd(2);
    withoutDivideOperator(6,3);


    }
}
