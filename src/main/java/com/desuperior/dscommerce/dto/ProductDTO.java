package com.desuperior.dscommerce.dto;

import com.desuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {


    private Long id;
    @Size(min = 3, max = 80 , message = " O nome precisa ter de 3 a 80 caracteres")
    @NotBlank( message = " Campo requerido")
    private String name;
    @Size(min = 10 , message = " A deescrição precisa ter no minimo 10 caracteres")
    @NotBlank( message = " Campo requerido")
    private String description;
    @Positive(message = " O preço tem que ser positivo")
    private double price;
    private String imgUrl;


    public ProductDTO() {
        // construtor vazio para o Jackson
    }

    public ProductDTO(Long id, String name, String description, double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
