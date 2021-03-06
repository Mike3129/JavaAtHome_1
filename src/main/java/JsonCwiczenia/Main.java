package JsonCwiczenia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        //zmień JSON na klasę - zadanie 1
        String json = " {\n" +
                "        \"latitude\": 54.533487,\n" +
                "        \"longitude\": 18.516178,\n" +
                "        \"height\": 10\n" +
                "    }";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Map<String, Object> koordynaty = objectMapper.readValue(json, Map.class);
            System.out.println("koordynaty to: " + koordynaty);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zadanie 2
        String json2 = "{\n" +
                "   \"product\":{\n" +
                "      \"name\":\"ser\",\n" +
                "      \"price\":3.30\n" +
                "   },\n" +
                "   \"quantity\":23.0,\n" +
                "   \"sum\":75.9\n" +
                "}";

        ObjectMapper zad2 = new ObjectMapper();
        try {
            jsonZad2 lista = zad2.readValue(json2, jsonZad2.class);
            System.out.println(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zadanie 3
        String json3 = "{\n" +
                "   \"profileName\": \"ekskalibur\",\n" +
                "   \"profileImage\": { \n" +
                "        \"src\": \"Images/Sun.png\",\n" +
                "        \"name\": \"sun1\",\n" +
                "        \"sizeX\": 250,\n" +
                "        \"sizeY\": 250,\n" +
                "        \"alignment\": \"center\"\n" +
                "    }\n" +
                "}";
        ObjectMapper zad3 = new ObjectMapper();
        try {
            jsonZad3 miecz = zad3.readValue(json3,jsonZad3.class);
            System.out.println(miecz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //zadanie 4

        String json4 = "{\n" +
                "   \"rodzaj\":\"wielokat\",\n" +
                "   \"punkty\":[\n" +
                "      {\n" +
                "         \"posx\":23.0,\n" +
                "         \"posy\":3.0\n" +
                "      },\n" +
                "      {\n" +
                "         \"posx\":55.0,\n" +
                "         \"posy\":2.1\n" +
                "      },\n" +
                "      {\n" +
                "         \"posx\":-35.0,\n" +
                "         \"posy\":1.5452\n" +
                "      },\n" +
                "      {\n" +
                "         \"posx\":2.5654,\n" +
                "         \"posy\":1.1\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        ObjectMapper zad4 = new ObjectMapper();
        try {
            jsonZad4 figura = zad4.readValue(json4,jsonZad4.class);
            System.out.println(figura);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
