import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kylehuynh - meruse
 * CIS175 - Fall 2023
 * Jan 24, 2024
 */

public class CarTest {

    @Test
    public void testCarInfo() {
        Car car = new Car("Ferrari", "Enzo", 2002);
        assertEquals("2002 Ferrari Enzo", car.displayInfo());
        
        assertTrue(car.getYear() > 2000);
        
        assertNotEquals("Toyota", car.getMake());
    }

    @Test
    public void testCarMake() {
        Car car = new Car("Honda", "Civic", 2001);
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void testCarYear() {
        Car car = new Car("Ford", "Mustang", 2020);
        assertEquals(2020, car.getYear());
    }
}

