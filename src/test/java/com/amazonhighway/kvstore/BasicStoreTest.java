package com.amazonhighway.kvstore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicStoreTest {

    @Test
    public void testPutAndGet() {
        BasicStore store = new BasicStore();
        store.put("name", "Motasem");
        assertEquals("Motasem", store.get("name"));
    }

    @Test
    public void testGetNonExistentKey() {
        BasicStore store = new BasicStore();
        assertNull(store.get("doesNotExist"));
    }

    @Test
    public void testPutDeleteGet() {
        BasicStore store = new BasicStore();
        store.put("city", "Amman");
        assertEquals("Amman", store.delete("city")); // delete should return value
        assertNull(store.get("city")); // after delete, should be null
    }

    @Test
    public void testUpdateExistingKey() {
        BasicStore store = new BasicStore();
        store.put("language", "Java");
        store.put("language", "Python"); // update
        assertEquals("Python", store.get("language"));
    }
}
