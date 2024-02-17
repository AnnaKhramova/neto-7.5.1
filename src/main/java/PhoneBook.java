import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String, String> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public int add(String name, String phoneNumber) {
        book.put(phoneNumber, name);
        return book.size();
    }

    public String findByNumber(String phoneNumber) {
        return book.get(phoneNumber);
    }

    public String findByName(String name) {
        return null;
    }
}
