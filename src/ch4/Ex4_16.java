
public class Ex4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i =0;
		
		while(true) {// ���� �ݺ��� for(;true;) for������ true ��������  
			if(sum>100)
				break;
			System.out.println(i);
			++i;
			System.out.println(sum);
			sum += i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);

	}

}
