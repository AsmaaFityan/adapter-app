<%@ page import="adapter.app.StockData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="adapter.web.ShowStockData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Asmaa_Ahmed_project</title>
</head>
<body>
<table border="1">
<thead>
 <tr>
<th>symbol</th>
<th>Price</th>
</tr>
</thead>
<tbody>
<%
@SuppressWarnings ("unchecked")
ArrayList<StockData> itemList = (ArrayList<StockData>) request.getAttribute("itemList");
for (StockData item :itemList) {
%>
<tr>
<td><%= item.getSymbol() %></td>
<td><%= item.getPrice () %></td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>