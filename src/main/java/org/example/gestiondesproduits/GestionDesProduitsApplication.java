package org.example.gestiondesproduits;

import org.example.gestiondesproduits.entities.Product;
import org.example.gestiondesproduits.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class GestionDesProduitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesProduitsApplication.class, args);

    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .category("Electronique")
                    .price(7000)
                    .quantity(20)
                    .build());
            productRepository.save(Product.builder()
                    .name("Printer")
                    .category("Electronique")
                    .price(1000)
                    .quantity(45)
                    .build());
            productRepository.save(Product.builder()
                    .name("TV")
                    .category("Electromenager")
                    .price(5000)
                    .quantity(10)
                    .build());
            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .category("Electronique")
                    .price(13000)
                    .quantity(40)
                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });
        };
    }

}
