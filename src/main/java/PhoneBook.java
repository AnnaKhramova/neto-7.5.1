import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
        Optional<String> result = book.entrySet()
                .stream()
                .filter(entry -> name.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        return result.orElse(null);
    }

    public void printAllNames() {
        book.values().stream().sorted().forEach(System.out::println);
    }
}
