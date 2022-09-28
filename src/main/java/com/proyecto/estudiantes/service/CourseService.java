package com.proyecto.estudiantes.service;

import java.util.List;

import com.proyecto.estudiantes.Entity.Course;
import com.proyecto.estudiantes.Repository.ICourseRepository;

public class CourseService implements ICourseService {

    private ICourseRepository courseRepository;

    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAllSortByName();
    }

    @Override
    public List<Course> getCourseByName(String name) {
        return courseRepository.findByTitleContaining(name);
    }

    @Override
    public List<Course> getCourseByFee(double fee) {
        return courseRepository.findByFeeLessThan(fee);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getReferenceById(id);

    }

    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

}
