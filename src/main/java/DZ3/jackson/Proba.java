package DZ3.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.List;

public class Proba {

        public static void main(String[] args) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                Obertka orderWrapper = objectMapper.readValue(new File("C:\\Users\\kosty\\Desktop\\gesoncjik.json"),
                        Obertka.class);
                Order order = orderWrapper.getOrder();
                System.out.println("Date: " + order.getDate());
                System.out.println("Name: " + order.getName());
                List<Product> products = order.getProduct();
                for (Product product : products) {
                    System.out.println("Product: " + product.getType() + ", Price: " + product.getPrice());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

