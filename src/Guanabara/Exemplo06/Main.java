package Exemplo06;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Joao");
        p2.setNome("Maria");
        p3.setNome("Pedro");
        p4.setNome("Claudio");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        p2.setCurso("Informatica");
        p3.setSalario(5000.50f);
        p4.setSetor("Software");

        p3.receberAumento(33.75f);
        p4.mudarTrabalhando();
        p2.cancelarMat();
    }
}
