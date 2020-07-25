package automated_testing_tdd;

public class SimpleCalculator {
    public static int plus (int x , int y) {
        if (x / 2 + y / 2 >= Integer.MAX_VALUE /2)
            throw  new OutOfRangeException(x,y);
        if (x / 2 + y / 2 <= Integer.MIN_VALUE /2)
            throw  new OutOfRangeException(x,y);

        return x + y;
    }

    public static int minus(int x , int y) {
        if (x / 2 - y / 2 >= Integer.MAX_VALUE / 2)
            throw  new OutOfRangeException(x,y);
        if (x / 2 - y / 2 <= Integer.MIN_VALUE / 2)
            throw  new OutOfRangeException(x,y);
        return x - y;
    }


}
