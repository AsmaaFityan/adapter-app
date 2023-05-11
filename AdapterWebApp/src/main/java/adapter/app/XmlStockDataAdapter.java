package adapter.app;

import java.util.ArrayList;

public class XmlStockDataAdapter implements StockDataSource {

	@Override
	public ArrayList<StockData> getStockData() {
		XmlStockDataSource xmlSource = new XmlStockDataSource();
		ArrayList<StockData> stockData = xmlSource.getStockData();
		return stockData;
	}

}