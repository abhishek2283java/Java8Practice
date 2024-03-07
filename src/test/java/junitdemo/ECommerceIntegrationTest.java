package junitdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author  : Abhishek
 * @since   : 2024-03-07, Thursday
 **/
@Tag("integration")
@Tag(value = "ecomm")
public class ECommerceIntegrationTest {

    @Test
    @DisplayName("Integration Test 1")
    public void test_1(){
        System.out.println("Integration test - 1");
    }

    @Test
    @DisplayName("Integration Test 2")
    public void test_2(){
        System.out.println("Integration test - 2");
    }
}
