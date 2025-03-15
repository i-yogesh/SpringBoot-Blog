package com.escanor.starter.WebStarter.service;

import com.escanor.starter.WebStarter.model.Product;
import com.escanor.starter.WebStarter.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"iPhone",70000),
//            new Product(102,"MacBook",90000),
//            new Product(103, "bottle", 500)
//    ));

    public List<Product> getProducts(){
//        return products;
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProductId() == prodId)
//                .findFirst()
//                .get();
        return repo.findById(prodId).orElse(new Product(-1,"Not Found",0));
    }

    public void addProduct(Product prod) {
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0; i<products.size(); i++){
//            if(products.get(i).getProductId() == prod.getProductId()){
//                index=i;
//                break;
//            }
//        }
//        products.set(index, prod);
//        System.out.println(products);

        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0; i<products.size(); i++){
//            if(products.get(i).getProductId() == prodId){
//                index=i;
//                break;
//            }
//        }
//        products.remove(index);

        repo.deleteById(prodId);
    }
}
