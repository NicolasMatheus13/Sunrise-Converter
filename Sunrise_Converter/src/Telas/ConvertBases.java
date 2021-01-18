package Telas;

class ConvertBases {
    
    TratamentoDeErro confere = new TratamentoDeErro();
    final static int[] potencias = {128, 64, 32, 16, 8, 4, 2, 1};

	public String isInvert(String palavra) {
		String resultado="";
                
                if (palavra.length()%2!=0) {
                    palavra+=" ";
                }
                
		for(int i=palavra.length()-1; i>=0; i-=palavra.length()/2) {
			resultado+=palavra.substring(i, i-palavra.length()/2);
		}                
		return resultado;
	}
        
        public int QtdCarac(String texto) {
		
            int qtd=0;

            for(int i=0; i<texto.length(); i++) {
                qtd++;			
            }
            return qtd;
	}
        
        public int QtdPalavras(String texto) {
            int j=1;
            String[] palavras = new String[1000];

            for(int i=0; i<texto.length(); i++) {
                if (' '==texto.charAt(i)) {
                    j++;
                } 
            }
		return j;
        }                        
            
        
	public String isIntBin(int valor) {
            
		String bits="";

		while(valor>=1) {
			bits+=valor%2;
			valor/=2;
		}
		return isInvert(bits);
	}

	public String isBinInt(String valor) {
		int i = 0, bit, inteiro = 0;
                String result="";
                
                if (confere.BinError(valor)==0) {
                    while(i<valor.length()) {
                            bit = valor.charAt(i) - 48;			
                            inteiro+=(bit*Math.pow(2, valor.length()-1-i));
                            i++;
                    }
                    return result+=inteiro;
                } else return "erro";                
	}

	public String isBinCarac(String texto) {
		int cont=0, j=0, soma=0, i=potencias.length;
		String result="";
		    
                if (confere.BinError(texto)==0) {
                    while (i<=texto.length()) {
                        while(cont<i) {
                            if (texto.charAt(cont)=='1') {
                                soma+=potencias[j];
                            }
                            j++;
                            cont++;
                        }
			result+= (char) soma;
			j=0;
			soma=0;
			cont=i+1;
			i+=potencias.length+1;
                    }
                    return result;
                } else return "erro";		
	}

	public String isCaracBin(String texto) {		
		int carac, i=0, j;
		String result="";
                
		do {
			j=0;
			carac = texto.charAt(i++);
			while(j<potencias.length) {
				if (carac>=potencias[j]) {
					result+=1;
					carac-=potencias[j];
				} else result+=0;
				j++;
			}
			result+=" ";
		} while(i<texto.length());
		return result;
       }
        
        public String isIntHexa(int valor) {
            
		String bits="";
                int num;
                char carac;

		while(valor>=1) {
                    num = valor%16;
                    
                    switch(num) {
                        case 10:
                            bits+='A';
                        break;
                        
                        case 11:
                            bits+='B';
                        break;
                        
                        case 12:
                            bits+='C';
                        break;
                        
                        case 13:
                            bits+='D';
                        break;
                        
                        case 14:
                            bits+='E';
                        break;
                        
                        case 15:
                            bits+='F';
                        break;
                        
                        default:
                            bits+= num;
                        break;
                    }                                        
                    valor/=16;                        
		}
		return isInvert(bits);
	}

	public String isHexaInt(String valor) {
		int i = 0, hexa, inteiro = 0;
                String result="";
                                
                while(i<valor.length()) {
                            hexa = (int) valor.charAt(i);			
                            inteiro+=(hexa*Math.pow(16, valor.length()-1-i));
                            i++;
                    }
                    return result+=inteiro;                
	}   

        public String isIntCarac(String Texto) {
            String carac="", texto2="";
            char carac2=0;
            int carac3;            
              
            Texto+=" ";
            for(int i=0; i<Texto.length(); i++) {
                if (Texto.charAt(i)!=' ') {             
                    carac+=Texto.charAt(i);                      
                } else  {
                    if (confere.CaracError(carac)==false) {
                        carac3 = Integer.valueOf(carac);
                        carac2 = (char) carac3;                
                        texto2+=carac2;                    
                        carac="";
                    } else return "erro";
                }
            }
		return texto2;
	}

	public String isCaracInt(String Texto) {
                String carac2="";            
                int valor=0;
                for(int i=0; i<Texto.length(); i++) {
                    valor = (int) Texto.charAt(i);                
                    carac2+=valor;
                    carac2+=" ";
                }
                carac2 = carac2.substring(0, carac2.length()-1);
                return carac2;
	}
}        