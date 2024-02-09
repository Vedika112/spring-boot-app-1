package com.app.demo.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApplicationTests {

    private String hello;

    @BeforeEach
    void setUp() {
        hello = "Hello";
    }

    @Test
    void testPrintHello() {
        System.out.println(hello);
        assertThat(hello).isNotNull();
    }
}

