package files;

public class Payload {

	public static String addPlace() {
		return "{\r\n"
				+ "    \"location\": {\r\n"
				+ "        \"lat\": -23.5372836897518,\r\n"
				+ "        \"lng\": -47.54972387771147\r\n"
				+ "    },\r\n"
				+ "    \"accuracy\": 50,\r\n"
				+ "    \"name\": \"Tem Nada Aqui\",\r\n"
				+ "    \"phone_number\": \"(+55) 15 220 2513\",\r\n"
				+ "    \"address\": \"Rua dos Bobos, 0\",\r\n"
				+ "    \"types\": [\r\n"
				+ "        \"shoe park\",\r\n"
				+ "        \"shop\"\r\n"
				+ "    ],\r\n"
				+ "    \"website\": \"https://google.com\",\r\n"
				+ "    \"language\": \"French-IN\"\r\n"
				+ "}";
	}
	
	public static String coursePrice() {
		return "{\r\n"
				+ "  \"dashboard\": {\r\n"
				+ "    \"purchaseAmount\": 910,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\": [\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n"
				+ "      \"price\": 50,\r\n"
				+ "      \"copies\": 6\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Cypress\",\r\n"
				+ "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n"
				+ "      \"copies\": 10\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
	}
}
