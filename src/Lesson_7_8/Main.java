package Lesson_7_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        XYVector xyVector1=new XYVector(10,10);
        XYVector xyVector2=new XYVector(10,10);
        System.out.println(xyVector1.getLengthVector());
        System.out.println();
        System.out.println(xyVector1.countScalar(xyVector2));
        System.out.println();
        System.out.println(xyVector2.MinusVectors(xyVector1).toString());
        System.out.println();
        System.out.println(Arrays.toString(XYVector.returnRandomArrayVectors(3)));
        System.out.println();
        System.out.println(Arrays.toString(XYZVector.returnRandomArrayVectors(3)));
        System.out.println();
        System.out.println(xyVector1.equals(xyVector2));
    }
}
