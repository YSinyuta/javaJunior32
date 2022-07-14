package lesson7;

public class Triangle {
    private int a;
    private int h;
    private int b;
    private int c;

    public Triangle(){
    }
    public Triangle(int a,int b,int c,int h){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public double getarea(){
        return 0.5*a*h;
    }
    public int getperimetr(){
        return a+b+c;
    }
}
