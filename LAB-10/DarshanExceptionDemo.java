class DarshanUniException extends Exception {
    DarshanUniException(String msg) {
        super(msg);
    }
}

class DarshanExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new DarshanUniException("This is Darshan University Custom Exception");
        } catch (DarshanUniException e) {
            System.out.println(e.getMessage());
        }
    }
}
