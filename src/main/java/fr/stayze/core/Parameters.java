package fr.stayze.core;

import java.util.HashMap;

public class Parameters {

    private HashMap<String, Object> parameters;

    public Parameters() {
        this.parameters = new HashMap<>();
    }

    /**
     * Add a parameter to the parameters list
     * @param key -> The key of the parameter
     * @param value -> The value of the parameter
     */
    public void add(String key, Object value) {
        this.parameters.put(key, value);
    }

    /**
     * Get a parameter from the parameters list
     * @param key -> The key of the parameter
     * @return The value of the parameter
     */
    public Object get(String key) {
        return this.parameters.get(key);
    }

    /**
     * Remove a parameter from the parameters list
     * @param key -> The key of the parameter
     */
    public void remove(String key) {
        this.parameters.remove(key);
    }

}
