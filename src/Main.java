
public class Main {
    public static void main(String[] args) {
        Author danSimmons = new Author("Дэн", "Симмонс");
        Author vernorVinge = new Author("Вернор", "Виндж");
        Author williamGibson = new Author("Уильям", "Гибсон");

        Book hyperion = new Book("Гиперион", danSimmons, 1989);
        Book aFireUponTheDeep = new Book("Пламя над бездной", vernorVinge, 1992);
        Book neuromancer = new Book("Нейромант", williamGibson, 1984);

        System.out.println(hyperion.getTitle() + " " + hyperion.getAuthor().getFirstName() + " "
                + hyperion.getAuthor().getLastName() + " " + hyperion.getPublicationYer());
        System.out.println(aFireUponTheDeep.getTitle() + " " + aFireUponTheDeep.getAuthor().getFirstName()
                + " " + aFireUponTheDeep.getAuthor().getLastName() + " " + aFireUponTheDeep.getPublicationYer());
        System.out.println(neuromancer.getTitle() + " " + neuromancer.getAuthor().getFirstName() + " "
                + neuromancer.getAuthor().getLastName() + " " + neuromancer.getPublicationYer());

        aFireUponTheDeep.setPublicationYer(2021);
        System.out.println(aFireUponTheDeep.getTitle() + " " + aFireUponTheDeep.getAuthor().getFirstName() + " "
                + aFireUponTheDeep.getAuthor().getLastName() + " " + aFireUponTheDeep.getPublicationYer());
    }
}