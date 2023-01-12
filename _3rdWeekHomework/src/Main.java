import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.CategoryHibernateDao;
import dataAccess.CourseHibernateDao;
import dataAccess.InstructorHibernateDao;
import dataAccess.InsturctorJdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        System.out.println("***********Category*********");

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Programlama"));
        categories.add(new Category(2, "Mobil Programlama"));

        CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDao(), loggers, categories);
        try {
            categoryManager.add(new Category(3, "Programlama"));
        } catch (Exception e) {
            System.out.println(e);

        }

        System.out.println("***********Course*********");

        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "Java", "Programlama", "Engin Demirog", 200));
        courses.add(new Course(2, "Kotlin", "Mobil Programlama", "Hasan ASIK", 2000));

        CourseManager courseManager = new CourseManager(new CourseHibernateDao(), courses, loggers);

        try {
            courseManager.add(new Course(3, "Flutter", "Mobil Uygulama", "Steve JOBS", -1));
        } catch (Exception e1) {
            System.out.println(e1);
        }

        System.out.println("***********INSTRUCTOR*********");

        Instructor newInstructor = new Instructor(1, "Engin Demirog");
        InstructorManager instructorManager = new InstructorManager(new InstructorHibernateDao(), loggers);
        instructorManager.add(newInstructor);

    }
}
