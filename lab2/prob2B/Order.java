package prob2B;

public class Order {
	private int orderNum;
	private ArrayList<OrderLine> orderLine;
	public Order(int newOrderNum, ArrayList<OrderLine> newOrderLine) {
		orderNum = newOrderNum;
		orderLine = newOrderLine;
	}
}