package GUI;

public class Verificador {

    public static boolean esPalabra(String palabra){
        if(!palabra.equals("")){
            return true;
        }
        return false;
    }

    public static boolean esNumero(String palabra){
        if(!esPalabra(palabra)){
            return false;
        }
        char[] cadena = palabra.toCharArray();
        for(char caracter: cadena){
            if(!Character.isDigit(caracter)){
                return false;
            }
        }
        return true;
    }

    public static boolean esDecimal(String palabra){
        if(!esPalabra(palabra)){
            return false;
        }

        char[] cadena = palabra.toCharArray();
        for(char caracter: cadena){
            if(!(Character.isDigit(caracter) || caracter == '.')){
                return false;
            }
        }
        return true;

    }

}
