package by.jrr.ruslan.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> productList;

    public Shop() {
        productList = new ArrayList<>();
    }

    public Shop(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getListProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public Product findProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findProductsByPrice(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        List<Product> rangeList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice().doubleValue() >= minPriceRange.doubleValue() && product.getPrice().doubleValue() <= maxPriceRange.doubleValue()) {
                rangeList.add(product);
            }
        }
        return rangeList;
    }
}
