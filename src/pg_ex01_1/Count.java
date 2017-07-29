package pg_ex01_1;

public class Count {

	public static void main(String[] args) {

		for (int count = 0; count < 100; count++){
			if(count % 3 == 0 && count % 4 == 0){
				System.out.println("◆");
			}else if(count % 3 == 0){
				System.out.println("△");
			}else if(count % 4 == 0){
				System.out.println("□");
			}else{
				System.out.println(count);
			}
		}

	}

}
