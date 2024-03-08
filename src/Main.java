import java.util.*;
import java.io.*;
class Main{
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli il tipo di cifratura:");
        System.out.println("1. Cripta");
        System.out.println("2. decripta");
        System.out.println("3. Stampa il file");
        System.out.print("Scelta: ");
        int risposta=scanner.nextInt();
       

        switch (risposta) {
            case 1:
                try {
                    File f=new File("static/data.txt");
                    String data1="";
                    Scanner leggi=new Scanner(f);
                    while(leggi.hasNextLine()){
                        String data=leggi.nextLine();
                        System.out.println(data);
                         data1 = data;
                       
                    }
                    String data2=Cesare.Cesar(data1,3);
                    String data3=XOR.xorAlgo(data2,"io");
                    leggi.close();

//tentata scrittura del file
                    FileWriter scrittura=new FileWriter("static/data.txt");
                    scrittura.write(data3);
                    scrittura.close();
                    
                } catch (Exception e) {
                    System.out.println("ERRORE");
                    e.printStackTrace();
                }
                break;
            
            case 2:
                




                break;
            case 3:
            try {
                File f=new File("static/data.txt");
                Scanner leggi=new Scanner(f);
                while(leggi.hasNextLine()){
                    String data=leggi.nextLine();
                    System.out.println(data);

                }
                leggi.close();

            } catch (Exception e) {
                System.out.println("ERRORE");
                e.printStackTrace();
            }
                break;
            default:
                System.out.println("la scelta non corisponde con nessuna opzione");
                break;
        }
    }
}