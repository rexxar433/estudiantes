package com.proyecto.estudiantes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.estudiantes.Entity.Student;
import com.proyecto.estudiantes.Repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {

    private IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentRepository.findByNameContaining(name);
    }

}
