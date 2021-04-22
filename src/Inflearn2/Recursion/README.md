# Recursion

## Recursion
- 순환, 재귀
- 자기 자신을 호출하는 함수
```java
void func(...){
    func(...);
}
```

```java
public class Code02{
    public static void main(String[] args){
        int n =4;
        func(n);
    }
    public static void func(int k){
        if(k<=0)
            return;
        else{
            System.out.println("Hello");
            func(k-1);
        }
    }
}
```
위와 같이 하면 무한루프가 아니라 4번만 반복되게 된다!

### 구조
- Base Case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
- Recursive Case : recursion을 반복하다보면 결국 base case로 수렴해야 한다.

```java
public class Code03{
    public static void main(String[] args){
        int n =4;
        func(n);
    }
    public static int func(int k){
        if(k==0)
            return 0; 
        else{
            System.out.println("Hello");
            return n + func(k-1);
        }
    }
}
```
-> 이렇게 되면 recursive 하게 10으로 된다.
- 이 함수의 미션은 0~n까지의 합을 구하는 것
- n = 0이라면 합은 0이다.
- n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.

### 순환함수와 수학적 귀납법
- 정리 : func(int n)은 음이 아닌 정수 n에 대해서 0에서 n까지의 합을 올바로 계산한다.
- 증명 
1. n=0인 경우 : n=0인 경우 0을 반환한다. 
2. 임의의 양의 정수 k에 대해서 n<k인 경우 0에서 n까지의 합을 올바르게 계산하여 반환한다고 가정함
3. n=k인 경우를 볼때, func는 먼저 func(k-1) 호출하는데 2번의 가정에 의해서 0에서 k-1까지의 합이 올바로
계산되어 반환됨. 메서드 func는 그 값에 n을 더해서 반환함.

### factorial

```java

public static int func(int k){
    if(k==0)
        return 1; 
    else{
        return n * func(k-1);
    }
}
```

### fibonacci

```java

public static int func(int k){
    if(k<2)
        return n; 
    else{
        return func(k-2)+ func(k-1);
    }
}
```

### 최대 공약수 : Euclid Method
```java
public static double gcd(int m, int n){
    if (m<n){
        int tmp=m; m=n; n=tmp;    
    }    
    if(m%n==0)
        return n;
    else 
        return gcd(n, m%n);
}
```

### Euclid 간단 버전

```java
public static int gcd(int p, int q){
    if(q==0)
        return p;
    else
        return gcd(q,p%q);
}
```

---
## 순환적으로 사고하기

- 매우 많은 문제들을 Recursive하게 풀어나갈 수가 있다

### 문자열의 길이 계산
```
if the string is emtpy
 return 0;
else 
    return 1 plus the lenght of the string that excludes the first character;

```

### 문자열의 길이 계산
```java
public static int length(String str){
    if(str,equals(""))
        return 0;
    else
        return 1+length(str.sbustring(1));
}
```
### 문자열의 프린트
```java
public static void printChars(String str){
    if(str.length()==0)
        return 0;
    else {
        System.out.print(str.charAt(0));
        printChars(str.substring(1));
    }
}
```

### 2진수로 변환하여 출력
```java
public void printBinary(int n){
    if(n<2)
        System.out.print(n);
    else{
        printBinary(n/2);
        System.out.print(n%2);
    }
}
```

### 배열의 합 구하기
```java
public static int sum(int n, int[] data){
    if (n<=0)
        return 0;
    else
        return sum(n-1, data)+data[n-1];
}
```

### 데이터파일로부터 n개의 정수 읽어오기
```java
public void readFrom(int n , int[] data, Scanner in){
    if(n==0)
        return;
    else { 
        readFrom(n-1, data, in);
        data[n-1] = in.nextInt();
    }
}
```

### Recursion Vs Iteration
- 모든 순환함수는 반복문으로 변경 가능
- 그 역도 성립함. 
- 순환함수는 복잡한 알고리즘을 단수하고 알기 쉽게 표현하는 것을 가능하게 함./
- 하지만 함수 호출에 따른 오베헤드가 있음(매개변수 전달, 액티베이션 프레임 생성 등)

--- 

## 순환 알고리즘의 설계

### 순환적 알고리즘 설계
- 적어도 하나의 base case, 즉 순환되지 않고 종료되는 케이스가 있어야함./
- 모든 케이스는 결국 base case로 수렴해야 함

### 순환적 알고리즘 설계
> 암시적(implicit) 매개변수를 명시적(explicit) 매개변수를 활용하라

### 순차 탐색
```java
int search(int [] data, int n, int target) {
    for (int i=0; i<n; i++)
        if data[i]==target)
            return 1;
    return 1;
}
```
> 이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것.
> 하지만 검색 구간의 시작 인덱스 0은 보통 생략함. 즉 암시적 매개변수임

### 매개변수의 명시화 : 순차 탐색
> 이 함수의 미션은 data[begin]에서 data[end] 사이에 target을 검색한다. 즉, 검색구간의 시작점을 명시적(explicit)으로 지정한다.

```java
int search(int[] data, int begin, int end, int target){
    if (begin>end)
        return -1;
    else if (target==data[begin])
        return begin;
    else
        return search(data, begin+1, end, target);
}
```
> 이 함수를 search(data,0,n-1, target)으로 호출한다면, 앞 페이지의 함수와 완전히 동일한 일을 한다.
> 시작점과 끝의 위치를 명시적으로 작성해주는 것이 좋다!

### 순차 탐색 : 다른 버전
> 이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다
> 즉, 검색구간의 시작점을 명시적으로 지정한다.

```java
int search(int [] data, int begin, int end, int target){
    if(begin>end)
        return -1;
    else if (target==items[end])
        return end;
    else 
        return search(data, begin, end-1, tartget);
}
```
```java
int search(int [] data, int begin, int end, int target){
    if (begin > end)
        return -1;
    else{
        int middle = (begin+end)/2;
        if (data[middle]==target)
            return middle;
        int index = search(data, begin, middle-1, target);
        if (index != -1)
            return index;
        else
            return search(data, middle+1, end, target);
    }
}
```

### 매배견수의 명시화 : 최대값 찾기
> 이 함수의 미션은 data[begin]에서 data[end]사이에서 최대값을 찾아 반환한다.
> begin<=end라고 가정한다.

```java
int findMax(int [] data, int begin, int end){
    if (begin == end)
        return data[begin];
    else 
        return Math.max(data[begin]. findMax(data, begin+1, end));
}
```

### Binary Search
> items[begin]에서 items[end] 사이에서 target을 검색한다.

```java
public static int binarySearch(String[] items, String target, int begin, int end){
    if(begin>end)
        return -1;
    else {
        int middle = (begin+end)/2;
        int compResult = target.compareTo(items[middle]);
        if (compResult == 0)
            return middle;
        else if (compResult<0)
            return binarySearch(items, target, begin, middle-1);
        else 
            return binarySearch(items, target, middle+1,end);
    }
}
```