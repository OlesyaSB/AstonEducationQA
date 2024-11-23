import java.util.ArrayList;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        PhoneNumbers phoneNumber = new PhoneNumbers();

        phoneNumber.add("Иванов", "13513513510");
        phoneNumber.add("Сидоров", "13513513511");
        phoneNumber.add("Петров", "13513513510");
        phoneNumber.add("Иванов", "13513513511");

        out.println("Номера фамилии Иванов:");
        ArrayList<String> ivanovNumbers = phoneNumber.get("Иванов");
        for (String number : ivanovNumbers) {
            out.println(number);
        }

        out.println("Номера фамилии Сидоров:");
        ArrayList<String> sidorovNumbers = phoneNumber.get("Сидоров");
        for (String number : sidorovNumbers) {
            out.println(number);
        }

        out.println("Номера фамилии Петров:");
        ArrayList<String> petrovNumbers = phoneNumber.get("Петров");
        for (String number : petrovNumbers) {
            out.println(number);
        }
    }
}
