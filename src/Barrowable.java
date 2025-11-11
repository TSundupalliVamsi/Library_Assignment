public interface Barrowable {
    void borrowItem(String userId) throws BookNotAvailableException;
    void returnItem(String userId) throws InvalidReturnException;
}
