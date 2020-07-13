package com.alc.tacos.data;

import com.alc.tacos.Order;

public interface OrderRepository {
	
	Order save(Order order);

}
