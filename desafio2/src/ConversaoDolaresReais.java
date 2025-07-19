public class ConversaoDolaresReais {

    public static void main(String[] args) {

        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}

// Versao atualizada com IOF
/* public class ConversaoDolaresReais {

    public static void main(String[] args) {

        double valorEmDolares = 100.50;
        double dolarHoje = 5.58;
        double iof = 0.035;
        double taxaDeConversao = dolarHoje * (1 + iof);

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.printf("O valor em reais é: R$ %.2f", valorEmReais);
    }
} */