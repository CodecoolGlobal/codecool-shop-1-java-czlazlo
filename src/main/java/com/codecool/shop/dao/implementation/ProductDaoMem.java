package com.codecool.shop.dao.implementation;


import com.codecool.shop.dao.CartDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProductDaoMem implements ProductDao {

    private List<Product> data = new ArrayList<>();
    private static ProductDaoMem instance = null;

    /* A private Constructor prevents any other class from instantiating.
     */
    private ProductDaoMem() {
    }

    public static ProductDaoMem getInstance() {
        if (instance == null) {
            instance = new ProductDaoMem();
        }
        return instance;
    }
    public void decreaseQuantity(Product product){
        product.setQuantity(-1);
    }

    public void checkIfOutOfStock(List<Product> products){
        for (Product product : products) {
            if(product.getQuantity() < 1){
                product.setInStock(false);
            }
            System.out.println(product + " is now out of stock");
        }
    }

    @Override
    public void add(Product product) {
        product.setId(data.size() + 1);
        data.add(product);
    }

    @Override
    public Product find(int id) {
        return data.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remove(int id) {
        data.remove(find(id));
    }

    @Override
    public List<Product> getAll() {
        return data;
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        return data.stream().filter(t -> t.getSupplier().equals(supplier)).collect(Collectors.toList());
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        return data.stream().filter(t -> t.getProductCategory().equals(productCategory)).collect(Collectors.toList());
    }

    @Override
    public List<Product> getByAvailability() {
        return data.stream()
                .filter(Product::isInStock) // for inStock
//                .filter(x -> !x.isInStock()) // for outOfStock
                .collect(Collectors.toList());
    }
    public List<Product> getByOutOfStock(){
        return data.stream()
                .filter(x -> !x.isInStock()) // for outOfStock
                .collect(Collectors.toList());
    }


}
