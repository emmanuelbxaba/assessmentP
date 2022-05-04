package com.companyXYZ;

import java.util.List;

public interface StudentDao {

    public void save(Student s);
    public void update(Student s);
    public void delete(int StudentId);
    public Student getStudent(int StudentId);
    public List<Student> getStudents();


}
