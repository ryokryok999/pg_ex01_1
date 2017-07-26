package pg_ex01_1;

public class Count {

	public static void main(String[] args) {
		int count = 1;

		for (; count <= 100; ){
			if(count % 3 == 0 && count % 4 == 0){
				System.out.println("◆");
			}else if(count % 3 == 0){
				System.out.println("△");
			}else if(count % 4 == 0){
				System.out.println("□");
			}else{
				System.out.println(count);
			}
			count++;
		}

	}

}
