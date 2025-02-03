package menudeopcoes;

import java.util.Scanner;

public class Menudeopcoes {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op;
        //Variaveis para a Tabuada
        int numtab,conttab;
        //Variaveis para o Fatorial
        int contfat,fat,numfat;
        //Variaveis para o Fibonacci
        int numfibo,a,b,c,contfibo;
        do {
            System.out.println("\n\nMenu de opções");
            System.out.println("==============");
            System.out.println("[1] - Tabuada");
            System.out.println("[2] - Fatorial");
            System.out.println("[3] - Fibonacci");
            System.out.println("[4] - Primo");
            System.out.println("[5] - Bubble Sort");
            System.out.println("[0] - Finalizar");
            System.out.print("Opção: ");
            op = ler.nextInt();
            switch(op) {
                case 1:System.out.println("\nPrograma Tabuada\n");
                    System.out.print("Digite um número: ");
                    numtab = ler.nextInt();
                    for(conttab=1;conttab<=10;conttab++) {
                        System.out.println(numtab+"x"+conttab+"="+(numtab*conttab));
                    }
                    break;
                    
                case 2:System.out.println("\nPrograma Fatorial\n");
                    System.out.print("Digite um número: ");
                    numfat = ler.nextInt();
                    fat=1;
                    for(contfat=numfat;contfat>=1;contfat--) {
                        fat = fat * contfat;
                    }
                    System.out.println("O fatorial de "+numfat+" é "+fat);
                    break;
                    
                case 3:System.out.println("\nPrograma Fibonacci\n");
                    System.out.print("Digite um número: ");
                    numfibo = ler.nextInt();
                    a=0;
                    b=1;
                    for(contfibo=1;contfibo<=numfibo;contfibo++) {
                        c=a+b;
                        System.out.print(c+"  ");
                        b=a;
                        a=c;
                    }
                    break;
                    
                case 4:System.out.println("\nPrograma Primo\n");
                    break;
                    
                case 5:System.out.println("\nBubble Sort\n");
                    break;
                    
                default:System.out.println("\nDigite uma opção correta\n");
            }
        }while(op!=0);
    }
    
}
