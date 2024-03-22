
package Estudo;

public class funçõesString {
	
	public static void main(String[] args) { // método principal, método mãe.
		
		
		String original = "ABC abc ABCDE efgh EFGH   "; System.out.println("original: - "+ original + "-");
		
		String s1 = original.toLowerCase(); System.out.println("toLowerCase: - "+s1+ "-");
		String s2 = original.toUpperCase(); System.out.println("toUpperCase: - "+s2+ "-");
		String s3 = original.trim(); System.out.println("trim: - "+s3+ "-"); // Tira espaçamento invisíveis
		
		String s4 = original.substring(2); System.out.println("substring(2): - "+s4+ "-"); // Recorta a string e começa apartir do número passado
		String s5 = original.substring(1, 9); System.out.println("subtring(1, 9): - "+s5+ "-"); // Recorta a string dando um começo e fim
		
		String s6 = original.replace("ABC", "XYZ"); System.out.println("replace: ABC to XYZ: - "+s6+ "-"); //Substitui a string
		String s7 = original.replace("a", "x"); System.out.println("replace: a to x: - "+s7+ "-"); // Substitui um caractér 
		
		int i = original.indexOf("AB");  System.out.println("indexOf: - "+i+ "-"); // Mostra a posição da string
		int f = original.lastIndexOf("AB"); System.out.println("lastIndexOF: - "+f+ "-"); // Mostra a última da string
		
		System.out.println("");
		
		
		
		String s = "potato banana orange";
		
		String[] vec = s.split(" "); // Separa em um vetor todas as string separadas por espaço, apartir da sua posição
		
		System.out.println(vec[0]); System.out.println(vec[1]); System.out.println(vec[2]);
		
		
		
		
		
		
		
		
		
	}

}
