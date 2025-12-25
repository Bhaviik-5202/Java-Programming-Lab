class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred: Division by zero");
        }

        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Occurred");
        }

        System.out.println("Program Executed Successfully");
    }
}
