public class DatosNpas extends Datos //hereda de datos con el extends
{
    private int NMasculino;
    private int NFemenino;

    //constructor
    public DatosNpas (String piloto1, String piloto2, int Nvuelo, int NMasculino, int NFemenino)
    {
        super(piloto1,piloto2,Nvuelo); //ya estan inicialisados los atributos
        this.NMasculino = NMasculino;
        this.NFemenino = NFemenino;
    }
    public int getNMasculino()
    {
        return NMasculino;
    }

    public int getNFemenino()
    {
        return NFemenino;
    }

    public String mostrarDatos()
    {
        return "Piloto 1: "+getpiloto1()+
        "\nPiloto 2: "+getpiloto2()+
        "\nNumero de vuelo: "+getNvuelo()+
        "\nNum pasajeros masculinos: "+NMasculino+
        "\nNum pasajeros femeninos: "+NFemenino;
    }
}