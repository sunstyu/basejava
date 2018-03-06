import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

//тестирую выгрузку в github из IDEA

public class ArrayStorage {
    final private int STORAGE_MAX_SIZE = 10000;
    Resume[] storage = new Resume[STORAGE_MAX_SIZE];
    private int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume r) {
        if (size < STORAGE_MAX_SIZE) {
            if (r.uuid != null) {
                storage[size] = r;
                size++;
            } else {
                System.out.println("----------------------------");
                System.out.println("Передано пустое значение");
            }
        } else {
            System.out.println("----------------------------");
            System.out.println("Недостаточно места для сохранения резюме.");
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
                break;
            }
        }
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
