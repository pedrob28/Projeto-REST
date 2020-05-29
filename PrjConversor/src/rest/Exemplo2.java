package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/echo2")
public class Exemplo2 {
	
	@GET
	@Produces("text/plain;charset=UTF-8")
	public String FparaC(@QueryParam("temperatura") float temperatura) {
		float result = (float) ((temperatura * 1.8) + 38);
		String resultado = Float.toString(result);
		return "Convertendo " + temperatura +"F° + para Celsius " +  resultado + "C°";
	}
	
	
}

