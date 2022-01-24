package ganesh.assignment.singleton;

public class Singleton {
    String name;
    public static Singleton setName(String name){
        Singleton d=new Singleton();
        d.name=name;
        return d;
    }
   public  void print(){
        System.out.println(name);
    }
}
