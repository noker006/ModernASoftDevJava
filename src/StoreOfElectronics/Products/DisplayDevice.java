package StoreOfElectronics.Products;

import java.util.HashMap;
import java.util.Map;

public class DisplayDevice extends Product{

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

    public String testResolution(String resolution){
        return "everything all right";
    }
}
