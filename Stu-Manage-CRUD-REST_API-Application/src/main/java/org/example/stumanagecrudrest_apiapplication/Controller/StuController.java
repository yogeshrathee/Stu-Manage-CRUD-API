package org.example.stumanagecrudrest_apiapplication.Controller;

import org.example.stumanagecrudrest_apiapplication.Model.Student;
import org.example.stumanagecrudrest_apiapplication.Service.StuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StuController {

    StuService stuService;

    public StuController(StuService stuService) {
        this.stuService = stuService;
    }

    @GetMapping("{stuRegNo}")
    public Student getStuDetails(@PathVariable("stuRegNo") String stuRegNo){
      return  stuService.getStuDetails(stuRegNo);


    }

    @GetMapping()
    public List<Student> getAllStuDetails(){
        return  stuService.getAllStuDetails();

    }

    @PostMapping
    public String createStuDetails(@RequestBody Student student){
       stuService.createStuDetails(student);
        return "Student ID Create Successfully !!";
    }

    @PutMapping
    public String updateStuDetails(@RequestBody Student student){
       stuService.updateStuDetails(student);
        return "Student details Update Successfully !!";
    }

    @DeleteMapping("{stuRegNo}")
    public String deleteStuDetails(@PathVariable("stuRegNo") String stuRegNo){
        stuService.deleteStuDetails(stuRegNo);
        return "Student ID Delete Successfully !!";
    }


}
