/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Przemek
 */
public class Trojkat extends FiguraPlaska {

    private double Bok1;
    private double Bok2;
    private double Bok3;
    private double Wysokosc;

    public Trojkat(double Bok1, double Bok2, double Bok3, double Wysokosc) {
        this.Bok1 = Bok1;
        this.Bok2 = Bok2;
        this.Bok3 = Bok3;
        this.Wysokosc = Wysokosc;
    }

    public double getBok1() {
        return Bok1;
    }

    public void setBok1(double Bok1) {
        this.Bok1 = Bok1;
    }

    public double getBok2() {
        return Bok2;
    }

    public void setBok2(double Bok2) {
        this.Bok2 = Bok2;
    }

    public double getBok3() {
        return Bok3;
    }

    public void setBok3(double Bok3) {
        this.Bok3 = Bok3;
    }

    public double getWysokosc() {
        return Wysokosc;
    }

    public void setWysokosc(double Wysokosc) {
        this.Wysokosc = Wysokosc;
    }

    @Override
    public double obliczObwod() {
        return Bok1 + Bok2 + Bok3;
    }

    @Override
    public double obliczPole() {
        return (Bok1 * Wysokosc)/2;
    }

    @Override
    public String toString() {
        return super.toString()+" Trojkat{" + "Bok1=" + Bok1 + ", Bok2=" + Bok2 + ", Bok3=" + Bok3 + ", Wysokosc=" + Wysokosc +" Obwod="+this.obliczObwod()+" Pole="+this.obliczPole()+'}';
    }

}
