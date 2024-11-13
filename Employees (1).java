
public class Employees   { 
    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;
    public Employees (String _name, String _position, String _email, String _phone, double _salary, int _age) {
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
    Employees[] employeeArray = new Employees[5];
    employeeArray[0] = new Employees("Иванов Иван Петрович", "инженер", "ivanov@gmail.com", "89885554422", 120000.00, 38);
    employeeArray[1] = new Employees("Петров Николай Сергеевич", "механик", "petrov@gmail.com", "89884444422", 80000.00, 31);
    employeeArray[2] = new Employees("Сидоров Петр Тимофеевич", "водитель", "sidorov@gmail.com", "89883334422", 100000.00, 28);
    employeeArray [3] = new Employees("Смирнова Елена Ивановна", "главный бухгалтер", "smirnova@gmail.com", "89995554422", 130000.00, 47);
    employeeArray[4] = new Employees("Смирнов Сергей Алексеевич", "директор", "smirnov@gmail.com", "89887774422", 150000.00, 38);
    
    for (Employees employee:  employeeArray) {
            if (employee != null) {
                employee.info();
            }
        }
    }
}    
 
