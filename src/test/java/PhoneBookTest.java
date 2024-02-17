import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        int result = book.add("Виталик", "+9 999 555 36 36");
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook book = new PhoneBook();
        book.add("Виталик", "+9 999 555 36 36");
        book.add("Ася", "+9 999 555 84 84");
        String result = book.findByNumber("+9 999 555 84 84");
        Assertions.assertEquals("Ася", result);
    }

    @Test
    public void findByNameTest() {
        PhoneBook book = new PhoneBook();
        book.add("Виталик", "+9 999 555 36 36");
        book.add("Ася", "+9 999 555 84 84");
        String result = book.findByName("Виталик");
        Assertions.assertEquals("+9 999 555 36 36", result);
    }
}
