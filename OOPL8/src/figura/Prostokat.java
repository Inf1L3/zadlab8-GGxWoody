package figura;

public class Prostokat extends FiguraPlaska {

    private double BokA;
    private double BokB;

    public Prostokat(double BokA, double BokB) {
        this.BokA = BokA;
        this.BokB = BokB;
    }

    public double getBokA() {
        return BokA;
    }

    public void setBokA(double BokA) {
        this.BokA = BokA;
    }

    public double getBokB() {
        return BokB;
    }

    public void setBokB(double BokB) {
        this.BokB = BokB;
    }

    @Override
    public double obliczObwod() {
        return (BokA) * 2 + (BokB * 2);
    }

    @Override
    public double obliczPole() {
        return BokA * BokB;
    }

    @Override
    public String toString() {
        return super.toString() + " Prostokat{" + "BokA=" + BokA + ", BokB=" + BokB + " Obwod=" + this.obliczObwod() + " Pole=" + this.obliczPole() + '}';
    }

}
