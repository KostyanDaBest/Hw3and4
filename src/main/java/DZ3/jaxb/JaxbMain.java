package DZ3.jaxb;

import DZ3.model.Order;
import DZ3.model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class JaxbMain {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(OrderList.class);

//
            Marshaller marshaller = jc.createMarshaller();
            Order order = new Order();
            order.setName("Example Order");
            order.setDate("2024-02-04");

            Product product1 = new Product();
            product1.setType("Product 1");
            product1.setPrice("50.00");

            Product product2 = new Product();
            product2.setType("Product 2");
            product2.setPrice("30.00");

            order.setProducts(List.of(product1, product2));

            marshaller.marshal(order, new File("C:\\Users\\kosty\\Downloads\\Telegram Desktop\\order.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
