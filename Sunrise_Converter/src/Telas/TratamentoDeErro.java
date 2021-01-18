package Telas;

public class TratamentoDeErro {
    public int BinError(String texto) {
        for(int carac=0; carac<texto.length(); carac++) {
            if (texto.charAt(carac)!=' ' && texto.charAt(carac)!='1' && texto.charAt(carac)!='0') {
                return 1;
            } 
        }
        return 0;
    }     
    
    public boolean CaracError(String carac) {
        for(int i=0; i<carac.length(); i++) {
            if (carac.charAt(i)>='A' && carac.charAt(i)<='Z' || carac.charAt(i)>='a' && carac.charAt(i)<='z') {
                return true;
            } 
        }
        return false;
    }
}
