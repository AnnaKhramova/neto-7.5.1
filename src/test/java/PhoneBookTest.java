import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        int result = book.add("Виталик", "+9 999 555 36 36");
        Assertions.assertEquals(result, 1);
    }
}
