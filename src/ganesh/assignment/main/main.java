package ganesh.assignment.main;


import ganesh.assignment.data.Default;
import ganesh.assignment.singleton.Singleton;

public class main {
    public static void main(String[] args) {
        Default d=new Default();
        d.printInstanceVaribles();
        d.printLocalVariables();
        Singleton s=Singleton.setName("ganesh");
        s.print();

    }
}
