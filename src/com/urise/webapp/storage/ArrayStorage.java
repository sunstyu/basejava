package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {
    private final int STORAGE_MAX_SIZE = 10000;
    private Resume[] storage = new Resume[STORAGE_MAX_SIZE];
    private int size;

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    public void update(Resume resume) {
        int index = getUuidIndex(resume.getUuid());
        if (index >= 0) {
            storage[index] = resume;
            System.out.println("----------------------------");
            System.out.printf("Элемент %s обновлен%n", storage[index].getUuid());
        } else {
            System.out.println("----------------------------");
            System.out.println("Элемент не найден");
        }
    }

    public void save(Resume resume) {
        if (resume.getUuid() == null) {
            System.out.println("----------------------------");
            System.out.println("Передано пустое значение");
            return;
        }
        if (size >= STORAGE_MAX_SIZE) {
            System.out.println("----------------------------");
            System.out.println("Недостаточно места для сохранения резюме.");
            return;
        }
        int index = getUuidIndex(resume.getUuid());
        if (getUuidIndex(resume.getUuid()) != -1) {
            System.out.println("----------------------------");
            System.out.println("Такой элемент уже существует!");
            return;
        }
        storage[size] = resume;
        size++;

    }

    public Resume get(String uuid) {
        int index = getUuidIndex(uuid);
        if (index >= 0) {
            return storage[index];
        }
        System.out.println("----------------------------");
        System.out.println("Элемент не найден");
        return null;
    }

    public void delete(String uuid) {
        int index = getUuidIndex(uuid);
        if (index >= 0) {
            storage[index] = storage[size - 1];
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
