package java8.diff.storeBilling;
import java.text.DecimalFormat;

public class Item {
	private String itemName;
	private Double rate;
	private Double qtyOrdered;
	private Double amountPayable;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemName, Double rate) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.qtyOrdered =0.0;
		this.amountPayable = 0.0;
	}
	public Item(String itemName, Double rate, Double qtyOrdered) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.qtyOrdered = qtyOrdered;
		this.amountPayable = 0.0;
	}
	public Item(String itemName, Double rate, Double qtyOrdered, Double amountPayable) {
		super();
		this.itemName = itemName;
		this.rate = rate;
		this.qtyOrdered = qtyOrdered;
		this.amountPayable = amountPayable;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(Double qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public Double getAmountPayable() {
		return amountPayable;
	}
	public void setAmountPayable(Double amountPayable) {
		this.amountPayable = amountPayable;
	}
	@Override
	public String toString() {
	 DecimalFormat decimalFormat=new DecimalFormat("0.00");
	 String price=decimalFormat.format(rate);
	 String qty=decimalFormat.format(qtyOrdered);
	 String amt=decimalFormat.format(amountPayable);
		String output=String.format("%-20s %-20s %-20s %-20s",itemName,price,qty,amt);
		return output;
	}
}
