package business;

import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> courses;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, Logger[] loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception {
        for (Course courseNew:courses)
        {
            if (course.getCourseName() == courseNew.getCourseName())
            {
                throw new Exception("Kurs ismi tekrar edemez !");
            }
            if (course.getCoursePrice() < 0)
            {
                throw new Exception("Kursun fiyati 0 dan kucuk olamaz");
            }
            courseDao.add(course);
            courses.add(course);

            for (Logger logger:loggers){
                logger.log(course.getCourseName());
            }
        }
    }
}
