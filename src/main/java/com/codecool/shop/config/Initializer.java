package com.codecool.shop.config;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.SupplierDao;
import com.codecool.shop.dao.implementation.ProductCategoryDaoMem;
import com.codecool.shop.dao.implementation.ProductDaoMem;
import com.codecool.shop.dao.implementation.SupplierDaoMem;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.math.BigDecimal;

@WebListener
public class Initializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductDao productDataStore = ProductDaoMem.getInstance();
        ProductCategoryDao productCategoryDataStore = ProductCategoryDaoMem.getInstance();
        SupplierDao supplierDataStore = SupplierDaoMem.getInstance();

        //setting up a new supplier
        Supplier amazon = new Supplier("Amazon", "Digital content and services");
        supplierDataStore.add(amazon);
        Supplier lenovo = new Supplier("Lenovo", "Computers");
        supplierDataStore.add(lenovo);

        //setting up a new product category
        ProductCategory dress = new ProductCategory("Dress", "Underwear", "Just the famous person used it.");
        ProductCategory item = new ProductCategory("Item", "Item", "A used item.");
        ProductCategory bodyPart = new ProductCategory("Body part", "Item", "Body part.");

        productCategoryDataStore.add(dress);
        productCategoryDataStore.add(item);
        productCategoryDataStore.add(bodyPart);



        //setting up products and printing it
        productDataStore.add(new Product("Britney Spears' chewing gum", new BigDecimal("49.9"), "USD", "Fantastic price. Large content ecosystem.", item, amazon));
        productDataStore.add(new Product("Pamela Anderson's Baywatch swimsuit", new BigDecimal("479"), "USD", "Keyboard cover is included.", dress, lenovo));
        productDataStore.add(new Product("Harrison Ford's Indiana Jones whip", new BigDecimal("89"), "USD", "Amazon's latest.", item, amazon));
        productDataStore.add(new Product("Billie Eilish's outgrown clothes", new BigDecimal("89"), "USD", "Amazon...", dress, amazon));
        productDataStore.add(new Product("Michael Jackson's nose", new BigDecimal("89"), "USD", "Amazon...", bodyPart, amazon));
        productDataStore.add(new Product("David Beckham's underpants", new BigDecimal("89"), "USD", "Amazon...", item, amazon));
        productDataStore.add(new Product("Snoop Dogg's gold teeth", new BigDecimal("89"), "USD", "Amazon...", bodyPart, amazon));
        productDataStore.add(new Product("Chris Hemsworth's hair", new BigDecimal("89"), "USD", "Amazon...", bodyPart, amazon));
        productDataStore.add(new Product("The bullets which killed 2Pac", new BigDecimal("89"), "USD", "Amazon...", bodyPart, amazon));
    }
}
