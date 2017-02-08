import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ijans on 08/02/2017.
 */
@XmlRootElement
public class Customer {
    private String name;
    private int DateofBirth;
    private Map<String, > adress = new HashMap();

    public String getName() {
        return name;
    }
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public int getDateofBirth() {
        return DateofBirth;
    }
    @XmlAttribute
    public void setDateofBirth(int dateofBirth) {
        DateofBirth = dateofBirth;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", DateofBirth=" + DateofBirth +
                ", adress=" + adress +
                '}';
    }
}
