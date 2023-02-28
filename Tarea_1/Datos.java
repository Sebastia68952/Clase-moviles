public class Datos
{
    //atributos
    private String piloto1;
    private String piloto2;
    private int Nvuelo;

    //constructor
    public Datos(String piloto1, String piloto2, int Nvuelo)
    {
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.Nvuelo = Nvuelo;
    }

    public String getpiloto1()
    {
        return piloto1;
    }

    public String getpiloto2()
    {
        return piloto2;
    }

    public int getNvuelo()
    {
        return Nvuelo;
    }

    public String mostrarDatos()
    {
        return "Piloto 1: "+piloto1+
        "\nPiloto 2: "+piloto2+
        "\nNumero de vuelo: "+Nvuelo;
    }
}