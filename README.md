# SWExpertAcademy_D3_Java_8658

## SW Expert Academy D3 8658. Summation

### 1. 문제설명

출처: https://swexpertacademy.com/main/code/problem/problemList.do

input으로 자연수들이 주어진다. 각 자연수들의 자릿수 합을 구하고 그중 최대값과 최소값을 순서대로 출력하는 문제.

[입력]
> 첫 번째 줄에 테스트 케이스의 수 `T`가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 자연수 `10`개가 공백으로 구분되어 주어진다.
> 모든 자연수는 `1`이상 `1,000,000`이하이다.

[출력]
> 각 테스트 케이스마다 `#x`(`x`는 테스트케이스 번호를 의미하며 `1`부터 시작한다)를 출력하고,
> 각 테스트 케이스마다 주어진 `10`개의 숫자들 각각을 위와 같이 변환했을 때에 구해지는 최대값과 최소값을 공백으로 구분하여 출력하라.

### 2. 풀이

문제그대로 실행하였다. 매 자연수마다 min과 max를 찾아주었고 그대로 출력하여 해결하였다. 
```java
StringTokenizer st = new StringTokenizer(sc.nextLine());
int max = 0;
int min = 1000000;
while (st.hasMoreTokens()) {
  String tok = st.nextToken();
  int num = 0;
  for (int i = 0; i < tok.length(); i++) {
    num += tok.charAt(i) - '0';
  }
  if (num > max) {
    max = num;
  }
  if (num < min) {
    min = num;
  }
}

System.out.println("#"+test_case+" "+max+" "+min);
```
