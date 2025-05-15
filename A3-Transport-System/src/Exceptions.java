public class Exceptions {
}

// Custom Exceptions
class BookingException extends Exception {
    public BookingException(String message) {
        super(message);
    }
}

class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
