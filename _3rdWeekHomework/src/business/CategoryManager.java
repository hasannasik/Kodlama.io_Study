package business;

import dataAccess.CategoryDao;
import entities.Category;
import logging.Logger;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }
    public void add(Category category) throws Exception {
        for (Category categoryNew:categories) {
            if (category.getCategoryName()== categoryNew.getCategoryName())
            {
                throw new Exception("Kategori ismi tekrar edemez ! ");
            }
            categoryDao.add(category);
            categories.add(category);

            for (Logger logger:loggers){
                logger.log(category.getCategoryName());
            }



        }
    }

}
