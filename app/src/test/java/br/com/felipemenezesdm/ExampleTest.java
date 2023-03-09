package br.com.felipemenezesdm;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExampleTest {
    @Test
    public void exampleTest() {
        Example example = new Example();
        Assertions.assertEquals(example.getString(), "teste");
    }

    @Test
    public void exampleMutationTest() {
        Example example = new Example();
        Assertions.assertNotEquals(example.getString(), "");
    }
}