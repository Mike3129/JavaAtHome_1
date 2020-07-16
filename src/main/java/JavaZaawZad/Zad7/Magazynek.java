package JavaZaawZad.Zad7;


import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Magazynek {
    private List<String> magazynek;
    private static final int CAPACITY = 10;

    public List<String> getMagazynek() {
        return magazynek;
    }

    public void setMagazynek(List<String> magazynek) {
        this.magazynek = magazynek;
    }

    public Magazynek(List<String> magazynek) {
        ensureCapacity(magazynek);
        this.magazynek = magazynek;
    }

    private  void ensureCapacity (List<String> list){
        if (list.size() > CAPACITY){
            throw new IllegalArgumentException("Max Capacity cannot by exceeded");

        }
    }

    public void loadBullet(String bullet){
        magazynek.add(bullet);
    }

    boolean isLoaded(){
        if (magazynek.isEmpty()){
            System.out.println("Magazynek jest pusty");
        }
        return !magazynek.isEmpty();
    }

    void shot(){
        if (isLoaded()){
            magazynek.remove(magazynek.size()-1);
        }
    }
}
