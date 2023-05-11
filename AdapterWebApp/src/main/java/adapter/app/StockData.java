package adapter.app;

public class StockData {
	
    private String symbol;
    private double price;
    
    public StockData( String symbol, double price) {
    	this.setSymbol(symbol);
        this.setPrice( price);

    }
    
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
