package aula2;

public class repeticaoFor {

    public static void main(String[] args){
        // Estrutura de repetição for
        for (int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i);
        }

        // Exemplo de iteração sobre um array
        //String[] args = {"Maçã", "Banana", "Laranja", "Uva"};
        for (String s : args) {
            System.out.println("Fruta: " + s);
        }

        // Exemplo de for-each (enhanced for loop)
        for (String fruta : args){
            System.out.println("Fruta (for-each): " + fruta);
        }
        
        /* Os args no Run Configuration permitem passar valores direto ao programa sem usar o console.
        São recebidos no main via String[] args.
        Caminho: Run → Edit Configurations → + → Application → Program Arguments  */


    }
}
