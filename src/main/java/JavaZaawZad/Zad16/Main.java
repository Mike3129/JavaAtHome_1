package JavaZaawZad.Zad16;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Runner.getFitnesslevel(20000));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Runner.getFitnesslevel(200));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Runner.getFitnesslevel(300));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }





    }
}
