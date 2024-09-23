package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.Hybrid;

public class HybridTests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
    public void calcGasMPGTest() {
        double miles = 10;
        double gallons = 100;
        hybrid.setGallonsfromGas(gallons);
        hybrid.setMilesfromGas(miles);
        double actualMPG = hybrid.calcGasMPG();
        double expectedMPG = miles / gallons;
        assertTrue(Math.abs(actualMPG - expectedMPG) < 0.01);
    }

    @Test
    public void calcMPGeTest() {
        double miles = 100;
        double kWh = 10;
        double MPG_E = 33.7;
        hybrid.setElectricMiles(miles);
        hybrid.setTotalkWh(kWh);
        double actualMPGe = hybrid.calcMPGe();
        double expectedMPGe = miles / kWh * MPG_E;
        assertTrue(Math.abs(actualMPGe - expectedMPGe) < 0.01);
    }
}