package br.com.exam.main;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.exam.api.StreamAPI;

/**
 * Classe com metodo utilirio que recebe um Stream de chars e localiza o
 * primeiro caractere nao repetido
 * 
 */
public class FindChar {

	public static char firstChar(StreamAPI input) {

		// Utilizado LinkedHashMap para manter a ordem em que os elementos foram
		// inseridos
		Map<Character, Integer> characterMap = new LinkedHashMap<Character, Integer>();
		while (input.hasNext()) {
			char currentChar = input.getNext();

			// Armazena todos os caracteres no map. A chave eh o proprio
			// caracter o valor eh a quantidade de vezes em que foi encontrado
			if (characterMap.containsKey(currentChar)) {
				characterMap.put(currentChar, characterMap.get(currentChar) + 1);
			} 
			else {
				characterMap.put(currentChar, 1);
			}
		}

		// Agora, com o map preenchido, itera sobre cada elemento procurando
		// pelo primeiro caracter que tenha sido encontrado apenas uma vez
		for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		// Significa que nao foram encontrado caracteres que nao se repetem
		return 0;
	}

}
