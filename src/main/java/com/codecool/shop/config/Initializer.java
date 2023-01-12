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
        Supplier amazon = new Supplier("Amazon", "Man");
        supplierDataStore.add(amazon);
        Supplier lenovo = new Supplier("Lenovo", "Woman");
        supplierDataStore.add(lenovo);

        //setting up a new product category
        ProductCategory britney = new ProductCategory("Britney", "Woman", "Britney's gum is really good if you want to glue something.");
        productCategoryDataStore.add(britney);
        ProductCategory pamela = new ProductCategory("Pamela", "Woman", "She wear it for a long time, when the friends went out to her... but she hasn't got friends anymore so Pamela wants to sell it.");
        productCategoryDataStore.add(pamela);
        ProductCategory harrison = new ProductCategory("Harrison", "Man", "If you want to surprise your boyfriend/girlfriend you can buy Harrison's whip... You can cosplay him with it.");
        productCategoryDataStore.add(harrison);
        ProductCategory billie = new ProductCategory("Billie", "Woman", "Billie wears oversize clothes... so she will never outgrown her clothes... but you can pay a lot of money for it to us, but your order will never deliver   .");
        productCategoryDataStore.add(billie);
        ProductCategory michael = new ProductCategory("Michael", "Man", "You need a plastic surgery for nose? AWESOME! You can buy Jacko's nose for yourself for a wonderful price.");
        productCategoryDataStore.add(michael);
        ProductCategory david = new ProductCategory("David", "Man", "Do you want an underpants, that had a celebrity's jewelry in it? BUY IT!");
        productCategoryDataStore.add(david);

        //setting up products and printing it
        productDataStore.add(new Product("Britney Spears' chewing gum", new BigDecimal("49.9"), "USD", "Fantastic price. Large content ecosystem. Good parental controls. Helpful technical support.", britney, amazon, true, 1));
        productDataStore.add(new Product("Pamela Anderson's Baywatch swimsuit", new BigDecimal("479"), "USD", "Keyboard cover is included. Fanless Core m5 processor. Full-size USB ports. Adjustable kickstand.", pamela, lenovo, true, 1));
        productDataStore.add(new Product("Harrison Ford's Indiana Jones whip", new BigDecimal("89"), "USD", "Amazon's latest.", harrison, amazon, true,1));
        productDataStore.add(new Product("Billie Eilish's outgrown clothes", new BigDecimal("89"), "USD", "Amazon...", billie, amazon, true,1));
        productDataStore.add(new Product("Michael Jackson's nose", new BigDecimal("89"), "USD", "Amazon...", michael, amazon, true,1));
        productDataStore.add(new Product("David Beckham's underpants", new BigDecimal("89"), "USD", "Amazon...", david, amazon, true,1));
        productDataStore.add(new Product("Snoop Dogg's gold teeth", new BigDecimal("89"), "USD", "Amazon...", david, amazon, true,1));
        productDataStore.add(new Product("Chris Hemsworth's hair", new BigDecimal("89"), "USD", "Amazon...", david, amazon, true,1));
        productDataStore.add(new Product("The bullets which killed 2Pac", new BigDecimal("89"), "USD", "Amazon...", david, amazon, true, 5));
    }
}
