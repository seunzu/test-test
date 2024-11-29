package com.example.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertThat(3).isEqualTo(1+1);
    }

}
