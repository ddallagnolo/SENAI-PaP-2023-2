import java.util.Scanner;    
    public class condicao {

    }
    //Leia 3 valores e implima qual é o maio deles 

    public static void main(String{} args)   {
        Scanner ler = new Scanner(Systen.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Digite o numero");
        num1 = ler.next();
        System.out.println("Digite o segundo numero");
        num2 = ler.next();
        System.out.println("Digite o terceiro numero");
        num3 = ler.next();

        if (num1 > num2 && num1 > num 3) {
            System.out.println("O maior valor digitado foi");
            System.out,println(num1);

        }else if (num2 > num1 && num2 > num 3) {
            System.out.println("O maior numero digitado foi");
            System.out.println(num2);
        
        }else  {
            System.out.println("O maior numero digitado foi");
            System.out.println(num3);    
        }


    }