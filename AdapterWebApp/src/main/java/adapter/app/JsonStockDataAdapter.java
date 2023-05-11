package adapter.app;

import java.util.ArrayList;

public class JsonStockDataAdapter implements StockDataSource{

	@Override
	public ArrayList<StockData> getStockData() {
		JsonStockDataSource jsonSource = new JsonStockDataSource();
		ArrayList<StockData> stockData = jsonSource.getStockData();
		return stockData;
	}

}