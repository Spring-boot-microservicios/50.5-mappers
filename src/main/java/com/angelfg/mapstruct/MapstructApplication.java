package com.angelfg.mapstruct;

import com.angelfg.mapstruct.dao.CountryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapstructApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CountryDao.db.entrySet().forEach(key -> System.out.println("key: " + key));
	}

}
