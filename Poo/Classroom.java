public class Classroom {
    public static void main(String[] args) {
        // Création de plusieurs instances de la classe Wilder
        Wilder wilder1 = new Wilder("Jean-Claude", true);
        Wilder wilder2 = new Wilder("Henri", false);


        // Affichage du retour de la méthode whoAmI pour chaque instance
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());

    }
}
