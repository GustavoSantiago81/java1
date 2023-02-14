package aula_04;

public class Exer3 {

	public static void main(String[] args) {
		
		int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int dp = 0, ds = 0;
		
		for (int indice = 0; indice < matriz.length; indice ++) {
			System.out.println("Diagonal principal: " + matriz[indice][indice]);
			dp += matriz[indice][indice];
			
		}
		
		
		
		for (int indice = 0; indice < matriz.length; indice ++) {
		//	System.out.println("Diagonal principal: " + matriz[indice][matriz.length - 1 - indice]);
			ds += matriz[indice][matriz.length - 1 - indice];
			
		}
		
		
		System.out.println("Soma dos elementos da Diagonal Principal " + dp);
		System.out.println("Soma dos elementos da Diagonal Secundária " + ds);
		
	}

}
