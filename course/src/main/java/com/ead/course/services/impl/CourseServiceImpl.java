package com.ead.course.services.impl;
import com.ead.course.services.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    final CourseService courseService;

    public CourseServiceImpl(CourseService courseService) {
        this.courseService = courseService;
    }


}
