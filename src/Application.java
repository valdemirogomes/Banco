public class Application {
    public static void main(String[] args) {
        Account c1 = new Account();
        Person p1 = new Person();
        p1.setName("Zé");
        p1.setDocument("98076556789");
        c1.setPerson(p1);
        c1.depositary(9_800);
        c1.remove(2_000,10);
        System.out.println(c1.getPerson().getName());
        System.out.println(c1.getBalance());

    }
}
