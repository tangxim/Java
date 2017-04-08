
/**
 * @author tangxim
 */
public class LongToBinary {

	public static void main(String[] args) {
		long x=9223372036854775807L;
		int count = 0;
		int[] s = new int[64];
		while(x != 0){
			if((x & 0x1) == 1){
				s[64 - count - 1] = 1;
			}else{
				s[64 - count - 1] = 0;
			}
			count = count + 1;
			x = x >> 1;
		}
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i]);
		}
		System.out.println();
		System.out.print("@author tangxim");
	}
}
