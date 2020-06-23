package Kolekcje.zadanie6;



import java.util.*;

public class Dziennik {
    // lista studentów jako pole
    private List<Student> list = new ArrayList<>();

    //metoda dodaj studenta do dziennika
    public void dodajStudenta(Student student){
        list.add(student);
    }

    public void wyswietlStudentow(){
        System.out.println(list);
    }

    //metoda usuń studenta
    public void usunStudenta(Student student){
        list.remove(student);
    }

    //usuwanie studenta po numerze indexu
    public void usunStudentaPoIndexie(String indexDoUsuniecia){
        for (Student student:list){
            if (student.getIndex().equals(indexDoUsuniecia)) {
                list.remove(student);
                break;
            }
        }
    }

    //zwróć studenta po numerze indexu
    public void zwrotStudentaPoIndexie (String indexDoWyszukania){
        for (Student student:list){
            if (student.getIndex().equals(indexDoWyszukania)) {
                System.out.println(student);

            }
        }
    }

    //dodawanie ocen do konkretnego indexu
    public void dodajOcene (String index, Double ocena){
        Scanner scanner = new Scanner(System.in);
        for (Student student:list){
            if (student.getIndex().equals(index)) {
                student.getOceny().add(ocena);

            }
        }
    }

    public List<Student> sortowanie(){
        Collections.sort(list);
    }




}

