package Lesson_7_8;

import java.util.Objects;
import java.util.Random;

public class XYZVector extends  BaseVector{
    protected  int z;

    public XYZVector(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public double getLengthVector() {
        return Math.round(Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2)));
    }


    public  int countScalar(XYZVector xyzVector){
        return  Math.round(xyzVector.x * this.x + xyzVector.y * this.y+xyzVector.z*this.z);
    }

    public XYZVector MinusVectors(XYZVector xyzVector) {
        XYZVector rezMinusVectors = new XYZVector(this.x - xyzVector.x, this.y - xyzVector.y, this.z - xyzVector.z);
        return rezMinusVectors;
    }

    public static XYZVector[] returnRandomArrayVectors(int n) {
        XYZVector[] randomVectorsArray = new XYZVector[n];
        for (int i = 0; i < n; i++) {
            randomVectorsArray[i] = new XYZVector(new Random().nextInt(20), new Random().nextInt(20),new Random().nextInt(20));
        }
        return randomVectorsArray;
    }

    @Override
    public String toString() {
        return "XYZVector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XYZVector xyzVector = (XYZVector) o;
        return z == xyzVector.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(z);
    }
}
