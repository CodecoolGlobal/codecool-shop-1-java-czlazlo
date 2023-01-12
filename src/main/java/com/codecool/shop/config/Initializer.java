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
        Supplier GLS = new Supplier("GLS", "Man");
        supplierDataStore.add(GLS);
        Supplier DPD = new Supplier("DPD", "Woman");
        supplierDataStore.add(DPD);

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
        ProductCategory snoop = new ProductCategory("Snoop", "Man", "Amazing golden tooth just for you, straightly from Snoop Dogg's mouth!");
        productCategoryDataStore.add(snoop);
        ProductCategory chris = new ProductCategory("Chris", "Man", "The amazing Thor's hair ... You can hook up his hair on yours, and Chris Hemsworth will be with you always, and forever.");
        productCategoryDataStore.add(chris);
        ProductCategory twopac = new ProductCategory("2Pac", "Man", "If you want something different from the others ... The bullets from 2Pac. ");
        productCategoryDataStore.add(twopac);

        //setting up products and printing it
        productDataStore.add(new Product("Britney Spears' chewing gum", new BigDecimal("499"), "USD", "Fantastic price. Large content ecosystem. Good parental controls. Helpful technical support.", britney, DPD, true));
        productDataStore.add(new Product("Pamela Anderson's Baywatch swimsuit", new BigDecimal("599"), "USD", "Keyboard cover is included. Fanless Core m5 processor. Full-size USB ports. Adjustable kickstand.", pamela, DPD, true));
        productDataStore.add(new Product("Harrison Ford's Indiana Jones whip", new BigDecimal("699"), "USD", "Amazon's latest.", harrison, DPD, true));
        productDataStore.add(new Product("Billie Eilish's outgrown clothes", new BigDecimal("299"), "USD", "Billie wears oversize clothes... so she will never outgrown her clothes... but you can pay a lot of money for it to us, but your order will never deliver", billie, GLS, true));
        productDataStore.add(new Product("Michael Jackson's nose", new BigDecimal("1599"), "USD", "You need a plastic surgery for nose? AWESOME! You can buy Jacko's nose for yourself for a wonderful price.", michael, DPD, true));
        productDataStore.add(new Product("David Beckham's underpants", new BigDecimal("199"), "USD", "Do you want an underpants, that had a celebrity's jewelry in it? BUY IT!", david, DPD, true));
        productDataStore.add(new Product("Snoop Dogg's gold teeth", new BigDecimal("1299"), "USD", "Amazing golden tooth just for you, straightly from Snoop Dogg's mouth!", snoop, GLS, true));
        productDataStore.add(new Product("Chris Hemsworth's hair", new BigDecimal("399"), "USD", "The amazing Thor's hair ... You can hook up his hair on yours, and Chris Hemsworth will be with you always, and forever.", chris, GLS, true));
        productDataStore.add(new Product("The bullets which killed 2Pac", new BigDecimal("899"), "USD", "If you want something different from the others ... The bullets from 2Pac. ", twopac, GLS, true));
    }
}
