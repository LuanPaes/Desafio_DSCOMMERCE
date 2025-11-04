package com.desafio.dscommerce.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.dscommerce.desafio.entities.OrderItem;
import com.desafio.dscommerce.desafio.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
