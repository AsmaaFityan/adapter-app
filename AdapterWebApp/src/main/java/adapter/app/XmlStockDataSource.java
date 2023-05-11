package adapter.app;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import org.w3c.dom.*;


public class XmlStockDataSource implements StockDataSource {

	@Override
	public ArrayList<StockData> getStockData() {
		// TODO Auto-generated method stub
	    ArrayList<StockData> itemList = new ArrayList<>();
		try {
			File inputFile = new File("StockData.xml ");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder ();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			String symbol = "";
			double price_2007 = 0.0;
			NodeList nList = doc.getElementsByTagName("row");
			 
			for (int i = 0; i<nList.getLength(); i++) {
				Element item= (Element) nList.item(i);
				
				symbol= item.getElementsByTagName("symbol").item(0).getTextContent();
				price_2007= Double.parseDouble(item.getElementsByTagName("price_2007").item(0).getTextContent());
				StockData stockData = new StockData (symbol, price_2007);
				itemList.add(stockData);
			}
				
		} catch (Exception e){
			e.printStackTrace();
		   }
		return itemList;

	}
	

}
