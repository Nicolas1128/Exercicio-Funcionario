import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f1,f2;

        f1 = new Funcionario();
        f2 = new Funcionario();

        System.out.println("Dados do funcionário: ");
            f1.nome = sc.next();
            f1.valorPorHora = sc.nextDouble();
            f1.horas = sc.nextInt();

        System.out.println("Dados do funcionário: ");
            f2.nome = sc.next();
            f2.valorPorHora = sc.nextDouble();
            f2.horas = sc.nextInt();

        double total = f1.total() + f2.total();
        System.out.printf("Valor total: %.2f" , total);
    }
}
