package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

        @Test
    void fire_decreaseTorpedoCount() {
        // Arrange
        TorpedoStore store = new TorpedoStore(3);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertTrue(result);
        assertEquals(2, store.getTorpedoCount());
    }

        @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(3,1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertFalse(result);
        assertEquals(3, store.getTorpedoCount());
    }

        @Test
    void store_isEmpty() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertTrue(result);
        assertEquals(0, store.getTorpedoCount());
    }
        @Test
    void store_isnotEmpty() {
        // Arrange
        TorpedoStore store = new TorpedoStore(3);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertFalse(result);
        assertEquals(3, store.getTorpedoCount());
    }    
}
