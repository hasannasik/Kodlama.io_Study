package dataAccess;

import entities.Category;

public class CategoryHibernateDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veri tabanina eklendi.");
    }
}
