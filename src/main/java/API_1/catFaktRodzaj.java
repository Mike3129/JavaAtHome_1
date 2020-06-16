package API_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class catFaktRodzaj {
    public static void fact() {
        Scanner scanner = new Scanner(System.in);
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://catfact.ninja/fact"))
                .build();
        String odp;

        do {

            try {
                HttpResponse<String> resp = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                String opowiedz = resp.body();
                System.out.println(opowiedz);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Czy chcesz poznać koljeny fakt? (tak/nie)");
            odp = scanner.nextLine();
        }
        while (odp.equals("tak"));
    }

    public static void rodzaj(){
        Scanner scanner = new Scanner(System.in);
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://catfact.ninja/breeds?limit=1"))
                .build();
        String odp;

        do {

            try {
                HttpResponse<String> resp = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                String opowiedz = resp.body();
                System.out.println(opowiedz);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Czy chcesz poznać koljeny rodzaj kota? (tak/nie)");
            odp = scanner.nextLine();
        }
        while (odp.equals("tak"));
    }


    }




