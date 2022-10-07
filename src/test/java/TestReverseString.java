import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseString {
    ReverseString sut;
    @BeforeAll
    public static void iniSut() {
        System.out.println("Running test");
    }

    @AfterAll
    public static void completeSut() {
        System.out.println("Test completed");
    }
    @BeforeEach
    public void initEachTestFourth() {

        sut = new ReverseString();
        System.out.println(ReverseString.class + " создан");
    }

    @AfterEach
    public void afterEachTestFourth() {
        sut = null;
        System.out.println(ReverseString.class + " обнулен");
    }
    @Test
    public void testReverseString () {
        String name = "dimas";
        String expected = "sami2d";
        String result = sut.reverseString(name);
        assertEquals(expected,result);
    }
    @Test
    public void testReverseStringHamcrestContainsString () {
        String name = "dimas";
        String result = sut.reverseString(name);
        assertThat(result, Matchers.containsString("aboba"));
    }
    @Test
    public void testReverseStringHamcrestEndsWith () {
        String name = "";
        String result = sut.reverseString(name);
        assertThat(result, Matchers.endsWith("."));
    }

}
