package com.shopbilling.model;

import java.math.BigDecimal;

public class BillItem {
	private int id;
	private int billId;
	private int productId;
	private int quantity;
	private BigDecimal unitPrice = BigDecimal.ZERO;
	private BigDecimal totalPrice = BigDecimal.ZERO;
	private Product product;

	public BillItem() {}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getBillId() { return billId; }
	public void setBillId(int billId) { this.billId = billId; }

	public int getProductId() { return productId; }
	public void setProductId(int productId) { this.productId = productId; }

	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }

	public BigDecimal getUnitPrice() { return unitPrice; }
	public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }

	public BigDecimal getTotalPrice() { return totalPrice; }
	public void setTotalPrice(BigDecimal totalPrice) { this.totalPrice = totalPrice; }

	public Product getProduct() { return product; }
	public void setProduct(Product product) { this.product = product; }
}
