package com.tms.utils;

import com.tms.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String INSERT_PRODUCT_QUERY = "INSERT INTO " +
            "products(name,description,price,number,availability) VALUES(?,?,?,?,?)";
    private static final String GET_ALL_PRODUCT_QUERY = "SELECT * FROM products";
    private static final String UPDATE_PRODUCT_QUERY = "UPDATE product SET number = ? WHERE id = ?;";
    private static final String DELETE_PRODUCT_QUERY = "DELETE FROM products WHERE id = ?";

    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_PRODUCT_QUERY);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nameProduct = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int number = rs.getInt("number");
                boolean availability = rs.getBoolean("availability");
                products.add(new Product(id, nameProduct, description, price, number, availability));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return products;
    }

    public static List<Product> saveProduct(Product product) {
        List<Product> updatedProduct = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT_QUERY);
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, product.getNumber());
            preparedStatement.setBoolean(5, product.isAvailability());
            preparedStatement.executeUpdate();

            updatedProduct = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProduct;
    }

    public static List<Product> updateProduct(int productId, int number) {
        List<Product> updatedProducts = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
            preparedStatement.setInt(1, number);
            preparedStatement.setInt(2, productId);
            preparedStatement.executeUpdate();

            updatedProducts = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProducts;
    }

    public static List<Product> deleteProduct(int productId) {
        List<Product> updatedProduct = new ArrayList<>();

        try (Connection connection = DbUtils.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
            preparedStatement.setInt(1, productId);
            preparedStatement.execute();

            updatedProduct = getAllProducts();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return updatedProduct;
    }
}
//()_