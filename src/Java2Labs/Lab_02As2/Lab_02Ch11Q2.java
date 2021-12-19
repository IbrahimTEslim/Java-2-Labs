package Java2Labs.Lab_02As2;

import java.util.Date;

public class Lab_02Ch11Q2 {
    public static void main(String[] args) {
        Person p=new Person("Ibrahim");
        Student s=new Student("Student");
        Employee e=new Employee("Employee");
        Faculty f=new Faculty("Faculty");
        Staff st=new Staff("Staff");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());
    }
    static class Person{
        protected String name,address,phoneNumber,email;

        public Person(String name) {this.name=name;  }
        public void setName(String name) {this.name = name;}
        public void setAddress(String address) {this.address = address;}
        public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber; }
        public void setEmail(String email) {this.email = email; }
        public String getName() {return name; }
        public String getAddress() {return address; }
        public String getPhoneNumber() {return phoneNumber; }
        public String getEmail() { return email; }
        public String toString() { return "Name: " + getName() + " Class: " + this.getClass().getName(); }

    }
    public static class Student extends Person {
        public final String freshMan = "Freshman",sophomore = "Sophomore",junior = "Junior",senior = "Senior";
        protected String status;

        public Student(String name) { super(name); }
        public Student(String name, String status) {
            super(name);
            this.status = status;
        }
        @Override
        public String toString() { return "Name: " + getName() + " Class: " + this.getClass().getName(); }
    }
    public static class Employee extends Person {
        protected double salary;
        protected String office;
        protected MyDate dateHired;
        public Employee(String name) {this(name, 0, "none", new MyDate());}
        public Employee(String name, double salary, String officeHours, MyDate hiredDate) {
            super(name);
            this.salary = salary;
            this.office = officeHours;
            this.dateHired = hiredDate;
        }
        public double getSalary() { return salary;}
        public void setSalary(double salary) {this.salary = salary;}
        public String getOffice() { return office; }
        public void setOffice(String office) { this.office = office; }
        public MyDate getDateHired() {return dateHired;}
        public void setDateHired(MyDate dateHired) {this.dateHired = dateHired; }
        @Override
        public String toString() {return "Name: " + getName() + " Class: " + this.getClass().getName(); }
    }
    public static class Faculty extends Employee {
        public final String LECTURER = "Lecturer",ASSISTANT_PROFESSOR = "Assistant Professor",
                ASSOCIATE_PROFESSOR = "Associate Professor",PROFESSOR = "Professor";
        protected String officeHours,rank;
        public Faculty(String name) {this(name, "None", "None");}
        public Faculty(String name, String officeHours, String rank) {
            super(name);
            this.officeHours = officeHours;
            this.rank = rank;
        }
        public String getOfficeHours() {return officeHours; }
        public void setOfficeHours(String officeHours) {this.officeHours = officeHours; }
        public String getRank() { return rank;}
        public void setRank(String rank) {this.rank = rank;}
        @Override
        public String toString() {return "Name: " + getName() + " Class: " + this.getClass().getName();}
    }
    public static class Staff extends Employee {
        protected String title;
        public Staff(String name) { this(name, "None"); }
        public Staff(String name, String title) { super(name);this.title = title; }
        public String getTitle() {return title; }
        public void setTitle(String title) {this.title = title; }
        @Override
        public String toString() {return "Name: " + getName() + " Class: " + this.getClass().getName();}
    }
}
class MyDate{
    private int day,month,year;
    private Date date;
    public MyDate(){
        date = new Date();
        this.day= date.getDay();
        this.month=date.getMonth();
        this.year=date.getYear();
    }
    public MyDate(long elapsedTime){
        date=new Date(elapsedTime);
        this.day= date.getDay();
        this.month=date.getMonth();
        this.year=date.getYear();
    }
    public MyDate(int year,int month,int day){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
}
