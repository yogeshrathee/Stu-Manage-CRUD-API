package org.example.stumanagecrudrest_apiapplication.Repository;

import org.example.stumanagecrudrest_apiapplication.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepository extends JpaRepository<Student,String> {

}
