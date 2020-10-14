package StoreOfElectronics.Products;

import java.util.Map;
import java.util.HashMap;

public class Microphone extends Product {
    public String sensitivity;
    public Integer numOfsettings;

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public Integer getNumOfsettings() {
        return numOfsettings;
    }

    public void setNumOfsettings(Integer numOfsettings) {
        this.numOfsettings = numOfsettings;
    }

    public Map<String,String> getBaseInfo(){
        return new HashMap<String, String>() {
            {
                put("name","TopAsus");
                put("cost","1200");
                put("producer","Asus");
                put("numOfsettings","4");
            }
        };
    }

}
