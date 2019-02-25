package se.iths.martin.demo2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {


    private @Id @GeneratedValue long id;
    private String productName;
    private String description;
    private int price;

}
