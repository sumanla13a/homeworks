public class Main {
	public static void main(String[] args) {
		OrderLine newOrderLine = new OrderLine();// TODO: add params
		ArrayList<OrderLine> newOrderLines = new ArrayList<OrderLine>; 
		newOrderLines.add(newOrderLine);
		Order newOrder = new Order(420, newOrderLines);
	}
}