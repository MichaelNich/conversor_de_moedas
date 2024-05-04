import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        Scanner leitura = new Scanner(System.in);
        String escolha = "vazio";
        Conversor conversor = new Conversor();
        List<String> pares = Arrays.asList("USD/BRL", "JPY/USD", "BRL/JPY", "KRW/USD", "EUR/BRL", "CNY/USD");
        CriadorDeLog log = new CriadorDeLog();
        Moeda valorNaoConvertido;


        while (!escolha.equalsIgnoreCase("7")){
            menu.printMenu();
            escolha = leitura.nextLine();

            if (escolha.length() > 1) {
                System.out.println("Opção inválida, tente novamente!");
            } else if (Character.isDigit(escolha.charAt(0))) {
                int digito = Integer.parseInt(escolha);
                if (digito > 7 || digito < 0) {
                    System.out.println("Opção inválida, tente novamente!");
                }
                else if (digito == 7) {
                    System.out.println("Encerrando aplicação!");
                } else {
                    valorNaoConvertido = conversor.pegarValor(digito, pares);
                    menu.printMenuValor();
                    String valor = leitura.nextLine();
                    double valorDouble;
                    boolean valorNumerico = false;
                    while (!valorNumerico)
                    {
                        try {
                            Double.parseDouble(valor); // this is to catch value errors
                            valorNumerico = true;
                        }catch (Exception e) {
                            System.out.println("Erro, Digite apenas valores númericos!");
                            menu.printMenuValor();
                            valor = leitura.nextLine();
                        }
                    }
                    valorDouble = Double.parseDouble(valor) * valorNaoConvertido.conversion_rate();
                    String resultado = "O valor de " + valor + " " + valorNaoConvertido.base_code() + " em " +
                            valorNaoConvertido.target_code() + " é: " + valorDouble;
                    System.out.println(resultado);
                    log.salvarLog(resultado);
                }
            } else {
                System.out.println("Opção inválida, tente novamente! 3");
            }
        }
    }
}