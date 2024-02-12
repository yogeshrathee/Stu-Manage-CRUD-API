package org.example.stumanagecrudrest_apiapplication.Service.Impl;

import org.example.stumanagecrudrest_apiapplication.Model.Student;
import org.example.stumanagecrudrest_apiapplication.Repository.StuRepository;
import org.example.stumanagecrudrest_apiapplication.Service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StuService {
@Autowired
    StuRepository stuRepository;
    public ServiceImpl(StuRepository stuRepository) {
        this.stuRepository = stuRepository;
    }


    @Override
    public String createStuDetails(Student student) {
        stuRepository.save(student);
        return "Success Created";
    }

    @Override
    public String updateStuDetails(Student student) {
        stuRepository.save(student);
        return "Success Updated";
    }

    @Override
    public String deleteStuDetails(String stuRegNo) {
        stuRepository.deleteById(stuRegNo);
        return "Success Deleted";
    }


    @Override
    public Student getStuDetails(String stuRegNo) {
       return stuRepository.findById(stuRegNo).get();

    }

    @Override
    public List<Student> getAllStuDetails() {
        return stuRepository.findAll();

    }
}
