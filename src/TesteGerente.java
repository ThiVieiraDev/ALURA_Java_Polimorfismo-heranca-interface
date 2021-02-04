public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Thaiga");
        g1.setCpf("123123123");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getBonificacao());

        g1.setSenha(2211);
        boolean passou = g1.autentica(2211);

        System.out.println(passou);
    }
}
