package by.jrr.ruslan.shop;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AppTest {
    Shop shop;
    List<Product> listProducts = new ArrayList<>();

    Product butter;
    Product fork;
    Product book;
    Product table;
    Product apple;


    @Before
    public void setup() {
        shop = new Shop();

        butter = new Product("Butter", new BigDecimal("3.30"));
        fork = new Product("Fork", new BigDecimal("2.45"));
        book = new Product("Book", new BigDecimal("12.99"));
        table = new Product("Table", new BigDecimal("29.85"));
        apple = new Product("Apple", new BigDecimal("1.99"));

        listProducts = new ArrayList<>();
        listProducts.add(apple);
        listProducts.add(table);
        listProducts.add(book);
        listProducts.add(fork);
//        shop = new Shop(listProducts);
    }

    @Test
    public void addProductTest() {
        shop.addProduct(apple);
        shop.addProduct(table);
        shop.addProduct(butter);
//        shop.addProduct(fork);
//        shop.addProduct(book);

        assertEquals(3, shop.getListProducts().size());
        assertEquals("Table", shop.getListProducts().get(1).getName());

    }

    @Test
    public void addProductTestWithConstructor() {
        Shop newShop = new Shop(listProducts);
        newShop.addProduct(apple);
        assertEquals(5, listProducts.size());
    }

    @Test
    public void deleteProductTest() {
        shop.addProduct(apple);
        shop.addProduct(table);
        shop.addProduct(butter);

        shop.deleteProduct(table);
        assertFalse(shop.getListProducts().contains(table));
        assertEquals(2, shop.getListProducts().size());
    }

    @Test
    public void findOutProductUsingItName() {
        shop.addProduct(apple);
        shop.addProduct(table);
        shop.addProduct(butter);
        Product expected = new Product("Apple", new BigDecimal("1.99"));
        Product actual = shop.findProductByName("Apple");
        assertEquals(expected, actual);
    }

    @Test
    public void findProductsByPriceTest() {
        List<Product> expected = new ArrayList<>();
        expected.add(apple);
        expected.add(fork);

        Shop newShop = new Shop(listProducts);
        List<Product> actuale = newShop.findProductsByPrice(new BigDecimal(1.00), new BigDecimal(5.00));


//        shop.addProduct(apple);
//        shop.addProduct(table);
//        shop.addProduct(butter);
//        shop.addProduct(fork);
//        shop.addProduct(book);
//        int expected = 3;
//        int actuale = shop.findProductsByPrice(new BigDecimal(1.00), new BigDecimal(5.00)).size();
//        assertEquals(3, shop.findProductsByPrice(new BigDecimal(1.00), new BigDecimal(5.00)).size());

        assertEquals(expected, actuale);
    }

}