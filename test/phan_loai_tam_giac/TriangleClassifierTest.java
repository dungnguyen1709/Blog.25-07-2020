package phan_loai_tam_giac;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {


    @Test
    void classifier222() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(2,2,2);
        assertEquals(triangleClassifier.TYPE_EQUILATERAL_TRIANGLE,result);
    }

    @Test
    void classifier223() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(2,2,3);
        assertEquals(triangleClassifier.TYPE_ISOSCELES_TRIANGLE,result);
    }

    @Test
    void classifier233() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(2,3,3);
        assertEquals(triangleClassifier.TYPE_ISOSCELES_TRIANGLE,result);
    }

    @Test
    void classifier232(){
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(2,3,2);
        assertEquals(triangleClassifier.TYPE_ISOSCELES_TRIANGLE,result);
    }

    @Test
    void classifier345(){
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(3,4,5);
        assertEquals(triangleClassifier.TYPE_NORMAL_TRIANGLE,result);
    }

    @Test
    void classifier325(){
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(3,2,5);
        assertEquals(triangleClassifier.TYPE_NORMAL_TRIANGLE,result);
    }

    @Test
    void classifier321(){
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(3,2,1);
        assertEquals(triangleClassifier.TYPE_NORMAL_TRIANGLE,result);
    }

    @Test
    void classifier493(){
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.classifier(4,9,3);
        assertEquals(triangleClassifier.TYPE_INVALID_TRIANGLE, result);
    }

//    @Test
//    void classifier000(){
//        TriangleClassifier triangleClassifier = new TriangleClassifier();
//        String result = triangleClassifier.classifier(0,0,0);
//        assertEquals(triangleClassifier.TYPE_INVALID_TRIANGLE, result);
//    }
}