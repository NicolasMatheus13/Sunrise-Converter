package Telas;

public class ConvertUnidades {
       
    public int bitByte(int num) {              
        int Byte = 0;
    
        if (num>=8) {
                for(int i=1; i<=num; i+=8) {
                    Byte++;
                }
        } else return 0;
        
        if (num%8!=0)
            return Byte-=1;       
        else
            return Byte;
    }            
    public int bitKilo(int num) {
        int Byte = 0, Kilo = 0;
        for(int i=0; i<num; i+=8) {
            Byte++;
	}	
	for(int i=1024; i<=Byte; i+=1024) {
		Kilo++;
	}        
        return Kilo;
    }
    
    public int Bytebit(int num) {
        int bits = 0;
        
        for(int i=num; i>=1; i--) {
            bits+=8;
        }
        return bits;
    }
}
            