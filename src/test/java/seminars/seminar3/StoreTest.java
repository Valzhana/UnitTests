package seminars.seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StoreTest {
    @BeforeEach
    void setUp() {
        product1 = new Product("Apple", 160, 3);
        product2 = new Product("Banana", 120, 5);
        store = new Store();
    }

    @AfterEach
    void tearDown() {
        product1 = null;
        product2 = null;
        store = null;
    }

    private Store store;
    private Product product1;
    private Product product2;

    @Test
    @DisplayName("Проверка сохранения продуктов в Store.inventory")
    void addProductToInventory() {
        store.addProductToInventory(product1);
        store.addProductToInventory(product2);
        assertEquals(2, store.getInventory().size());
    }

    @Test
    void getInventory() {
    }

    @Test
    void removeProductFromInventory() {
        store.addProductToInventory(product1);
        store.removeProductFromInventory(product1);
        assertEquals(0, store.getInventory().size());
    }

    @Test
    void findProductByName() {
        store.addProductToInventory(product1);
        Product findProduct = store.findProductByName("Apple");
        assertEquals("Apple", findProduct.getName());
    }

    @Test
    void createCart() {
        Cart cart = store.createCart();
        assertNotNull(cart);
    }
}