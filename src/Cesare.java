public class Cesare {

    static public String Cesar(String data, int chiave) {
        StringBuilder output = new StringBuilder(data.length()); //genera nuova stringa 
        for (char singleChar : data.toCharArray()) {             //creo un array di char prendendo 1 caratere alla volta
            int shiftedChar = (int) (singleChar + chiave) % 256;  
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

}

