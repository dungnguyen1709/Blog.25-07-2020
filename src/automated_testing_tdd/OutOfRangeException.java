package automated_testing_tdd;

public class OutOfRangeException extends RuntimeException {
   public OutOfRangeException( int firstNumber, int secondNumber) {
       super("Out of range" + firstNumber + " ," + secondNumber );
   }
}
