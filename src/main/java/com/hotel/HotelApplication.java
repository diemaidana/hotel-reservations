package com.hotel;

import com.hotel.config.DotEnvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelApplication {

    public static void main(String[] args) {
        // CARGAR VARIABLES DE ENTORNO
        DotEnvConfig.load();

        SpringApplication.run(HotelApplication.class, args);
    }

}
