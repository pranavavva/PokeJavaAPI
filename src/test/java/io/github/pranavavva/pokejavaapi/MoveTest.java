package io.github.pranavavva.pokejavaapi;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class MoveTest {

    private Move testMove = Mockito.mock(Move.class,
            Mockito.withSettings().useConstructor("Test move", Type.NORMAL, MoveCategory.PHYSICAL, 100, 100, 1.0)
                    .defaultAnswer(Mockito.CALLS_REAL_METHODS));

    @Test
    public void testGetName() {
        assertEquals("Test move", testMove.getName());
    }

    @Test
    public void testGetType() {
        assertEquals(Type.NORMAL, testMove.getType());
    }

    @Test
    public void testGetCategory() {
        assertEquals(MoveCategory.PHYSICAL, testMove.getCategory());
    }

    @Test
    public void testGetPower() {
        assertEquals(100, testMove.getPower());
    }

    @Test
    public void testGetPoints() {
        assertEquals(100, testMove.getPoints());
    }

    @Test
    public void testGetAccuracy() {
        assertEquals(1.0, testMove.getAccuracy());
    }

}