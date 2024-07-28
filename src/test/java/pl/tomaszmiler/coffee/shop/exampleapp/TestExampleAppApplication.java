package pl.tomaszmiler.coffee.shop.exampleapp;

import org.springframework.boot.SpringApplication;

public class TestExampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(ExampleAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
