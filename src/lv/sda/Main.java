package lv.sda;

public class Main {

    public static void main(String[] args) {
        Employee[] javaEmployees = {
                new Employee("George", 35, "J12", "Microsoft"),
                new Employee("Dana", 29, "H15", "Microsoft"),
                new Employee("Harry", 28, "U23", "Microsoft")
        };

        Employee[] javascriptEmployees = {
                new Employee("Nathan", 31, "I91", "Google"),
                new Employee("Jane", 42, "A22", "Google"),
                new Employee("Jordan", 22, "O23", "Google")
        };

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javascriptEmployees);

        System.out.println("The average age of Microsoft employees is " + microsoft.getAverage());
        System.out.println("The average age of Google employees is " + google.getAverage());
    }
}
