package Lesson_7_8;

import java.util.Random;

public class XYVector extends  BaseVector{

    public XYVector(int x, int y) {
        super(x, y);
    }



    @Override
    public double getLengthVector() {
        return Math.round(Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)));
    }

    public  int countScalar(XYVector xyVector){
        return  Math.round(xyVector.x * this.x + xyVector.x * this.y);
    }

    public XYVector MinusVectors(XYVector xyVector) {
        XYVector rezMinusVectors = new XYVector(this.x - xyVector.x, this.y - xyVector.y);
        return rezMinusVectors;
    }

    public static XYVector[] returnRandomArrayVectors(int n) {
        XYVector[] randomVectorsArray = new XYVector[n];
        for (int i = 0; i < n; i++) {
            randomVectorsArray[i] = new XYVector(new Random().nextInt(20), new Random().nextInt(20));
        }
        return randomVectorsArray;
    }

    @Override
    public String toString() {
        return "XYVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

