package exercise;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> extends AbstractMap<K, V> implements Map<K, V> {
    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySets = new HashSet<>();
        return null;
    }
}
