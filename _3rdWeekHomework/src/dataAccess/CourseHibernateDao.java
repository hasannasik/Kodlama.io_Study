package dataAccess;

import entities.Category;
import entities.Course;

public class CourseHibernateDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veri tabanina eklendi.");
    }
}
