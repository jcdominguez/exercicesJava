public class ProgrammePrincipal {
    public static void main(String[] args) {
        Tigre tigrou = new Tigre();
        tigrou.setNom("Tigrou");
        tigrou.setCouleur("marron");

        tigrou.setAge(-5);
        System.out.println(tigrou.getAge());

        tigrou.setAge(5);
        System.out.println(tigrou.getAge());
    }
}