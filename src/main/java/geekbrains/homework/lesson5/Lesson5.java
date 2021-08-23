package geekbrains.homework.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        doTask();

    }


    static void doTask(){
        employees[] employees = new employees[5];
               employees[0] = new employees("Andrew", "Director", "Andrew@mail.com", "+79802365426", 100000, 55);
                employees[1] = new employees("Ivan", "Manager", "Ivan@mail.com", "+79805387654", 50000, 26);
                employees[2] = new employees("Dmitrii", "Engineer", "Dmitrii@mail.com", "+79805432312", 100000, 47);
                employees[3] = new employees("Aleksandra", "Accountant", "Aleksandra@mail.com", "+79805546381", 80000, 35);
                employees[4] = new employees("Karen", "Worker", "Karen@mail.com", "+79808864377", 22000, 40);

        printFilteredByAge(employees, 40);
    }
    static void printFilteredByAge(employees[]employees, int age){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age ){
                employees[i].printInfoEmployees();


            }

        }
        
    }
}
