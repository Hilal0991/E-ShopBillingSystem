package com.shopbilling.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bill {
	private int id;
	private int customerId;
	private int createdByUserId;
	private BigDecimal totalAmount = BigDecimal.ZERO;
	private BigDecimal discountAmount = BigDecimal.ZERO;
	private BigDecimal taxAmount = BigDecimal.ZERO;
	private BigDecimal finalAmount = BigDecimal.ZERO;
	private String paymentMethod;
	private String status;
	private LocalDateTime billDate;
	private List<BillItem> billItems = new ArrayList<>();
	private Customer customer;

	public Bill() {}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getCustomerId() { return customerId; }
	public void setCustomerId(int customerId) { this.customerId = customerId; }

	public int getCreatedByUserId() { return createdByUserId; }
	public void setCreatedByUserId(int createdByUserId) { this.createdByUserId = createdByUserId; }

	public BigDecimal getTotalAmount() { return totalAmount; }
	public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

	public BigDecimal getDiscountAmount() { return discountAmount; }
	public void setDiscountAmount(BigDecimal discountAmount) { this.discountAmount = discountAmount; }

	public BigDecimal getTaxAmount() { return taxAmount; }
	public void setTaxAmount(BigDecimal taxAmount) { this.taxAmount = taxAmount; }

	public BigDecimal getFinalAmount() { return finalAmount; }
	public void setFinalAmount(BigDecimal finalAmount) { this.finalAmount = finalAmount; }

	public String getPaymentMethod() { return paymentMethod; }
	public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }

	public LocalDateTime getBillDate() { return billDate; }
	public void setBillDate(LocalDateTime billDate) { this.billDate = billDate; }

	public List<BillItem> getBillItems() { return billItems; }
	public void setBillItems(List<BillItem> billItems) { this.billItems = billItems; }

	public Customer getCustomer() { return customer; }
	public void setCustomer(Customer customer) { this.customer = customer; }
}
