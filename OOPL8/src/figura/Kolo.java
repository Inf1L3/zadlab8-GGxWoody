package figura;

public class Kolo extends FiguraPlaska {

    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(promien, 2);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Kolo{" + "Promien=" + promien + " Obwod=" + this.obliczObwod() + " Pole=" + this.obliczPole() + '}';
    }

}
