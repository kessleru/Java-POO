package Exemplo07;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Joao");
        v1.setSexo("M");
        v1.setIdade(25);
        System.out.println(v1.toString());
        System.out.println();

        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setSexo("M");
        a1.setIdade(25);
        a1.setMatricula(111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(111);
        b1.setNome("Otavio");
        b1.setSexo("M");
        b1.setIdade(19);
        b1.setCurso("Informatica");
        b1.pagarMensalidade();
        b1.setBolsa(7.5f);
        System.out.println(b1.toString());
    }
}
