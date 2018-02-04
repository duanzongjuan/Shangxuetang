import java.util.HashMap;
import java.util.Map;

public class TestArgsWords {
	private static final Integer ONE = new Integer(1);
	public static void main(String[] args) {
		Map m1 = new HashMap();
		for(int i=0;i<args.length;i++) {
			Integer frq = (Integer)m1.get(args[i]);
			m1.put(args[i], (frq == null ? ONE:new Integer(frq.intValue()+1)));
		}
		System.out.println(m1.size()+"distinct words detected:");
		System.out.println(m1);
	}
}
