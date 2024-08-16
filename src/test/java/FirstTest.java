import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class FirstTest {

    @BeforeAll
    static void beforeAll(){

    }

    @BeforeEach
    void beforeEach(){

    }


    @AfterEach
    void afterAll(){

    }

    @Test
    void firstTest(){
        Assertions.assertTrue(3 > 2);
    }
}
