public class Principal 
{
    public static void main (String [] args)
    {
        Datos Vuelo = new Datos("Sebastian","Useche",8925);
        DatosNpas VueloPas = new DatosNpas("Sebastian","Useche",8925,30,10);
        DatosTipoAv VueloTip = new DatosTipoAv("Sebastian","Useche",8925,"Boing","Avianca");    
        System.out.println(Vuelo.mostrarDatos()+"\n");
        System.out.println(VueloPas.mostrarDatos()+"\n");
        System.out.println(VueloTip.mostrarDatos());
        Poten potencial= new Poten(4,3);
        System.out.println(potencial.getRes());
    }
}