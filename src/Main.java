import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        Producto producto = new Producto("C001", "Teclado Mecanico");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A006", "Monito 19", 10.6);
        System.out.println(alquilable);

        //Producto Tecnologico
        Empresa empresa = new Empresa("ASUS", "Av. Villazon #01", 2000);
        Tecnologico tecnologico = new Tecnologico("B002", "Vostro 100", "USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor= new Monitor("H112","Monitor 16", 13.5, "FULL HD");
        System.out.println(monitor);

        //Cpu
        Empresa delux = new Empresa("Delux", "Av. Villazon #33", 3500);
        Cpu cpu= new Cpu("JK2J","Delux","China", Calendar.getInstance().getTime(), delux, 15);
        System.out.println(cpu);
    }
}
