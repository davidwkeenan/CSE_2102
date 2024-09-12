package c;

public class HybridCar {

    public static void main(String[] args) {
        Hybrid aHybrid = new Hybrid();

        double miles = 300;
        aHybrid.setElectricMiles(miles);
        aHybrid.setTotalkWh(70.0);
        aHybrid.setGallonsfromGas(10);

        double MPG = aHybrid.calcGasMPG();
        double MPGe = aHybrid.calcMPGe();
        System.out.printf("MPG: %.2f\n", MPG);
        System.out.printf("MPGe: %.2f\n", MPGe);
        System.out.printf("Hybrid Average: %.2f\n", (MPG+MPGe)/2);
    }

}