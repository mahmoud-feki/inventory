package com.sqli.inventory.inventory;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class InventoryApplication {

//    @Value("${env.profil}")
//    private String profil ; 
    
    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    @GetMapping("/all")
    public List<Data> getAllData() {

        List<Data> datas = new ArrayList<>();
        Data d1 = new Data("001", 10);
        
        //    d1.setProfil(profil);
        
        Data d2 = new Data("002", 15);
        datas.add(d1);
        datas.add(d2);

        return datas;

    }

    @GetMapping("/one/{id}")
    public Data getOne(@PathVariable String id) {

        Data d1 = new Data("001", 10);
        Data d2 = new Data("002", 15);

        if (id.equalsIgnoreCase(d1.getId())) {
            return d1;
        } else {
            return d2;
        }

    }

    class Data {

        private String id;
        private Integer quantity;
        private String profil ; 

        public String getProfil() {
            return profil;
        }

        public void setProfil(String profil) {
            this.profil = profil;
        }

        
        
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Data() {
        }

        public Data(String id, Integer quantity) {
            this.id = id;
            this.quantity = quantity;
            this.profil = "null";
        }

    }

}
