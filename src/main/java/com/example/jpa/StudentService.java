package com.example.jpa;

import com.example.jpa.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public void create(
            String name,
            Integer age,
            String phone,
            String email
    ) {

    }

    public StudentDto readStudent(Long id) {
        return new StudentDto();
    }

    public List<StudentDto> readStudentAll() {
        return new ArrayList<>();
    }

    public void update(
            Long id,
            String name,
            Integer age,
            String phone,
            String email
    ) {

    }

    public void delete(Long id) {

    }

}
