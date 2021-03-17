package testgradle;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private NormalDistribution n;
    private App app;

    @BeforeEach
    void setUp() {
        n = new NormalDistribution();
        app = new App();
    }

    @Test
    void covidChanceEnMoyenneTest() {
        double response = app.covidChanceEnMoyenne(this.n, 5);

        assertEquals(0.99, response,0.1);
    }

    @Test
    void covidChanceDurreeTest() {
        double response =  app.covidChanceDurree(this.n, -6, 29);
        assertEquals(0.99, response, 0.1);
    }
}
