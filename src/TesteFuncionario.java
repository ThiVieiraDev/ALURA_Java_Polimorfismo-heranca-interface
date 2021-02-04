public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario thi = new Funcionario();

        thi.setNome("Thiago Vieira");
        thi.setCpf("123456");
        thi.setSalario(10000.0);

        System.out.println(thi.getNome());
        System.out.println(thi.getBonificacao());
    }
}
