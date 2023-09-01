package datos;

/*
 *  @author esteban.vargas@uao.edu.co, Esteban Vargas Sanchez, Codigo 2221675
 *  @author emmanuel.carrera@uao.edu.co, Emmanuel Carrera Cardona, Codigo 2221577
 *  @author carlos_andres.garzon@uao.edu.co, Carlos Andres Garzon Guerrero, Codigo 2220968
 *  @author joan.salcedo@uao.edu.co, Joan Sebastian Salcedo Obando, Codigo 2220769
 *  @date 31 /Agosto/2023
 *  @version 1.0
 */



import modelo.Cola;
import modelo.OperacionesCola;

/**
 *
 * @author Esteban V 
 * @author Joan Salcedo 2220769 joan.salcedo@uao.edu.co
 * @author Carlos Garzon 2220968 carlos_andres.garzon@uao.edu.co
 * @author Emmanuel Carrera
 */
public class Tools {
    /**
     * Metodo que recibe una cola y convierte su contenido en un documento en formato
     * HTML para su posterior visualización.
     * El metodo hace usa copia profunda para asegurar que no se toquen o destruyan los datos 
     * de la cola original <code>p</code>.
     * @param p
     * @return 
     */
    //<editor-fold defaultstate="collapsed" desc="Metodo :: String convertirColaAHtml(Cola<Valor>)">
    public static String convertirColaAHtml2(Cola<Vehiculo> p)
    {
        StringBuilder sb = new StringBuilder("<html>");
        Cola<Vehiculo> q = OperacionesCola.duplicarCola(p);
        
        sb.append("<noscript>").append("</noscript>");
        
        if (!q.estaVacia())
        {
            sb.append("<table style=\"width: 100%;\" align=\"center\" border=\"2\">");
            sb.append("<tr>").append("<th colspan=\"7\" >").append("VEHICULOS").append("</th>").append("</tr>");
            sb.append("<tr>").append("<th style=\"width: 10%;\">").append("Receptor").append("</th>").append("<th>").append("1").append("</th>").append("<th>").append("2").append("</th>").append("<th>").append("3").append("</th>").append("<th>").append("4").append("</th>").append("</tr>");
            do
            {
                Vehiculo e = q.desenColar();
                sb.append("<tr>").append("<td>");
                sb.append("nombre").append("</td>");
                sb.append("<td>").append(e.getModelo());
                sb.append("</td>");
                 sb.append("<td>").append(e.getModelo());
                sb.append("</td>");
                sb.append("<td>").append(e.getModelo());
                sb.append("</td>");
                sb.append("<td>").append(e.getModelo());
                sb.append("</td>");
                sb.append("</tr>");
                
                 sb.append("<tr>").append("<td>");
                sb.append("modelo").append("</td>");
                sb.append("<td>").append(e.getNombreDuenoV());
                sb.append("</td>");
                sb.append("<td>").append(e.getNombreDuenoV());
                sb.append("</td>");
                sb.append("<td>").append(e.getNombreDuenoV());
                sb.append("</td>");
                sb.append("<td>").append(e.getNombreDuenoV());
                sb.append("</td>");
                        
                sb.append("</tr>");
                
                sb.append("<tr>").append("<td>");
                sb.append("Tiempo Espera").append("</td>");
                sb.append("<td>").append(e.getTiempoEspera());
                sb.append("</td>");
                sb.append("<td>").append(e.getTiempoEspera());
                sb.append("</td>");
                sb.append("<td>").append(e.getTiempoEspera());
                sb.append("</td>");
                sb.append("<td>").append(e.getTiempoEspera());
                sb.append("</td>");
    
                sb.append("</tr>");
                
                
            }
            while (!q.estaVacia());
            sb.append("</table>");
        }
        else
        {
            sb.append("<h1 align=\"center\">").append("Cola Vacia").append("</h1>");
        }
        
        sb.append("</html>");
        
        return sb.toString();
    }
    //</editor-fold>

    /**
     * Metodo que inyecta código HTML en un documento buscando la marca <code>script</code>, esto es util
     * para delegar tareas que no se deben o quieren realizar en el procesamiento principal.
     * @param p
     * @param texto
     * @return 
     */
    //<editor-fold defaultstate="collapsed" desc="String convertirColaAHtml(Pila<Valor> p, String texto)">
    public static String convertirColaAHtml(Cola<Vehiculo> p, String texto)
    {
        String html = "<br><center>Se retiro " + texto + "</center></br>";
        StringBuilder sb = new StringBuilder(convertirColaAHtml(p));
        try
        {
            sb.replace(sb.indexOf("<noscript>"), sb.indexOf("</noscript>"), html);
        }
        catch (StringIndexOutOfBoundsException ex)
        {
        }
        
        return sb.toString();
    }
    //</editor-fold>
    
    public static String convertirColaAHtml(Cola<Vehiculo> p)
    {
        StringBuilder sb = new StringBuilder("<html>");
        Cola<Vehiculo> q = OperacionesCola.duplicarCola(p);
        
        sb.append("<noscript>").append("</noscript>");
        
        if (!q.estaVacia())
        {
            sb.append("<table style=\"width: 100%;\" align=\"center\" border=\"2\">");
            sb.append("<tr>").append("<th colspan=\"7\" >").append("VEHICULOS").append("</th>").append("</tr>");
            sb.append("<tr>").append("<th style=\"width: 10%;\">").append("nombre").append("</th>").append("<th>").append("modelo").append("</th>").append("<th>").append("tiempo espera").append("</th>");
            do
            {
                Vehiculo e = q.desenColar();
                sb.append("<tr>");
                sb.append("<td>").append(e.getModelo());
                sb.append("</td>");
                 sb.append("<td>").append(e.getNombreDuenoV());
                sb.append("</td>");
                sb.append("<td>").append(e.getTiempoEspera());
                sb.append("</td>");
                sb.append("</tr>");
                
                
                
                
                
            }
            while (!q.estaVacia());
            sb.append("</table>");
        }
        else
        {
            sb.append("<h1 align=\"center\">").append("Cola Vacia").append("</h1>");
        }
        
        sb.append("</html>");
        
        return sb.toString();
    }
}

