package adapter.app;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStockDataSource implements StockDataSource {

	@Override
	public ArrayList<StockData> getStockData() {
		// TODO Auto-generated method stub
		ArrayList<StockData> itemList = new ArrayList<>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();   
			JsonNode rootNode = objectMapper.readTree(new File("StockData.json "));
			
			for (JsonNode companyNode: rootNode) {

				String symbol= companyNode.get("symbol").asText();
				double price = companyNode.get("price_2007").asDouble();

				StockData itemStockData = new StockData (symbol, price);
				itemList.add(itemStockData);
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
		return itemList;
				
			}
		}


	



