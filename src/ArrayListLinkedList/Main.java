package ArrayListLinkedList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("Apple", 329890, 1800);
        Product product2 = new Product("Dell", 260681, 1200);
        Product product3 = new Product("Asus", 120931, 1000);
        Product product4 = new Product("HP", 592125, 1100);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product2);
        productManager.sortP();
        productManager.print();
        System.out.println(productManager.search("Dell"));
        System.out.println("------------------------");
        Product product5 = new Product("Nokia", 890245, 1000);
        productManager.repair(429531, product5);
        productManager.print();
        productManager.del(280356);
        productManager.print();
    }
}