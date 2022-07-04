package src;

import src.utils.PadoMath;
import src.somatoria.PadoSoma;

public class HelloWorld{

	public static void main(String[] args){

		//PadoMath pado = new PadoMath(3);

		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}

		System.out.println("HELLO PADOLABS: " + PadoMath.myFirstFunction(3));
		System.out.println("A somatoria é: " + PadoSoma.functionSomatoria(39));
	}
}
