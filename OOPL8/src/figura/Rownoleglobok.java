package figura;

public class Rownoleglobok extends FiguraPlaska {

    private double bokA;
    private double bokB;
    private double wysokosc;

    public Rownoleglobok(double bokA, double bokB, double wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.wysokosc = wysokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    @Override
    public double obliczObwod() {
        return bokA * 2 + bokB * 2;
    }

    @Override
    public double obliczPole() {
        return bokA * wysokosc;
    }

    @Override
    public String toString() {
        return super.toString() + " Romb{" + " BokA=" + bokA + " BokB=" + bokB + " Wysokosc=" + wysokosc + " Obwod=" + this.obliczObwod() + " Pole=" + this.obliczPole() + '}';
    }
}
