public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistema;
    public HardwareBasico[] hardware = new HardwareBasico[3];
    public MemoriaUSB memoria;
    int contador = 3;

    public Computador(String marca, float preco, SistemaOperacional sistema) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
    }

    void mostrarPCConfigs() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistema.tipo);
        System.out.println("Hardware:");
        for (int i = 0; i < contador; i++) {
            System.out.println(" - " + hardware[i].nome + ": " + hardware[i].capacidade);
        }
        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.nome + " (" + memoria.capacidade + "GB)");
        }
    }
    void adicionarmemoriaUSB(String nome, int capacidade) {
        if (memoria == null) {
            memoria = new MemoriaUSB();
        }
        memoria.nome = nome;
        memoria.capacidade = capacidade;
    }
    void adicionarHardware(HardwareBasico hard) {
        for (int i = 0; i < hardware.length; i++) {
            if (hardware[i] == null) {
                hardware[i] = hard;
                break;
            }
        }
    }

}
