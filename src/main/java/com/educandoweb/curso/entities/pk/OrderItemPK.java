package com.educandoweb.curso.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.Product;

@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L; 

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order Order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public Order getOrder() {
		return Order;
	}
	public void setOrder(Order order) {
		Order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(Order, other.Order) && Objects.equals(product, other.product);
	}
	
	
	
}
