package com.ws.conversion;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConversionWS")
public class ConversionWS {

    @WebMethod(operationName = "FromDZD")
    public float FromDZD(@WebParam(name = "montant") float montant, @WebParam(name = "devise") String devise) {
        float resultat = 1;
        switch(devise) {
            case "eur":
              resultat = montant/130;
              break;
            case "usd":
              resultat = montant/120;
              break;
        }
        return resultat;
    }
    
    @WebMethod(operationName = "ToDZD")
    public float ToDZD(@WebParam(name = "montant") float montant, @WebParam(name = "devise") String devise) {
        float resultat = 1;
        switch(devise) {
            case "eur":
              resultat = montant*130;
              break;
            case "usd":
              resultat = montant*120;
              break;
        }
        return resultat;
    }
}
