package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class RecordWithCustomConstructorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void timeStamp() {
        new RecordWithCustomConstructor(2L, "wrong data");
    }

    @Test
    void data() {
    }
}
