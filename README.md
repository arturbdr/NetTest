# NetTest
This is a requirement requested by Rodrigo Camargo with the following description:
<br/>
Dada uma stream, encontre o primeiro caracter que não se repita no resto da stream. O termino da leitura da stream é garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream. Você terá acesso a leitura da stream através dos métodos de interface fornecidos ao termino do enunciado. 
Uma chamada para hasNext() irá retornar se a stream ainda contém caracteres para processar.
Uma chamada para getNext() irá retornar o próximo caracter a ser processado na stream. 
Não é possível reiniciar o fluxo da leitura da stream.

Exemplo:
Input:  aAbBABac
Output: b
No exemplo, ‘b’ é o primeiro caracter da stream que não se repete.
 
Segue o exemplo da interface em Java:
public interface Stream{
    public char getNext(); 
    public boolean hasNext();
}

public static char firstChar(Stream input) {
}

