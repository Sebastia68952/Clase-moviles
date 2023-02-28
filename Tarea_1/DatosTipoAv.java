public class DatosTipoAv extends Datos //hereda de datos con el extends
{
    private String Avion;
    private String AeroLin;

    //constructor
    public DatosTipoAv (String piloto1, String piloto2, int Nvuelo, String Avion, String AeroLin)
    {
        super(piloto1,piloto2,Nvuelo); //ya estan inicialisados los atributos
        this.Avion = Avion;
        this.AeroLin = AeroLin;
    }
    public String getAvion()
    {
        return Avion;
    }

    public String getAeroLin()
    {
        return AeroLin;
    }

    public String mostrarDatos()
    {
        return "Piloto 1: "+getpiloto1()+
        "\nPiloto 2: "+getpiloto2()+
        "\nNumero de vuelo: "+getNvuelo()+
        "\nTipo de avion: "+Avion+
        "\nTipo de AeroLin: "+AeroLin;
    }
}