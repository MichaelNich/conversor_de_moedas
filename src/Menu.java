public class Menu {
    String mensagemInicial = """ 
                --- Conversor de moedas ---
                --- Pares de moedas para conversão ---
                1 | Dólar Americano (USD) para Real Brasileiro (BRL)
                2 | Iene Japonês (JPY) para Dólar Americano (USD)
                3 | Real Brasileiro (BRL) para Iene Japonês (JPY)
                4 | Won Sul Coreano (KRW) para Dólar Americano (USD)
                5 | Euro (EUR) para Real Brasileiro (BRL)
                6 | Yuan chinês (CNY) para Dólar Americano (USD)
                7 | Sair
                
                Digite o número correspondente a sua escolha:""";
    public void printMenu() {
        System.out.println(mensagemInicial);
    }

    public void printMenuValor() {
        System.out.println("Digite o valor para ser convertido: ");
    }
    }
