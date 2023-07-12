import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Balyk balyk = new Balyk();
        balyk.setName("Семга");
        balyk.setHome("Океан Тихый");
        balyk.setLet(9);
        System.out.println(balyk.getName());
        System.out.println(balyk.getName());
        System.out.println(balyk.getLet());


        Balyk balyk1 = new Balyk();
        balyk1.setName("Форель");
        balyk1.setHome("Ыссык-Кол");
        balyk1.setLet(2);
        System.out.println("Name : " + balyk1.getName());
        System.out.println("Home: " + balyk1.getHome());
        System.out.println("Let : " + balyk1.getLet());


        Parrot parrot = new Parrot();
        parrot.setName("Алекс");
        parrot.setAge(5);
        parrot.setHome("Амазон");
        System.out.println("Name : " + parrot.getName());
        System.out.println("Age : " + parrot.getAge());
        System.out.println("Home  : " + parrot.getHome());


       Cat cat=new Cat();
       cat.setName("Гари");
       cat.setHome("Болотах");
       cat.setAge(3);
        System.out.println("Name: " +cat.getName());
        System.out.println("Home: "+ cat.getHome());
        System.out.println("age: "+ cat.getAge());


        Dog dog = new Dog();
        dog.setName("Барборс");
        dog.setAge(8);
        dog.setWeight(20);
        System.out.println("Name: "+ dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("weight: "+ dog.getWeight());





    }



}