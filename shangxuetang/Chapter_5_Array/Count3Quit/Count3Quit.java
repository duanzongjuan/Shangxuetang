public class Count3Quit {
	public static void main(String[] args) {
		KidCircle kc = new KidCircle(500);
		int countNum=0;
		Kid k = kc.first;
		while(kc.count > 1) {
			if(countNum == 3) {
				countNum = 0;
				kc.deleteKid(k);
			}
			k = k.right;
		}

		System.out.println(kc.first.id);
	}
}

class Kid {
	int id;
	Kid left;
	Kid right;
}

class KidCircle {
	int count = 0;
	Kid first;
	Kid last;

	KidCircle(int n) {
		for(int i=0;i<n;i++) {
			addKid();
		}
	}

	void addKid() {
		Kid k = new Kid();
		k.id = count;
		if(count <= 0) {
			first = k;
			last = k;
			k.left = k;
			k.right = k;
		} else {
			last.right = k;
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;
		}
		count++;
	}

	void deleteKid(Kid k) {
		if(count <= 0) {
			return;
		} else if(count == 1) {
			first = last = null;
		} else {
			k.left.right = k.right;
			k.right.left = k.left;

			if(k == first) {
				first = k.right;
			} else if (k == last) {
				last = k.left;
			}
		}
		count--;
	}
}