import static org.junit.jupiter.api.Assertions.*;

class First2CharsTest {
   First2Chars First2Chars;

    @BeforeEach
      void setup() {
        First2Chars = new First2Chars();
        }

    @Test
      void test1() {
        assertEquals("BCD", First2Chars.first("ABCD"));
        }

    @Test
      void test2() {
        assertEquals("CD", First2Chars.first("AACD"));
        }

    @Test
      void test3() {
        assertEquals("BCD", First2Chars.first("BACD"));
        }

    @Test
      void test4() {
        assertEquals("BBAA", First2Chars.first("BBAA"));
        }

    @Test
      void test5() {
       assertEquals("BAA", First2Chars.first("AABAA"));
       }
}
