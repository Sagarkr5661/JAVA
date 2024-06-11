public class Conditionals {
    public static void main(String[] args) {
        int age=16;
        if(age>=18 && age<80){
            System.out.println("You are eligible for vote");
        }
        else if(age<18){
            System.out.println("You are not eligible for vote");
        }
        else{
            System.out.println("You are a kid");
        }
    }
}
