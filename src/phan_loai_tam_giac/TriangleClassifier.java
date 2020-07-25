package phan_loai_tam_giac;

public class TriangleClassifier {

    public static final String TYPE_EQUILATERAL_TRIANGLE= "equilateral triangle";
    public static final String TYPE_ISOSCELES_TRIANGLE = "isosceles triangle";
    public static final String TYPE_NORMAL_TRIANGLE = "normal triangle";
    public static final String TYPE_INVALID_TRIANGLE = "type invalid";

    public static String classifier(int a, int b, int c) {
       if (a == b && b == c && c == a)
           return TYPE_EQUILATERAL_TRIANGLE;
       if (a == b || b == c || c == a)
           return TriangleClassifier.TYPE_ISOSCELES_TRIANGLE;
       if (a + b < c || b + c < a || c + a < b)
           return TYPE_INVALID_TRIANGLE;
//       if (a == 0 && b == 0 && c == 0)
//           return TYPE_INVALID_TRIANGLE;
       return TYPE_NORMAL_TRIANGLE;
    }

}
