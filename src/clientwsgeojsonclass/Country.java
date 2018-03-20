package clientwsgeojsonclass;

import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String alpha2_code;
    private String alpha3_code;

    public String getName() {
        return name;
    }

    public String getAlpha2_code() {
        return alpha2_code;
    }

    public String getAlpha3_code() {
        return alpha3_code;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public void setAlpha2_code(String Alpha2_code) {
        this.alpha2_code = alpha2_code;
    }

    public void setAlpha3_code(String Alpha3_code) {
        this.alpha3_code = alpha3_code;
    }
    
    
    
}
