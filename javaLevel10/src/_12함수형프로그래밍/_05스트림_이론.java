package _12함수형프로그래밍;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _05스트림_이론 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("김", "이", "박", "최", "이");
		System.out.println("=====1=====");
		for (int i = 0; i < names.size(); i += 1) {
			System.out.println(names.get(i));
		}
		System.out.println("=====2=====");
		System.out.println("=====3=====");
		System.out.println("=====4=====");
		Stream<String> nameStream = names.stream(); // 리스트 names에 스트림 객체 생성
		nameStream.forEach(System.out::println);
//		nameStream.count(); 최종연산은 한 번만 사용할 수 있다.
		System.out.println("=====5=====");
		names.stream().distinct().forEach(System.out::println);
		System.out.println("=====6=====");
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6));
		Stream<Integer> streamList = list.stream();
		streamList.sorted().filter(num -> num % 2 != 0).forEach(System.out::print);
		System.out.println(list);
	}
}
