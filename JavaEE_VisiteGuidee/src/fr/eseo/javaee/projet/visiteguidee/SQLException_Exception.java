
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-22T00:11:34.914+01:00
 * Generated source version: 3.2.2
 */

@WebFault(name = "SQLException", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/")
public class SQLException_Exception extends Exception {

    private fr.eseo.javaee.projet.visiteguidee.SQLException sqlException;

    public SQLException_Exception() {
        super();
    }

    public SQLException_Exception(String message) {
        super(message);
    }

    public SQLException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public SQLException_Exception(String message, fr.eseo.javaee.projet.visiteguidee.SQLException sqlException) {
        super(message);
        this.sqlException = sqlException;
    }

    public SQLException_Exception(String message, fr.eseo.javaee.projet.visiteguidee.SQLException sqlException, java.lang.Throwable cause) {
        super(message, cause);
        this.sqlException = sqlException;
    }

    public fr.eseo.javaee.projet.visiteguidee.SQLException getFaultInfo() {
        return this.sqlException;
    }
}
