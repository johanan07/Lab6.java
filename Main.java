import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
        RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();


        departamentoMarketing.registrarArtista("Dua Lipa");
        departamentoMarketing.registrarArtista("The Weeknd");


        departamentoProduccion.registrarArtista("Rosalía");


        departamentoProduccion.mostrarArtistas();



        System.out.println("¿Ambos departamentos usan la misma instancia?");
        System.out.println(departamentoMarketing == departamentoProduccion);
    }
}