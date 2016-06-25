import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExample {

    public static void main(String[] args) {

        JSONObject studentOne = new JSONObject();

//        obj.put("id", new Integer(1));
        obj.put("name", "Albert Ilizaliturri");
        obj.put("birthdate", "05/17/1991");
        obj.put("phone", "323-123-4567");

        System.out.println("Student One");
        System.out.print(studentOne);

        String studentOneName = studentOne.get("name");

        System.out.println("Student One Name");
        System.out.print(studentOneName);

        JSONArray students = new JSONArray();

        students.add(studentOne);

        System.out.print(students);

    }

}
