package _08제네릭클래스;

import java.util.Arrays;

//1 추가 add(value)
//2 삭제 remove(idx)
//3 삽입 add(idx, value)
//4 수정 set(idx, value)
//5 갯수 size
//6 값읽기 get(idx)
//7 전차삭제 clear()
class MyVector<T> {
	Object[] arr;
	int size, capacity;

	MyVector() {
		capacity = 10;
		arr = new Object[capacity];
	}

	void add(T value) {
		size++;
		if (size > capacity) {
			capacity += 10;
			Object[] copy = arr;
			arr = new Object[capacity];
			for (int i = 0; i < copy.length; i += 1) {
				arr[i] = copy[i];
			}
		}
		arr[size - 1] = value;
	}

	void remove(int idx) {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = idx; i < arr.length - 1; i += 1) {
			arr[i] = arr[i + 1];
			arr[i + 1] = 0;
		}
		size -= 1;
	}

	void add(int idx, T value) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		size++;
		if (size > capacity) {
			capacity += 10;
		}
		Object[] copy = arr;
		arr = new Object[capacity];
		for (int i = size; i >= idx; i -= 1) {
			arr[i] = copy[i - 1];
		}
		for (int i = 0; i < idx; i += 1) {
			arr[i] = copy[i];
		}
		arr[idx] = value;
	}

	void set(int idx, T value) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		arr[idx] = value;
	}

	@SuppressWarnings("unchecked")
	T get(int idx) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		return (T) arr[idx];
	}

	void clear() {
		size = 0;
		arr = new Object[capacity];
	}
}

class Student {
	public int num;
}

public class _02벡터클래스구현 {
	public static void main(String[] args) {
		MyVector<Student> v1 = new MyVector<Student>();
		for (int i = 0; i < 11; i += 1) {
			Student s = new Student();
			s.num = i;
			v1.add(s);
		}
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println("add " + Arrays.toString(v1.arr));
		System.out.println("size " + v1.size);
		v1.remove(10);
		System.out.println("remove " + Arrays.toString(v1.arr));
		v1.add(9, s2);
		v1.add(9, s3);
		System.out.println("add " + Arrays.toString(v1.arr));
		v1.set(9, s3);
		System.out.println("set " + Arrays.toString(v1.arr));
		System.out.println("get " + v1.get(9));
		v1.clear();
		System.out.println("set " + Arrays.toString(v1.arr));
	}
}
