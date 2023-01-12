package dataAccess;

import entities.Category;
import entities.Course;

public class CourseJdbcDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veri tabanina eklendi.");
    }
}
