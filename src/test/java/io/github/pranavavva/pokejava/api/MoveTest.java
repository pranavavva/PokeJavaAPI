package io.github.pranavavva.pokejava.api;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class MoveTest {

    private Move testMove = Mockito.mock(Move.class,
    Mockito.withSettings().useConstructor("Test move", Type.NORMAL, MoveCategory.PHYSICAL, 100, 100, 1.0)
            .defaultAnswer(Mockito.CALLS_REAL_METHODS));

    @Test
    public void testName() {
        assertEquals("Test move", testMove.getName());
    }

    @Test
    public void testType() {
        assertEquals(Type.NORMAL, testMove.getType());
    }

    @Test
    public void testCategory() {
        assertEquals(MoveCategory.PHYSICAL, testMove.getCategory());
    }

    @Test
    public void testPower() {
        assertEquals(100, testMove.getPower());
    }

    @Test
    public void testPoints() {
        assertEquals(100, testMove.getPoints());
    }

    @Test
    public void testAccuracy() {
        assertEquals(1.0, testMove.getAccuracy());
    }

}