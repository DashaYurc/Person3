package lv.sda;

import java.util.*;

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
        System.out.println(google.getEmployee().getName());

        //Homework
        ArrayList<Employee> amazonEmployee = new ArrayList<>();
        amazonEmployee.add(new Employee("Ginny",54,"O98","Amazon"));
        amazonEmployee.add(new Employee("Stefan", 45, "U55", "Amazon"));
        amazonEmployee.add(new Employee("Felix", 25, "P13", "Amazon"));


        System.out.println("Amazon employees names ArrayList : ");
        for(Employee str:amazonEmployee)
            System.out.println(str.getName() + " ");

        LinkedList<Employee> blizzardEmployees = new LinkedList<>();
        blizzardEmployees.add(new Employee("Henry", 18,"K35","Blizzard"));
        blizzardEmployees.add(new Employee("Rebeca", 28,"M77","Blizzard"));
        blizzardEmployees.add(new Employee("Damon", 35,"L91","Blizzard"));

        System.out.println("Blizzard employees names LinkedList: ");
        for(Employee str:blizzardEmployees){
            System.out.println(str.getName()+ " ");
        }

        ArrayList<Integer> studentScores = new ArrayList<>();
        studentScores.addAll(Arrays.asList(44,32,68,95,21,100,10,47,53,89,99,15,79,55,68,23,39,54,87,29));
        System.out.println("Students scores are: " + studentScores);

        Integer maxScore = Collections.max(studentScores);
        System.out.println("The highest score is: " + maxScore);




    }


}
