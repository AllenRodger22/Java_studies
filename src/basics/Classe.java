package basics;

class Cat{
        String name;
        int age;
         void meow(){
            System.out.println(name + " is Saying Meow!");
        }

         void describe(){
            System.out.println("The cat "+ name + " is "+ age +" years old and he is very cute!");
        }
        }
public class Classe {
    public static void main(String[]args){
    Cat Haru = new Cat();
    Haru.name = "Haru";
    Haru.age = 7;
    Haru.meow();
    Haru.describe();

    }
}
