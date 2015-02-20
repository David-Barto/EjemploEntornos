package calculadorasalario;
public class SueldoEmpleado {

    static float precioHoraA;
    static float precioHoraB;
    static float precioHoraC;
    static float precioHoraD;
    
    public static void setPreciosHora(float ImpA, float ImpB, float ImpC, float ImpD) {
        precioHoraA = ImpA;
        precioHoraB = ImpB;
        precioHoraC = ImpC;
        precioHoraD = ImpD;
    }
    
    public static float calcularSueldo(String categoria, int horas) {
        float sueldo;
        float precioHora;
        switch(categoria) {
            case "A":
                precioHora = precioHoraA;
                break;
            case "B":
                precioHora = precioHoraB;
                break;
            case "C":
                precioHora = precioHoraC;
                break;
            case "D":
                precioHora = precioHoraD;
                break;
            default:
                precioHora = 0;
                break;
        }
        
        if (horas>120) {
            sueldo = (120*precioHora)+((horas-120)*(precioHora*1.5F));
        }else{
            sueldo = horas*precioHora;
        }
        return sueldo;
    }
    
}