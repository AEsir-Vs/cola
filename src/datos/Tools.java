package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import modelo.Cola;
import modelo.OperacionesCola;

/**
 *
 * @author Alejo-PC
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
    //<editor-fold defaultstate="collapsed" desc="Metodo :: String convertirPilaAHtml(Pila<Valor>)">
    public static String convertirColaAHtml(Cola<Vehiculo> p)
    {
        StringBuilder sb = new StringBuilder("<html>");
        Cola<Vehiculo> q = OperacionesCola.duplicarCola(p);
        
        sb.append("<noscript>").append("</noscript>");
        
        if (!q.estaVacia())
        {
            sb.append("<table align=\"center\" border=\"2\">");
            sb.append("<tr>").append("<th>").append("Vehiculos").append("</th>").append("</tr>");
            do
            {
                Vehiculo e = q.desenColar();
                sb.append("<tr>").append("<td>");
                sb.append(e.getModelo()+"-");
                sb.append(e.getNombreDuenoV()+"-");
                sb.append(e.getTiempoEspera()+"-");
                sb.append("</td>").append("</tr>");
                //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
                
            }
            while (!q.estaVacia());
            sb.append("</table>");
        }
        else
        {
            sb.append("<h1 align=\"center\">").append("Pila Vacia").append("</h1>");
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
    //<editor-fold defaultstate="collapsed" desc="String convertirPilaAHtml(Pila<Valor> p, String texto)">
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
}
