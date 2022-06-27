package com.example.demo.model.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {
    @Id
    private Integer employeeId;
    private String employeeName;
    @Column(columnDefinition = "date")
    private String birthDay;
    private String employeeIdCard;
    private String salary;
    private String phone;
    private String email;
    private String address;
    private Integer divisionId;
    private Integer educationDegreeId;
    private Integer positionId;
    private String userName;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, String birthDay, String employeeIdCard, String salary,
                    String phone, String email, String address, Integer divisionId, Integer educationDegreeId,
                    Integer positionId, String userName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthDay = birthDay;
        this.employeeIdCard = employeeIdCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.divisionId = divisionId;
        this.educationDegreeId = educationDegreeId;
        this.positionId = positionId;
        this.userName = userName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public Integer getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Integer educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
