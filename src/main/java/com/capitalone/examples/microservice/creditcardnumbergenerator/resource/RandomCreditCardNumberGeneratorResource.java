package com.capitalone.examples.microservice.creditcardnumbergenerator.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardRequest;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardResponse;
import com.capitalone.examples.microservice.creditcardnumbergenerator.service.RandomCreditCardNumberGeneratorService;

/**
 * Root resource (exposed at "generate" path)
 */
@Path("/generate")
public class RandomCreditCardNumberGeneratorResource {
	
	
	RandomCreditCardNumberGeneratorService generatorService = new RandomCreditCardNumberGeneratorService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
    public CreditCardResponse generateCreditCardNumbers(CreditCardRequest request) {
        return generatorService.generateCreditCardNumbers(request);
    }
}
