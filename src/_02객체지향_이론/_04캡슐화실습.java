package _02객체지향_이론;

import java.util.Arrays;
import java.util.Vector;

class Member {
	private int custno; // 회원번호
	private String custname; // 회원성명
	private String phone; // 회원전화
	private String address; // 통신사
	private String joindate; // 가입일자
	private String grade; // 고객등급
	private String city; // 거주도시

	public Member(int custno, String custname, String phone, String address, String joindate, String grade,
			String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}

	/**
	 * @return the custno
	 */
	public int getCustno() {
		return custno;
	}

	/**
	 * @param custno the custno to set
	 */
	public void setCustno(int custno) {
		this.custno = custno;
	}

	/**
	 * @return the custname
	 */
	public String getCustname() {
		return custname;
	}

	/**
	 * @param custname the custname to set
	 */
	public void setCustname(String custname) {
		this.custname = custname;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the joindate
	 */
	public String getJoindate() {
		return joindate;
	}

	/**
	 * @param joindate the joindate to set
	 */
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}

class Money {
	private int custno; // 회원번호
	private int saleno; // 판매번호
	private int pcost; // 단가
	private int amount; // 수량
	private int price; // 가격(매출)
	private String pcode; // 상품코드
	private String sdate; // 판매일자

	public Money() {
	}

	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}

	/**
	 * @return the custno
	 */
	public int getCustno() {
		return custno;
	}

	/**
	 * @param custno the custno to set
	 */
	public void setCustno(int custno) {
		this.custno = custno;
	}

	/**
	 * @return the saleno
	 */
	public int getSaleno() {
		return saleno;
	}

	/**
	 * @param saleno the saleno to set
	 */
	public void setSaleno(int saleno) {
		this.saleno = saleno;
	}

	/**
	 * @return the pcost
	 */
	public int getPcost() {
		return pcost;
	}

	/**
	 * @param pcost the pcost to set
	 */
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the pcode
	 */
	public String getPcode() {
		return pcode;
	}

	/**
	 * @param pcode the pcode to set
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	/**
	 * @return the sdate
	 */
	public String getSdate() {
		return sdate;
	}

	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
}

class Manager {
	private Vector<Member> memberList = new Vector<Member>();
	private Vector<Money> moneyList = new Vector<Money>();
	private Vector<Member> result;
	private int[] moneyArr;

	public void init() {
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));
		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}

	private void sort() { // 임시 리스트를 정렬합니다.
		Vector<Member> tempMemberList = new Vector<Member>();
		for (int i = 0; i < memberList.size(); i += 1) { // 배열을 복사합니다.
			tempMemberList.add(memberList.get(i));
		}
		int[] tempPriceArr = new int[tempMemberList.size()]; // 매출을 기록할 배열입니다.
		for (int i = 0; i < tempMemberList.size(); i += 1) { // 멤버번호를 대조해서 같은 번호일 때 earnings에 더합니다.
			for (int j = 0; j < moneyList.size(); j += 1) {
				if (tempMemberList.get(i).getCustno() == moneyList.get(j).getCustno())
					tempPriceArr[i] += moneyList.get(j).getPrice();
			}
		}
		System.out.println(Arrays.toString(tempPriceArr));
		for (int i = 0; i < tempPriceArr.length; i += 1) { // earnings를 정렬할 때 temp도 함께 정렬합니다.
			int max = 0, idx = -1;
			for (int j = i; j < tempPriceArr.length; j += 1) {
				if (tempPriceArr[j] >= max) {
					max = tempPriceArr[j];
					idx = j;
				}
			}
			int temp = tempPriceArr[i];
			tempPriceArr[i] = tempPriceArr[idx];
			tempPriceArr[idx] = temp;
			Member tempMember = tempMemberList.get(i);
			tempMemberList.set(i, tempMemberList.get(idx));
			tempMemberList.set(idx, tempMember);
		}
		this.moneyArr = tempPriceArr;
		this.result = tempMemberList;
	}

	private void printResult() {
		for (int i = 0; i < this.result.size(); i += 1) {
			if (this.moneyArr[i] > 0) {
				System.out.printf("%d    %s        %d\n", result.get(i).getCustno(), result.get(i).getCustname(),
						moneyArr[i]);
				System.out.println("--------------------------------------");
			}
		}
	}

	void run() {
		sort();
		printResult();
	}
}

public class _04캡슐화실습 {
	public static void main(String[] args) {
		// 문제
//			아래와 같이 매출(price)의 합계를 내림차순으로 정렬해 출력하시오.

//			100001    김행복        8000
//			----------------------------------------------
//			100004    최사랑        4900
//			----------------------------------------------
//			100003    장믿음        3000
//			----------------------------------------------
//			100002    이축복        2500
//			----------------------------------------------
		Manager mg = new Manager();
		mg.init();
		mg.run();
	}
}
