package com.example.ran.singletonexample;


public class Manager {
    private  String name;
    private  double salary;
    private static Manager managerObject = null;

    private Manager (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static Manager getInstance (String managerName, double managerSalary) {
        if (managerObject == null){
            managerObject = new Manager(managerName, managerSalary);
        }

        return managerObject;
    }

    public  String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
