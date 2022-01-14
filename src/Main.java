
public class Main {

    public static void main(String[] args) {
        MyList m = new MyList();

        System.out.println("demarrage");
        m.addLast("tatu");
        System.out.println("test ajout 1er");
        System.out.println(m.toString());
        m.add("toto");
        m.add("titi");
        m.addLast("tutu");

        System.out.println(m.toString());
        System.out.println(m.size());
    }

}