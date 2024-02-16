package two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VehiclesSpec {

    private Map properties;

    public VehiclesSpec(Map properties) {

        if (properties == null){
            this.properties = new HashMap();
        } else{
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName){
        return properties.get(propertyName);
    }

    public boolean matches(VehiclesSpec spec){
        for(Iterator i = spec.getProperties().keySet().iterator(); i.hasNext();){
            String propertyName = (String) i.next();
            if (!properties.get(propertyName).equals(spec.getProperty(propertyName))){
                return false;
            }
        }
        return true;
    }

    public Map getProperties() {
        return properties;
    }
}
