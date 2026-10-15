public class main {

    String name="Muthu";
    main(){
        System.out.println("This is main class constructor");
    }
    public static void main(String[] args) {
       
       demo obj=new demo();
         obj.display();
    }
}
     class demo extends main{

        String name="mani";

        demo(){
            super();
            System.out.println("This is demo class constructor");
        }

        void display(){
        System.out.println(this.name);
        System.out.println(super.name);
        }
    }