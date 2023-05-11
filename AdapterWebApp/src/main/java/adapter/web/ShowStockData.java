package adapter.web;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import adapter.app.*;

/**
 * Servlet implementation class ShowStockData
 */
public class ShowStockData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStockData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//response.getWriter().append("Served at: ").append(request.getContextPath());
				XmlStockDataAdapter xmlAdaptorAdapter = new XmlStockDataAdapter();
				JsonStockDataAdapter jsonStockDataAdapter = new JsonStockDataAdapter();
				ArrayList<StockData> itemList = xmlAdaptorAdapter.getStockData();
				ArrayList<StockData> itemList1 = jsonStockDataAdapter.getStockData();
				itemList.addAll(itemList1);
			
				request.setAttribute("itemList", itemList);
				request.getRequestDispatcher ("/NewFile.jsp"). forward (request, response);
			}
			

			

		}