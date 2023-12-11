package 컬렉션벡터;

import java.util.Arrays;

//1 추가 add(value)
//2 삭제 remove(idx)
//3 삽입 add(idx, value)
//4 수정 set(idx, value)
//5 갯수 size
//6 값읽기 get(idx)
//7 전차삭제 clear()
class MyVector {
	int[] arr;
	int size, capacity;

	MyVector() {
		capacity = 10;
		arr = new int[capacity];
	}

	void add(int value) {
		size++;
		if (size > capacity) {
			capacity += 10;
			int[] copy = arr;
			arr = new int[capacity];
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

	void add(int idx, int value) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		size++;
		if (size > capacity) {
			capacity += 10;
		}
		int[] copy = arr;
		arr = new int[capacity];
		for (int i = size; i >= idx; i -= 1) {
			arr[i] = copy[i - 1];
		}
		for (int i = 0; i < idx; i += 1) {
			arr[i] = copy[i];
		}
		arr[idx] = value;
	}

	void set(int idx, int value) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		arr[idx] = value;
	}

	void get(int idx) {
		if (size == 0)
			throw new ArrayIndexOutOfBoundsException();
		if (idx < 0 || idx > size - 1)
			throw new ArrayIndexOutOfBoundsException();
		System.out.println(arr[idx]);
	}

	void clear() {
		size = 0;
		arr = new int[capacity];
	}

	@Override
	public String toString() {
		return "";
	}
}

public class _03벡터클래스구현 {
	public static void main(String[] args) {
		MyVector v1 = new MyVector();
		for (int i = 0; i < 11; i += 1) {
			v1.add((i + 1) * 10);
		}
		System.out.println("add " + Arrays.toString(v1.arr));
		System.out.println("size " + v1.size);
		v1.remove(10);
		System.out.println("remove " + Arrays.toString(v1.arr));
		v1.add(9, 123);
		v1.add(9, 1212);
		System.out.println("add " + Arrays.toString(v1.arr));
		v1.set(9, 1313);
		System.out.println("set " + Arrays.toString(v1.arr));
		v1.get(9);
		v1.clear();
		System.out.println("set " + Arrays.toString(v1.arr));
	}
}
