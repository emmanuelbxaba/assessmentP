package com.companyXYZ;

public class Student {


    private int studentId;                //  primary key in the database
    private String name;
    private String surname;
    private int age;
    private String curriculum;

    //public Student(){

    //}

    public Student(int studentId, String name, String surname, int age, String curriculum) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.curriculum = curriculum;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }


    @Override
    public String toString() {
        return "Student {" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", curriculum='" + curriculum + '\'' +
                '}';
    }
}
