package trigger.abstracts;

import java.util.List;
import java.util.Map;

public interface Navigator<T> {
    void  addPool(Map<String, Model> modelPool);
    Model add(String key , Model model);
    Model get(String key);
    void remove(String key);
}
