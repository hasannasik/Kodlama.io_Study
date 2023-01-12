package dataAccess;

import entities.Instructor;

public class InsturctorJdbcDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veri tabanina eklendi.");
    }
}
