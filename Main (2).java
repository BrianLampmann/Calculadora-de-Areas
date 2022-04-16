import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner Ler = new Scanner(System.in);

    System.out.println("");
    System.out.println("----------------------------------------");
    System.out.println("Cálculadora de Áreas");
    System.out.println("----------------------------------------");
    System.out.println("");

    System.out.println("Digite 1 para calcular a área do quadrado");
    System.out.println("Digite 2 para calcular a área do círculo");
    System.out.println("Digite 3 para calcular a área do retângulo");
    System.out.println("Digite 4 para calcular a área do triângulo");
    System.out.println("Digite 5 para calcular a área do losângo");
    System.out.println("Digite 6 para calcular a área do trapézio");
    System.out.println("Digite 7 para calcular a área do hexagono");
    

    int operacao = Ler.nextInt();

    if (operacao == 1){//Cálculo área do Quadrado
      System.out.print("Digite um lado do quadrado: ");
      double lado = Ler.nextDouble();
      double resultado = lado * lado;
      System.out.println("");
      System.out.print("A área do quadrado é: " + resultado);
    }

     else{
      if(operacao == 2 ){//Cálculo área do Círculo
      System.out.print("Digite o raio do círculo: "); 
      double raio = Ler.nextDouble();  
      double resultado2 = 3.14 * (raio * raio);
      System.out.println("");
      System.out.print("A área do círculo é: " + resultado2);
      }
        
      else{
        if(operacao == 3){//Cálculo área do Retângulo
          System.out.print("Digite a base do retângulo: ");
          double base = Ler.nextDouble();
          System.out.print("Digite a altura do retângulo: ");
          double altura = Ler.nextDouble();
          double resultado3 = base * altura;
          System.out.println("");
          System.out.print("A área do retângulo é: " + resultado3);   
        } 

        else{
          if(operacao == 4){//Cálculo área do Triângulo
          System.out.print("Digite a base do triângulo: ");
          double base2 = Ler.nextDouble();
          System.out.print("Digite a altura do triângulo: ");
          double altura2 = Ler.nextDouble();
          double resultado4 = (base2 * altura2)/2;
          System.out.println("");
          System.out.print("A área do retângulo é: " + resultado4);
          }

          else{
            if(operacao == 5){//Cálculo área do Losângo
            System.out.print("Digite o 1º comprimento da diagonal: ");
            double compriDiagonal1 = Ler.nextDouble();
            System.out.print("Digite o 2º comprimento da diagonal: "); 
            double compriDiagonal2 = Ler.nextDouble();
            double resultado5 = (compriDiagonal1 * compriDiagonal2)/2;
            System.out.println("");
            System.out.print("A área do losângo é: " + resultado5); 
            }
            else{
              if(operacao == 6){//Cálculo área do Trapézio
              System.out.print("Digite a base maior do trapézio: ");  
              double baseMaior = Ler.nextDouble();
              System.out.print("Digite a base menor do trapézio: ");
              double baseMenor = Ler.nextDouble(); 
              System.out.print("Digite a altura do trapézio: ");
              double altura3 = Ler.nextDouble();
              double resultado6 = ((baseMaior + baseMenor)*altura3)/2;
              System.out.println("");
              System.out.println("A área do trapézio é: " + resultado6);
              }
              else{
                if(operacao == 7){//Cálculo área do Hexagono 
                System.out.print("Digite a área de um dos triângulos do hexagono: ");
                double area = Ler.nextDouble();
                double resultado7 = area*6;
                System.out.println("");
                System.out.println("A área do hexagono é: " + resultado7);  
                }
              }
            }
          }
        }
       }
     }
   }
 }
//Feito por Brian Lampmann