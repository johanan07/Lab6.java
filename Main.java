import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        RegistroDisquera departamentoMarketing = RegistroDisquera.getInstance();
        RegistroDisquera departamentoProduccion = RegistroDisquera.getInstance();


        departamentoMarketing.registrarArtista("Elvis Presley");
        departamentoMarketing.registrarArtista("The Weeknd");


        departamentoProduccion.registrarArtista("Michael Jackson");


        departamentoProduccion.mostrarArtistas();



        System.out.println("¿Ambos departamentos usan la misma instancia?");
        System.out.println(departamentoMarketing == departamentoProduccion);
    }
}
