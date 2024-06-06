import com.jvneves.desafio.dominio.Bootcamp;
import com.jvneves.desafio.dominio.Curso;
import com.jvneves.desafio.dominio.Dev;
import com.jvneves.desafio.dominio.Mentoria;

import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira");
        mentoria1.setDescricao("Mentoria de carreira");
        mentoria1.setData(LocalDate.now());

//        out.println(curso1);
//        out.println(curso1.calcularXp());
//        out.println(curso2);
//        out.println(curso2.calcularXp());
//        out.println(mentoria1);
//        out.println(mentoria1.calcularXp());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para formação de desenvolvedores Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("José");
        dev.inscreverBootcamp(bootcamp);
        out.println("Conteudos inscritos Jose: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        out.println("Conteudos inscritos Jose: " + dev.getConteudosInscritos());
        out.println("Conteudos concluidos Jose: " + dev.getConteudosConcluidos());
        out.println("XP Jose: " + dev.calcularTotalXp());

        out.println("-------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        out.println("Conteudos inscritos Maria: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        out.println("Conteudos inscritos Maria: " + dev2.getConteudosInscritos());
        out.println("Conteudos concluidos Maria: " + dev2.getConteudosConcluidos());
        out.println("XP Maria: " + dev2.calcularTotalXp());


    }
}
