package TratamentoDeExcecao;

public class exemploErroComTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int numeros = 20;
	    int divisor = 0;
		   
	       try{
		   
	        System.out.println((numeros/divisor));
		           
	        }
	        catch(ArithmeticException e){
		       
		    System.out.println("Erro ao dividir por zero");   
		    }

	}

}
