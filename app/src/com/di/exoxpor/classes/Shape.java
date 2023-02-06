package com.di.exoxpor.classes;

public class Shape {

    protected double haut;
    protected double larg;

    public Shape() {
        super();
    }

    public void setHauteur(double haut) {
        this.haut = haut;
    }

    public void setLargueur(double larg) {
        this.larg = larg;
    }

    public double getHauteur() {
        return this.haut;
    }

    public double getLargueur() {
        return this.larg;
    }

    public void surface() {
        double area = this.getHauteur() * this.getLargueur();
        System.out.printf("La surface de la forme est : <%s>", area);
    }
}
