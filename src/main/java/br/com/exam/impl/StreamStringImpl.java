package br.com.exam.impl;

import br.com.exam.api.StreamAPI;

/**
 * Classe eh responsavel por implementar uma Stream.
 * Sera passado no construtor uma String representando uma Stream.
 * 
 * Nessa implementacao eh possivel ler todos os itens da Stream um a um entretanto, uma vez
 * alcançado o fim da Stream, nao eh possivel reiniciar seu fluxo da leitura.
 * 
 */
public class StreamStringImpl implements StreamAPI {

	// Variavel interna que armazenara todos os caracteres da String enviada
	private String charStream = null;

	// Variavel interna que realiza o controle das posicoes
	private Integer stringPosition = null;

	/**
	 * Construtor que recebe uma String contendo os chars e os armazena em uma variavel interna
	 */
	public StreamStringImpl(String characterStream) {
		if (characterStream != null && characterStream.trim().length() > 0) {
			this.charStream = characterStream;
		}
		this.stringPosition = 0;
	}

	@Override
	public char getNext() {
		if (hasNext()) {
			//retorna o proximo elemento da String e incrementa o contador de posicoes
			return this.charStream.charAt(stringPosition++);
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean hasNext() {
		if (this.charStream == null || this.charStream.length() == 0) {
			return false;
		}
		else {
			if (this.stringPosition >= this.charStream.length()) {
				return false;
			}
			else {
				return true;
			}
		}
	}

}
