package ATM_정답;

// 한 회원마다 계좌 3까지 만들 수 있음 
public class Account {
	String clientId;
	String accNumber;
	int money;
	
	Account(String clientId, String accNumber, int money) {
		this.clientId = clientId;
		this.accNumber = accNumber;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return clientId+"\t"+accNumber + "\t  " + money;
	}
	
	String saveToData() {
		return "%s/%s/%d\n".formatted(clientId,accNumber,money);
	}
	
	
}
