class AgeNotValidException extends Exception {
    AgeNotValidException(String msg) {
        super(msg);
    }
}

public class validation {

    public void validate(int age) throws AgeNotValidException {
        if (age > 18) {
            System.out.println("Age is valid");
        } else {
            throw new AgeNotValidException("Age is not valid");
        }
    }

    public static void main(String[] args) {
        validation v = new validation();

        try {
            v.validate(17);   // Change to 20 to test valid age
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}