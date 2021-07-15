package lv.sda;

public class Employee extends Person{
    private String companyName;
    private String companyId;

    public Employee(String name, int age, String companyId, String companyName){
        super(name,age); //super refers the parent class
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
