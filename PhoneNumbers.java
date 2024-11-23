import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumbers {
    private HashMap<String, ArrayList<String>> phoneNumbers;

    public PhoneNumbers() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String name, String phoneNum) {
        if (phoneNumbers.containsKey(name)) {
            phoneNumbers.get(name).add(phoneNum);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNum);
            phoneNumbers.put(name, numbers);
        }
    }

    public ArrayList<String> get(String name) {
        return phoneNumbers.get(name);
    }
}



