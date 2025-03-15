package com.meliodas.starter.Hello.World;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    @Autowired
//    private Laptop laptop;

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

//    Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        System.out.println("Elizabeth and Meliodas for a 1000 years");
//        laptop.compile();
          computer.compile();
    }
}
