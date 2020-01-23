package ListsImplementations;

import Student.Student;

class MyArrayList {
    private Student[] array = new Student[10];
    private int index = 0;

    boolean add(Student s) {
        if (index != array.length) {
            array[index] = s;
            index++;
        } else {
            enlargeArray();
            array[index] = s;
            index++;
        }
        return true;
    }

    private void enlargeArray() {
        Student[] oldArray = array;
        array = new Student[array.length * 2];
        if (oldArray.length >= 0) {
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);
        }
    }


    boolean remove(Student s) {
        // TODO: 1/22/2020
        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
        }
        index--;
        return true;
    }

    int size() {
        return index;
    }

    Student get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        return array[index];
    }
}