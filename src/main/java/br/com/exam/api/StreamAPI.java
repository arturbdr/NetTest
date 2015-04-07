package br.com.exam.api;

/**
 * Interface com metodos 
 */
public interface StreamAPI {
	
	/**
	 * Uma chamada para getNext() irá retornar o próximo caracter a ser processado na Stream
	 * @return char representando o proximo caracter na Stream. 
	 */
	public char getNext();

	/**
	 * Uma chamada para hasNext() irá retornar se a stream ainda contém caracteres para processar
	 * @return true caso exista caracteres para processar. False caso contrario
	 */
	public boolean hasNext();
	
	
}
