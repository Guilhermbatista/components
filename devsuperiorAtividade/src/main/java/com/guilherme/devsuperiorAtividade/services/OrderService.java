package com.guilherme.devsuperiorAtividade.services;

import org.springframework.stereotype.Service;

import com.guilherme.devsuperiorAtividade.entities.Order;

@Service
public class OrderService {
	private ShippingService service;

	public OrderService(ShippingService service) {
		this.service = service;
	}

	public Double total(Order order) {
		return service.shippment(order.getBasic() - (order.getDiscount() * order.getBasic()) / 100);
	}
}
