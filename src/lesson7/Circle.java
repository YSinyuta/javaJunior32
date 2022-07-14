package lesson7;

public class Circle {
    private int r;
    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getarea() {
        return Math.PI * r * r;
    }
    public double getperimetr(){
        return 2*Math.PI*r;
    }
}
