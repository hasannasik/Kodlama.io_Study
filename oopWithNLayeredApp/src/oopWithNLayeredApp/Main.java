package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.Logging.DataBaseLogger;
import oopWithNLayeredApp.core.Logging.FileLogger;
import oopWithNLayeredApp.core.Logging.Logger;
import oopWithNLayeredApp.core.Logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"IphoneXR",12500);
        Logger[] loggers= {new MailLogger(),new FileLogger(),new DataBaseLogger()};
        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
