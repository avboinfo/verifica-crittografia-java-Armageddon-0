public class XOR {
    static public String xorAlgo(String data,String key) {

        StringBuilder result= new StringBuilder();

        for (int i = 0; i < data.length(); i++) {
            char inputChar = data.charAt(i);
            char keyChar = key.charAt(i % key.length());
            //XOR operazione
            char encryptedChar=(char) (inputChar^keyChar);

            result.append(encryptedChar);
            }
            return result.toString();
        }

    }
    
