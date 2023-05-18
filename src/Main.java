public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação á Objetos
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquel = new Pessoa();
        // Definir formato do objeto
        qualquel.nome = "Rita";
        qualquel.sobrenome = "Lee";
        qualquel.falar();
        System.out.println(qualquel.falar("oi"));

    }
}