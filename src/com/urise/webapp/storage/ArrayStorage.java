package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {
    final private int STORAGE_MAX_SIZE = 10000;
    private Resume[] storage = new Resume[STORAGE_MAX_SIZE];
    private int size = 0;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public void update(Resume r) {
        int i = this.getUuidIndex(r.getUuid());
        if (i >= 0) {
            storage[i] = r;
            System.out.println("----------------------------");
            System.out.printf("Элемент %s обновлен%n", storage[i].getUuid());
        } else {
            System.out.println("----------------------------");
            System.out.println("Элемент не найден");
        }
    }

    public void save(Resume r) {
        //сохраняем только если такого элемента еще нет в массиве
        if (this.getUuidIndex(r.getUuid()) == -1) {
            //если есть место в массиве
            if (size < STORAGE_MAX_SIZE) {
                if (r.getUuid() != null) {
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
        } else {
            System.out.println("----------------------------");
            System.out.println("Такой элемент уже существует!");
        }
    }

    public Resume get(String uuid) {
        int i = this.getUuidIndex(uuid);
        if (i >= 0) {
            return storage[i];
        } else {
            System.out.println("----------------------------");
            System.out.println("Элемент не найден");
            return null;
        }
    }

    public void delete(String uuid) {
        int i = this.getUuidIndex(uuid);
        if (i >= 0) {
            storage[i] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        } else {
            System.out.println("----------------------------");
            System.out.println("Элемент не найден");
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public int size() {
        return size;
    }

    private int getUuidIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}
