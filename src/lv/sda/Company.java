package lv.sda;

public class Company {

    private Employee [] employees;
    private String companyName;

    public Company(String companyName, Employee[] employees){
        this.companyName = companyName;
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //Get the average age for a company
    public float getAverage(){
        float sum = 0;
        //Use a for loop to add the values of the employees array together
        for (int i = 0; i <this.employees.length ; i++) {
            sum += this.employees[i].getAge();
        }
        return sum / this.employees.length;
    }
}
