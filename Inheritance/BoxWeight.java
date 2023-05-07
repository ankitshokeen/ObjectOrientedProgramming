package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;

    }

    void b1(int a, int b){
        System.out.println(a+b);;
    }
}
