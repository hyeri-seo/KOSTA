package com.kosta.order;

public class Order {
	
	//주문 번호용 sequence
	private static int ORDER_SEQ=1;
	
	//주문 번호
	private int no;
	//주문 고객명
	private String customer;
	//주문 상품
	private String productCode;
	//주문 수량
	private int amount;
	//주문 취소 여부
	private boolean isCanceled;	
	
	//생성자 정의	
	public Order(String customer, String productCode, int amount) {
		this.no = ORDER_SEQ++;
		this.customer = customer;
		this.productCode = productCode;
		this.amount = amount;
		this.isCanceled = true;
	}
	
	public Order(int no, String customer, String productCode, int amount, boolean isCanceled) {
		this.no = no;
		this.customer = customer;
		this.productCode = productCode;
		this.amount = amount;
		this.isCanceled = isCanceled;
	}
	
	//Setter, Getter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isCanceled() {
		return isCanceled;
	}
	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	@Override
	public String toString() {
		return String.format(isCanceled()?"정상":"취소");
	}	
}
