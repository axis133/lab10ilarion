import java.util.*;

public class C {

	public static void main(String[] args) {
		Map map = new HashMap();
		Scanner in = new Scanner(System.in);
		System.out.print("Введите n ");
		int n = in.nextInt();
		System.out.print("Введите m ");
		int m = in.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n;i++) {
			for (int j = 0 ; j < m;j++) {
				arr[i][j]=(int) Math.floor(Math.random()*10+1);
				System.out.print(arr[i][j]+" ");
				if (i == 0) {
					map.put(arr[i][j],0);
				} else {
					if (map.containsKey(arr[i][j])){
						int k = (int) map.get(arr[i][j]);
						map.put(arr[i][j],k + 1);
					}
				}
			}
			System.out.print("\n");
		}
		Collection<Integer> answ = map.values();
		Collection<Integer> answ2 = map.keySet();
		int max = 0;
		for (Integer elem : answ) {
		if (elem > max){
			max = elem;
		}
		
		}
		for (Integer elem : answ2) {
			if ((int)map.get(elem) == max) {
				System.out.println(elem+"="+max);
			}
		}
		System.out.print(map);
		
		
	}

}
