import java.util.ArrayList;

public class ProgrammePrincipal {
    public static void main(String[] args) {

        ArrayList<Tigre> tigres = new ArrayList<>();

        Tigre tigrou = new Tigre();
        tigrou.setNom("Tigrou");
        tigrou.setCouleur("marron");

        tigrou.setAge(-5);
        System.out.println(tigrou.getAge());

        tigrou.setAge(5);
        System.out.println(tigrou.getAge());


        tigres.add(tigrou);

        Tigre caramel = new Tigre();
        caramel.setCouleur("marron");
        caramel.setNom("Caramel");
        caramel.setAge(6);
        tigres.add(caramel);

        for(Tigre tigre : tigres){
            System.out.println(tigre.getNom());
        }


        Elephant babar = new Elephant();
        babar.setNom("Babar");


        babar.parler();
        tigrou.parler();

        ArrayList<Animal> animauxDuZoo = new ArrayList<>();
        animauxDuZoo.add(babar);
        animauxDuZoo.add(tigrou);
        animauxDuZoo.add(caramel);

        System.out.println("----- Faire parler les animaux du Zoo");
        for(Animal animal : animauxDuZoo){
            animal.parler();
        }
    }
}