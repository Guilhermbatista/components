package com.guilherme.devsuperiorAtividade.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public Double shippment(double amount) {

		if (amount < 100.00)return amount +20.00;
		if (amount >= 100.00 && amount < 200.00) {return amount +12.00;}
		else {return amount;}

	}
}
