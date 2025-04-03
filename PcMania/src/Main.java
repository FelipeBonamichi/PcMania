import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador promocao1 = new Computador("Apple", 9802,new SistemaOperacional("Linux Ubunto", 32));
        Computador promocao2 = new Computador("Sansung",11036,new SistemaOperacional("Windows 8", 64));
        Computador promocao3 = new Computador("Dell",15480,new SistemaOperacional("Windows 10", 64));

        promocao1.adicionarHardware(new HardwareBasico("Pentium core i3", 2200));
        promocao1.adicionarHardware(new HardwareBasico("Memoria Ram", 8));
        promocao1.adicionarHardware(new HardwareBasico("HD", 500));
        promocao1.adicionarmemoriaUSB("Pen-Drive",16);

        promocao2.adicionarHardware(new HardwareBasico("Pentium core i5", 3370));
        promocao2.adicionarHardware(new HardwareBasico("Memoria Ram", 16));
        promocao2.adicionarHardware(new HardwareBasico("HD",1000 ));
        promocao2.adicionarmemoriaUSB("Pen-Drive",32);

        promocao3.adicionarHardware(new HardwareBasico("Pentium core i7", 4500));
        promocao3.adicionarHardware(new HardwareBasico("Memoria Ram", 32));
        promocao3.adicionarHardware(new HardwareBasico("HD",2000));
        promocao3.adicionarmemoriaUSB("HD externo",1000);

        Cliente cliente1 = new Cliente("felipe","17785035601");

        promocao1.mostrarPCConfigs();
        promocao2.mostrarPCConfigs();
        promocao3.mostrarPCConfigs();

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Escolha uma promoção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente1.CalcularTotal(9802);
                    break;
                case 2:
                    cliente1.CalcularTotal(1100);
                    break;
                case 3:
                    cliente1.CalcularTotal(15480);
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        cliente1.ImprimirTotal();
        scanner.close();
    }
}