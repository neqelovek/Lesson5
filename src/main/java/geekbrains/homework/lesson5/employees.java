package geekbrains.homework.lesson5;

public class employees {
    private String Name;
    private String position;
    private String email;
    private String phoneNamber;
    private int salary;
    private int age;

    public employees(String Name, String position, String email, String phoneNamber, int salary, int age) {
        this.Name = Name;
        this.position = position;
        this.email = email;
        this.phoneNamber = phoneNamber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void printInfoEmployees(){
        System.out.printf(
                "Employee - name: %s, position: %s, email: %s, poneNumber: %s, salary: %s, age: %s", Name, position,email, phoneNamber, salary, age
        );
        System.out.println(" ");
    }
}

