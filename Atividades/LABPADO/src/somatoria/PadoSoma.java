package src.somatoria;

public class PadoSoma{

	//criando uma função estatica, x numero que a pessoa vai dar.
	public static int functionSomatoria(int x){

		int soma = 0;

		//somano x*3 x vezes que somei
		for(int i = 0; i <= x; i++){
			soma += x*3;
		}
		return soma;
	}

}
