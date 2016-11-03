package br.com.hightechcursos.websensor;

import br.com.hightechcursos.websensor.model.SensorData;
import br.com.hightechcursos.websensor.repositoty.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiWebSensorIotApplication implements CommandLineRunner {

	@Autowired
	private SensorRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ApiWebSensorIotApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		//Saving Sensor Data
		repository.save(new SensorData("123","TEMPERTURE" ,"24.0"));
		repository.save(new SensorData("456","TEMPERTURE" ,"28.5"));
		repository.save(new SensorData("789","LIGHT" ,"10.5"));
		repository.save(new SensorData("891","WEIGHT" ,"200.0"));

		//fetch all SensorData

		System.out.println("Sensor Data found with findAll():");
		System.out.println("-------------------------------");

		for (SensorData sensor : repository.findAll()) {
			System.out.println(sensor);
		}
		System.out.println();

		// fetch an individual Sensor Data
		System.out.println("Sensor found with findByNumberIdentify('123'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNumberIdentify("123"));



	}
}
