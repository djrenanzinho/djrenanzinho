import java.util.Scanner;

 public class renan {
     
     public static void main (String[] args) throws InterruptedException {
         
         Scanner sc = new Scanner(System.in);
         int resp = 1;
          while (resp != 2) {
            System.out.println("Digite o 1° número: ");
                double num1 = sc.nextDouble();
            System.out.println("Digite o 2° número: ");
                double num2 = sc.nextDouble();
            System.out.println("Selecio a operação que deseja realizar: \nDigite 1 para Somar. \nDigite 2 para Subtrair. \nDigite 3 para Dividir. \nDigite 4 para Multiplicar");
                double esco = sc.nextDouble ();
        
                    if (esco == 1) {
                     System.out.println("A soma dos números é: " + (num1 + num2));
                    
                     } else if (esco == 2) {
                         System.out.println("A subtração entre os números é: " + (num1 - num2));
                         
                        } else if (esco == 3) {
                     
                           System.out.println("A divisão entre esses números é: " + (num1/num2));
                     
                                } else if (esco == 4) {
                                   System.out.println("O valor da multiplicação entre esses números é: " + (num1*num2));
                     
                                    } else if (esco >= 4) {
                                       System.out.println("Digite um número menor que 4 para escolher uma operação.");
                                    }           
                 
         System.out.println("Deseja continuar? \n1-SIM \n2-NÃO ");
          resp = sc.nextInt();
         
                if (resp == 2) {
                    System.out.println("Fim!");
                break;
                                } else {
                                    System.out.println("Recomeçando...");
                                        Thread.sleep(1000);
                                    }
              
          }
     }
 }
