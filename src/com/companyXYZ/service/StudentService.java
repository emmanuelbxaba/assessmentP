package com.companyXYZ.service;

import com.companyXYZ.Student;
import com.companyXYZ.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public abstract class StudentService implements StudentDao {
    Connection conn = DbConnection.getConnections();

    @Override
    public void save(Student s) {


        try {
            Integer maybeNull = null;

            if (s.getStudentId() != maybeNull || s.getName() !=null || s.getSurname() !=null ||
            s.getAge() != maybeNull || s.getCurriculum() !=null ) {
                PreparedStatement statement = conn.
                        prepareStatement("insert into stud(studentId, name, surname, age, curriculum) values(?,?,?,?,?)");
                int i = statement.executeUpdate();
                System.out.println(i + "data inserted successfully");

            }
        } catch (Exception e) {

        }
    }

    @Override
    public void update(Student s) {

        try {
            Integer maybeNull = null;

            if (s.getStudentId() != maybeNull) {
                PreparedStatement statement = conn.
                        prepareStatement("update stud set (name =?, surname=?, age=?, curriculum=? where StudentID=?");
                        statement.setString(1, s.getName());
                        statement.setString(2, s.getSurname());
                        statement.setInt(3, s.getAge());
                        statement.setString(4, s.getCurriculum());
                        int i = statement.executeUpdate();
                        System.out.println(i + "data updated successfully");

            }
        } catch (Exception e) {

        }

    }

    @Override
    public void delete(int StudentId) {
        try {
            Integer maybeNull = null;
            if (StudentId != maybeNull) {

                PreparedStatement statement = conn.prepareStatement("delete from stud where studentid=?");
                statement.setInt(1, StudentId);
                int i = statement.executeUpdate();
                System.out.println(i + "data deleted successfully");

            }
        } catch ( Exception e) {

        }

    }

    @Override
    public Student getStudent(int StudentID) {

        Student student = null;
        try {
            PreparedStatement statement = conn.prepareStatement("select * from stud");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5));
            }

        } catch ( Exception e) {


        }
        return student;
    }

    @Override
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        Student student = null;
        try {
            PreparedStatement statement = conn.prepareStatement("select * from stud");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5));
                students.add(student);
            }

        } catch ( Exception e) {
            e.printStackTrace();


        }

        return students;
    }
}
