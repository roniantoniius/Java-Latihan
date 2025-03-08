package roniantonius.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {
    private List<Object> daftar = new ArrayList<>(2);
    private Long hitung = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        hitung++;
        if (daftar.size() == 2){
            return daftar.get((int) (hitung % 2));
        } else {
            Object objek = objectFactory.getObject();
            daftar.add(objek);
            return objek;
        }
    }

    @Override
    public Object remove(String name) {
        if (!daftar.isEmpty()){
            return daftar.remove(0);
        }
        return null;
    }

    // registrasi si custom Bean


    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "";
    }
}
