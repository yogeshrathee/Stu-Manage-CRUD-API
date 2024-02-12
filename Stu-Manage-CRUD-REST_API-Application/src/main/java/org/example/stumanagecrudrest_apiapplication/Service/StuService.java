package org.example.stumanagecrudrest_apiapplication.Service;

import org.example.stumanagecrudrest_apiapplication.Model.Student;

import java.util.List;

public interface StuService {
    public String createStuDetails(Student student);
    public String updateStuDetails(Student student);
    public String deleteStuDetails(String stuRegNo);
    public Student getStuDetails(String stuRegNo);


    public List<Student> getAllStuDetails();
}
