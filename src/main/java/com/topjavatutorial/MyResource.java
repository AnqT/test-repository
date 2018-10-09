package com.topjavatutorial;

import com.topjavatutorials.models.ProductPrice;
import com.topjavatutorials.models.ProductPriceDAO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("priceof")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("{barcode}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductPrice> getIt(@PathParam("barcode") long barcode) {
        ProductPriceDAO dao = new ProductPriceDAO();
        return dao.getPrice(barcode);
    }
}
