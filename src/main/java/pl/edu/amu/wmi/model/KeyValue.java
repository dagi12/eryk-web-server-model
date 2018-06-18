package pl.edu.amu.wmi.model;

/**
 * Stworzone przez Eryk Mariankowski dnia 26.04.18.
 */
public interface KeyValue<T> {

    String getKey();

    void setKey(String key);

    T getValue();

    void setValue(T value);

}
