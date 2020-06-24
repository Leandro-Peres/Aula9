package TratamentoDeExcecao;

public class exemploTryCatch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

 

        for (int i=0; i<numeros.length; i++){
            try{
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
            }
            catch(ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
                
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválida");
                                e.getMessage();
                
            }
            finally {
                System.out.println("Essa linha impressa sempre após o try ou catch");
                System.out.println();
            }
        }
        
	}
}
