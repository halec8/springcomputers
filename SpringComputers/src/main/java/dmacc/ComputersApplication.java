package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computers;
import dmacc.beans.ShippingAddress;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputersRepository;

@SpringBootApplication
public class ComputersApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ComputersApplication.class, args);
	}
	
	@Autowired
	ComputersRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computers c = appContext.getBean("computers", Computers.class);
		
		c.setBrand("Apple");
		
		repo.save(c);
		
		
		Computers c2 = new Computers("Desktop", "HP", "Omen", 2020, 27);
		ShippingAddress shipAddress = new ShippingAddress("123 Westown Pkwy", "West Des Moines", "IA");
		
		c2.setShippingAddress(shipAddress);
		repo.save(c2);
		
		List<Computers> allComputers = repo.findAll();
		for (Computers computers : allComputers) {
			System.out.println(computers.toString());
			
		}
				((AbstractApplicationContext) appContext).close();
	}
}
