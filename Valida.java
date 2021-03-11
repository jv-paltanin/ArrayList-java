package exercicios;

/**
 * Classe respons�vel por validar os dados inputados pelo usu�rio
 * 
 * @author Jo�o Victor
 * @since 25/02/2021
 */
public class Valida {

	// verificando se o valor informado � 0
	public static boolean isIntMenorIgualZero(int args) {
		return (args <= 0);
	}

	// verificando se o valor digitado � nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals(""));
	}

	// m�todo para verificar String v�lida
	public static boolean isStringValida(String args) {
		if (!args.matches("[A-Z a-z�������������������������������]*")) {
			return true;
		} else {
			return false;
		}
		// Passa para o m�todo o matches o regex
		// se for diferente de letras d� erro
	} // fim m�todo
}