package dataAccess;

import entities.Category;

public class CategoryJdbcDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veri tabanina eklendi.");
    }
}
