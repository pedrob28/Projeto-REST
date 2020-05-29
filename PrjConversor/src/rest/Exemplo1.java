package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/echo")
public class Exemplo1 {
	
	@GET
	public String CparaF(@QueryParam("temperatura") float temperatura) {
		float result = 9 * temperatura / 5 + 32 ;
		String resultado = Float.toString(result);
		return resultado;
	}
	
	
}

