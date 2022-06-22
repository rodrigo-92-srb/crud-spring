package com.rodrigo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rodrigo.model.Course;

@Repository
public class CourseRepository extends JpaRepository<Course, Long>{

    public List<Course> findAll() {
        return null;
    }

    public void deleteAll() {
    }

    public void save(Course c) {
    }
    


}
