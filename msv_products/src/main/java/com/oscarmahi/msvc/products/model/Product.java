package com.oscarmahi.msvc.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="products")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)        //esto es sólo para que guarde la fecha y no la fecha y la hora o la hora sola, etc
    private Date createAt;

}
