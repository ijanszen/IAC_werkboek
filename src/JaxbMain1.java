import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by ijans on 08/02/2017.
 */
public class JaxbMain1 {
    public static void main(String[] args){
        Address ad = new Address();
        ad.setName("Henk");
        ad.setCity("Amsterdank");
        ad.setZip("1337WE");

        Customer cu = new Customer();
        cu.setName("henkie");
        cu.setDateofBirth(1996);
        try {

            File file = new File("C:\\Users\\ijans\\Documents");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(cu, file);
            jaxbMarshaller.marshal(cu, System.out);

        }

        catch (JAXBException e) {
            e.printStackTrace();
        }


    }

}
