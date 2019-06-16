package com.jwt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {

	private static final long serialVersionUID = -3465813074586302848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String title;
	
	private double cost;
	
	private int quantity;
	
	private Date purchasedAt;
		
	private int purchasedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPurchasedAt() {
		return purchasedAt;
	}

	public void setPurchasedAt(Date purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
 
	public int getPurchasedBy() {
		return purchasedBy;
	}

	public void setPurchasedBy(int purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orders [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", purchasedAt=");
		builder.append(purchasedAt);
		builder.append(", purchasedBy=");
		builder.append(purchasedBy);
		builder.append("]");
		return builder.toString();
	}
}