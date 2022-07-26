package com.tms.model;

import java.util.List;
import java.util.Objects;

public class Category {
    private String id;
    private String name;
    private String nameImage;
    private List<Product> productList;

    public Category(String name, String nameImage) {
        this.name = name;
        this.nameImage = nameImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name) && Objects.equals(nameImage, category.nameImage) && Objects.equals(productList, category.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameImage, productList);
    }
}
