public class Application {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Pessoa p1 = new Pessoa();
        p1.name = "Zé";
        p1.document = "98076556789";
        c1.person = p1;
        System.out.println(c1.person.name);
    }
}
