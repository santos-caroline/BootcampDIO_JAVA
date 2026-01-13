package aula6InterfacesLambda;

/*
Em Java, uma interface é um contrato que define um conjunto de métodos (assinaturas) que uma classe deve
implementar, especificando o "o quê" uma classe faz, mas não "como". Funciona como um guia ou modelo, estabelecendo
um padrão de comportamento que classes diferentes podem seguir de maneiras distintas, promovendo abstração e
permitindo herança múltipla de comportamento (uma classe pode implementar várias interfaces).
>>>Características Principais:
    Contrato: Declara métodos (abstratos por padrão) que as classes que a implementam (usando implements) devem
    obrigatoriamente fornecer uma implementação.
    Abstração: Define o comportamento sem detalhar a implementação, permitindo flexibilidade.
    Constantes: Pode declarar constantes (públicas, estáticas e finais).
    Herança Múltipla: Uma classe pode implementar múltiplas interfaces, algo não permitido na herança de classes.
    Métodos Padrão (Java 8+): Permite métodos com implementação (com a palavra-chave default) e métodos estáticos.
 */
public interface MusicPlayer {
    String music = "Pam pam pam"; //todas as propriedades numa interface serão públicas(public), constantes(final)
    // e estáticas(static)



    void playMusic(); //método abstrato

    void pauseMusic();

    void stopMusic();

}
