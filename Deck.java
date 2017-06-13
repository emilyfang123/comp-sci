
public class Deck {
	int size = 52;
	int current = 0;
	private Card [] a;
	public Deck() {
		// TODO Auto-generated constructor stub
		a = new Card[52];

		for(int i = 1; i <= 4 ; i++) {
			for(int k = 1; k <= 13; k++) {
				a[current] = new Card(k,i);
				current ++;
			}
		}
	}
	public void shuffle() {
		for(int i = 0;i < a.length; i++){
			int l = (int) (Math.random()*52);
			Card temp = a[i];
			a[i] = a[l];
			a[l] = temp;
		}
		
	}
	public Card dealOneCard() {
		if(size >= 1){
			int random = (int)(Math.random()*size);
			Card temp = a[random];
			a[random] = a[size-1];
			a[size-1] = a[random];
			size--;
			return temp;
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		d.shuffle();
		for(int i = 0; i < 53; i++) {
			System.out.println(d.dealOneCard());
		}
	}

}
