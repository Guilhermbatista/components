package com.guilherme.devsuperiorAtividade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guilherme.devsuperiorAtividade.entities.Order;
import com.guilherme.devsuperiorAtividade.services.OrderService;

@SpringBootApplication
public class DevsuperiorAtividadeApplication implements CommandLineRunner {
	
	public static void main(String[]args) {
		SpringApplication.run(DevsuperiorAtividadeApplication.class, args);
	}
	
	private OrderService orderService;

	public DevsuperiorAtividadeApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Order order = new Order("1309", 95.90, 0.0);
		
		System.out.println("Código do pedido: "+ order.getCode());
		System.out.println("Valor total: "+orderService.total(order));
	}

}
