import java.io.*;
import java.util.*;

// Generic Manager
class DataManager<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) throws EntityNotFoundException {
        if (index < 0 || index >= list.size()) {
            throw new EntityNotFoundException("Entity not found at index: " + index);
        }
        return list.get(index);
    }

    public List<T> getAll() {
        return list;
    }
}