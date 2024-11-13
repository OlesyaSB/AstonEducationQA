public class Employee   { 
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;
    public Employee (String _name, String _position, String _email, String _phone, double _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }
    
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age); 
    }
    
public static void main(String args[]) {
    Employee Employee_1 = new Employee("Иванов Иван Петрович", "инженер", "ivanov@gmail.com", "89885554422", 120000.00, 38);
    Employee_1.info();
}    
}  
