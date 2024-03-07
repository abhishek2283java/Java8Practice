package junitdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author  : Abhishek
 * @since   : 2024-03-07, Thursday
 **/
@Tag(value = "ecomm-unit-tests")
@Tag(value = "ecomm")
public class ECommerceUnitTest {

    @Test
    @DisplayName("Unit Test 1")
    public void test_1(){
        System.out.println("Ran Unit test - 1");
    }

    @Test
    @DisplayName("Unit Test 2")
    public void test_2(){
        System.out.println("Ran Unit test - 2");
    }

    @Test
    @DisplayName("Sanity Test")
    @Tag("ecomm-sanity")
    public void test_3(){
        System.out.println("Ran Sanity test");
    }
}
