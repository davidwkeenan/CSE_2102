package c;

public class Hybrid implements ElectricInterface, GasolineInterface {
    private static final double MPG_E = 33.7;

    private double gasMPG;
    private double gallons;
    private double costperGallon;

    private double miles;

    private double MPGe;
    private double kWh;
    private double costperkWh;

    public double calcGasMPG() {
        gasMPG = miles/gallons;
        return gasMPG;
    }
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }
    public void setCostperGallon(double cost) {
        this.costperGallon = cost;
    }

    public double calcMPGe() {
        MPGe = (miles/kWh) * MPG_E;
        return MPGe;
    }
    public void setElectricMiles(double totalElectricMiles) {
        this.miles = totalElectricMiles;
    }
    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }
    public void setCostperkWh(double cost) {
        this.costperkWh = cost;
    }
}