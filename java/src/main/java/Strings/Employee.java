package Strings;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
     long id;
    String name;
    LocalDate dob;
    String gender;
    String department;

    public Employee(long id, String name, LocalDate dob, String gender, String department) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
