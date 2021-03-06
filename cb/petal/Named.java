package cb.petal;

/**
 * Denote that a petal object has a name parameter, e.g.
 * (object Class "Person" ...)
 *
 * @version $Id: Named.java,v 1.4 2001/06/22 09:10:36 dahm Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public interface Named {
  public void   setNameParameter(String o);
  public String getNameParameter();
}
