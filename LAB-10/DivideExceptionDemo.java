class DivideExceptionDemo {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 / num2;
            System.out.println("Result = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter valid integers");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }
    }
}
