class OutOfRangeException extends Exception {
    OutOfRangeException(String msg) {
        super(msg);
    }
}

class OutOfRangeDemo {
    public static void main(String[] args) {
        int num = 25;

        try {
            if (num < 10 || num > 50) {
                throw new OutOfRangeException("Number is out of range (10 - 50)");
            }
            System.out.println("Square = " + (num * num));
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
