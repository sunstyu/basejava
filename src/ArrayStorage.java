import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    private int size = 0;

    void clear() {
        for (int i=0; i<size; i++)
        {
            storage[i]=null;
        }
        size = 0;
    }

    void save(Resume r) {
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        for (int i=0; i<size; i++)
        {
            if (storage[i].toString() == uuid)
            {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        int i;
        for (i=0; i<size; i++) {
            if (storage[i].toString() == uuid) {
                break;
            }
        }

        for (int j=i; j<size; j++) {
            storage[j] = storage[j+1];
        }
        storage[size] = null;
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}
