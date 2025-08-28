import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(Payload.coursePrice());

		// print number of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);

		// print purchase amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);

		// print the title of the first course
		String titleFirstCourse = js.getString("courses[0].title");
		System.out.println(titleFirstCourse);

		System.out.println("***********");

		// print all course titles and their respective prices
		for (int i = 0; i < count; i++) {
			String courseTitles = js.getString("courses[" + i + "].title");
			System.out.println(js.get("courses[" + i + "].price").toString());
			System.out.println(courseTitles);
		}

		// print number of sold RPA course copies
		System.out.println("RPA course copies sold:");
		for (int i = 0; i < count; i++) {
			String courseTitles = js.getString("courses[" + i + "].title");
			if (courseTitles.equalsIgnoreCase("RPA")) {
				int copies = js.get("courses[" + i + "].copies");
				System.out.println(copies);
				break;
			}
		}

	}

}
