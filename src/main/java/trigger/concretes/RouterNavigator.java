package trigger.concretes;

import trigger.abstracts.Model;
import trigger.abstracts.Navigator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class RouterNavigator<T> implements Navigator<T> {
    private final Map<String, Model> modelPool = new HashMap<>();

    @Override
    public void  addPool(Map<String, Model> modelPool) {
        this.modelPool.putAll(modelPool);
    }

    @Override
    public Model add(String key, Model model) {
        return this.modelPool.put(key,model);
    }

    @Override
    public Model get(String key) {
        return this.modelPool.get(key);
    }

    @Override
    public void remove(String key) {
        this.remove(key);
    }

}
