package dataAccess;

import entities.Instructor;

public class InstructorHibernateDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veri tabanina eklendi.");
    }
}
