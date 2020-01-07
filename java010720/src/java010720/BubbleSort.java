package java010720;

public class BubbleSort {

	public static void main(String[] args) {
		int [] ar = {20, 30, 40, 50, 10};
		// 버블 정렬은 최대 n(데이터 개수)- 회전 동안
		// 자신의 바로 뒤에 있는 위치의 데이터와 비교해서 정렬
		// 오름차순이면 뒤의 데이터가 작을 때 swap
		// 내림차순이면 뒤의 데이터가 클 때 swap
		
		// 일반화 시켜주기 (이러면 데이터가 늘어나더라도 연산 문제없음)
		int len = ar.length;
		
		// 최대 n-1 회전
		for(int i=0; i<len-1; i=i+1) {
			// 1회전 동안의 데이터의 이동 여부를 판별하기 위한 변수
			boolean flag = false;	// flag 이름은 다른 걸로 바꿔도 무관
			// 자신의 인접한 데이터와 비교하기 위한 제어문
			for(int j=0; j<len-i-1; j=j+1) {
				// 뒤의 데이터가 더 작으면 swap
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					// 데이터 이동 여부 표시
					flag = true;
				}
			}
			
			// 데이터의 이동이 없으면 정렬 종료
			if(flag == false) {
				break;
			}
		}
		
		// 데이터 출력
		for(int temp : ar) {
			System.out.print(temp + "\t");
		}
	}

}
