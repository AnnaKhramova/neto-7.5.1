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
        String name = "Ася";
        book.add(name, "+9 999 555 84 84");
        String result = book.findByNumber("+9 999 555 84 84");
        //Почему не работает, если сравнивать assertEquals("Ася", result)?
        //В обычном проекте, не maven, все нормально работает
        Assertions.assertEquals(name, result);
    }
}
