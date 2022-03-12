package discos;

/**
 * Disco digital para su uso por una companhia de 
 * "streamming". Se usa como ejemplo introductorio a 
 * algunos aspectos de Java.
 *
 * @author Elisa Viso.
 * @version 1.0, 09/11/15.
 */                           
public interface ServiciosDisco  {

 /**
  * Proporciona el tipo del disco.
  *
  * @return el tipo de disco entre 1 y 3
  */
    public short getTIPO_DISCO();

 /**
  * Proporciona el nombre que tenga asociado el disco. Puede ser el
  * musico si se trata de un CD o la pelicula si se trata de un DVD
  * o Blue-Ray.
  *
  * @return nombre del musico si se trata de un CD o de la pelicula
  * si se trata de un DVD o Blue-Ray.
  */
    public String getNOMBRE();

 /**
  * Proporciona el anho en que fue grabado el disco.
  *
  * @return fecha de grabacion.
  */ 
  public int getANHO();

 /**
  * Proporciona el numero de transmisiones permitidas.
  *
  * @return numero de transmisiones permitidas.
  */
    public int getPermitidas();

 /**
  * Proporciona el numero de transmisiones activas.
  *
  * @return numero de transmisiones activas.
  */
    public int getActivas();

 /**
  * Modifica el valor de transmisiones permitidas.
  *
  * @param permisos valor que se desea establecer
  */
    public void setPermitidas(int permisos);

 /**
  * Modifica el valor de transmisiones activas.
  *
  * @param activ valor que se desea establecer
  */
    public void setActivas(int activ);

 /** Proporciona una cadena con los distintos campos ocupando un
  * lugar definido.
  *
  * 
  * @return La informacion del disco linealizada en forma de
  *         cadena, todos los discos con la misma informacion.
  */  
 public String toString();

 /**
  * Muestra de forma estatica el contenido de este disco.
  * 
  * @return una cadena con la informacion y que contiene saltos de
  *         linea.
  */
 public String muestraDisco(String titulo);

 /**
  * Otorga una transmision, contestando con la fecha y hora en que
  * la est?? dando. Si no la puede dar, responde
  * negativamente. Actualiza el numero de transmisiones activas.
     *
     * @return Un mensaje diciendo si pudo o no otorgar la transmision.
  */
 public String daTransmision();

 /**
  * Actualiza el numero de transmisiones activas.
  */
 public boolean terminaTransmision();

 /**
  * Duplica a este disco, construyendo otro objeto con los mismos
  * valores, pero con identidad distintinta.
  *
  * @return un nuevo disco identico al que se le pide.
  */
 public ServiciosDisco copiaDisco( );
}