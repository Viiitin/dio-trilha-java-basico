import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Digite o Número de sua Agencia");
        String agencia = scanner.next();

        System.out.println("Digite Seu Nome");
        String nomecliente = scanner.next();
        
        System.out.println("Seu Saldo e");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomecliente + ",obrigado por criar uma conta em nosso banco,sua agência é "
        + agencia + ",conta " + numero + ",e seu saldo e " + saldo + ",já está disponível para saque");
    }
}
 