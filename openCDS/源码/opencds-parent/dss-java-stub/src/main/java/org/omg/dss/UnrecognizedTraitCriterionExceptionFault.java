
package org.omg.dss;

import javax.xml.ws.WebFault;

import org.omg.dss.exception.UnrecognizedTraitCriterionException;


/**
 * This class was generated by Apache CXF 2.2.9
 * Thu Jul 28 08:04:45 MDT 2011
 * Generated source version: 2.2.9
 * 
 */

@WebFault(name = "UnrecognizedTraitCriterionException", targetNamespace = "http://www.omg.org/spec/CDSS/201105/dss")
public class UnrecognizedTraitCriterionExceptionFault extends Exception {
    public static final long serialVersionUID = 20110728080445L;
    
    private UnrecognizedTraitCriterionException unrecognizedTraitCriterionException;

    public UnrecognizedTraitCriterionExceptionFault() {
        super();
    }
    
    public UnrecognizedTraitCriterionExceptionFault(String message) {
        super(message);
    }
    
    public UnrecognizedTraitCriterionExceptionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UnrecognizedTraitCriterionExceptionFault(String message, UnrecognizedTraitCriterionException unrecognizedTraitCriterionException) {
        super(message);
        this.unrecognizedTraitCriterionException = unrecognizedTraitCriterionException;
    }

    public UnrecognizedTraitCriterionExceptionFault(String message, UnrecognizedTraitCriterionException unrecognizedTraitCriterionException, Throwable cause) {
        super(message, cause);
        this.unrecognizedTraitCriterionException = unrecognizedTraitCriterionException;
    }

    public UnrecognizedTraitCriterionException getFaultInfo() {
        return this.unrecognizedTraitCriterionException;
    }
}
