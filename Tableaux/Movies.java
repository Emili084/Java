class Movies {
    public static void main(String[] args) {
        String[] movies = {"Indiana Jones et les Aventuriers de l'arche perdue", "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade", "Indiana Jones et le Royaume du crâne de cristal"};
        String[][] actors = {{"Harrison Ford", "Karen Allen", "Paul Freeman"}, {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}, {"Harrison Ford", "Sean Connery", "Denholm Elliott"}, {"Harrison Ford", "Cate Blanchett", "Shia LaBeouf"}};

        for (int i=0; i<movies.length; i++) {
            String title = movies[i];
            String[] movieActor = actors[i];
            System.out.println("Dans le film " + title + ", les principaux acteurs sont :");
            for (String actor : movieActor) {
                System.out.println("- " + actor);
            }
        }
    }
}