package hellocucumber;

import java.util.HashMap;
import java.util.Map;

public class AdresseRepository {

	private static Map<String, AdresseModel> datas = null;
	 
    public AdresseRepository() {
        datas = new HashMap<>();
        datas.put("inactive_France", new AdresseModel("FACE", "inactive", "France", "sans date d'effet"));
        datas.put("active_Pologne", new AdresseModel("EC", "active", "Pologne", "avec date d'effet"));
    }
 
    public AdresseModel read(String id) {
        return datas.get(id);
    }
 
    public AdresseModel update(AdresseModel entity) {
        return datas.put(entity.getActive()+"_"+entity.getPays(), entity);
    }
}
