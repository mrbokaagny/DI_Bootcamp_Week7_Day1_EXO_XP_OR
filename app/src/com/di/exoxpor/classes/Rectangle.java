package com.di.exoxpor.classes;

public class Rectangle extends Shape {

    public Rectangle(double longr, double larg) {
        super();
        this.haut = longr;
        this.larg = larg;
    }

    public void getArea() {
        double area = this.haut * this.larg;
        System.out.printf("La surface du rectangle est : <%s> \n", area);
    }

}
