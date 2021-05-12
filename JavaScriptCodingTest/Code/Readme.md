# JavaScript Snippet

[어제 오늘 내일](https://hianna.tistory.com/category/IT/Javascript)

> 처음엔 틈틈히 공부하자는 마인드였는데, 이분 것도 틈틈히 보면서 병행해야겠다!

| 중분류  | 소분류    | 함수                                                       | 설명                                                                                                      |
| ------- | --------- | ---------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| 정렬    | 문자 정렬 | array.sort();                                              | 문자를 정렬하는 것임.                                                                                     |
| 정렬    | 숫자 정렬 | array.sort((a,b)=> a-b);                                   | 숫자를 정렬                                                                                               |
| 정렬    | map       | map((array)=>array.toString())                             | array 배열의 숫자를 모두 스트링으로 변환 시켜줌.                                                          |
| 배열    | 활용      | array.join("")                                             | 배열의 모든 값을 붙여준다!                                                                                |
| 배열    | 부분      | array.slice(a,b)                                           | a~b-1까지임                                                                                               |
| 배열    | 삽입      | array.splice(start[,deletecount[, item1[,item2[,...]]]])   | 예시) array.splice(1,1,'b','c') -> index 1부터 1개 원소 삭제, 이후 b,c 추가!                              |
| 배열    | 삽입      | arr.unshift([...elementN])                                 | 배열의 맨 앞에 파라미터로 전달받은 element들을 추가함.                                                    |
| 배열    | 삽입      | arr.shift()                                                | 배열의 가장 첫 element를 삭제하고, 삭제한 element를 리턴함.                                               |
| 배열    | 병합      | array.concat([value1[,value2[,...]]]])                     | 파라미터로 받은 배열이나 값들을 기존의 배열에 합쳐서, 새로운 배열을 만들어서 리턴함.                      |
| 배열    | 병합      | const newArr = [...arr1, ...arr2, ...arr3]                 | ...은 전개연산자임, 각각 리턴된 요소를 합쳐서 하나의 배열로 합하게 됨.                                    |
| 배열    | 병합      | arr.push(...arr2);                                         | 배열에 spread 한 값을 추가할 수 있음. ...없으면 배열을 원소로 처리하여 안됨!                              |
| 배열    | 채우기    | arr.fill(value[,start[,end]])                              | start index부터 end index전까지 value 값으로 채워주는 함수임.                                             |
| 배열    | 채우기    | const arr = new Array(4).fill('A')                         | A로 전체 채워서 초기화하고자 할때                                                                         |
| 배열    | 검색      | arr.indexOf('a',1)                                         | 1번 인덱스부터 a를 찾고자 할 떄                                                                           |
| 베열    | 검색      | arr.lastIndexOf('a',2);                                    | 2번 인덱스부터 앞으로 찾음., 주로 배열이 존재하는지 === 연산자를 사용하여 비교함                          |
| 배열    | 검색      | arr.findIndex(callback(element[,index[,array]])[,thisArg]) | 조건을 비교할 callback 함수이고, 테스트할 조건에 부합하면 true를 리턴 때문에, 더욱 다양한 조건 활용 가능! |
| 스택,큐 | push      | answer.push();                                             | 단순 삽입, 매우 유용함                                                                                    |

https://hianna.tistory.com/409

### 1. 배열 최대 최소 구하는 함수

```js
let arr = [5, 7, 1, 3, 2, 9, 11];
console.log(solution(arr));
console.log(Math.min(...arr));
console.log(Math.max(...arr));
console.log(Math.min.apply(null, arr));
```

> ...을 통해 배열을 전개해서 할 수 있다.!

### 1-1. 최소값 초기값 정할때

> 아래와 같이 매우 큰수로 잡는 것이 적절하다!

```js
let min = Number.MAX_SAFE_INTEGER;
```

### 1-2. 추가하거나 빼는 것은?

```js
answer.push(sum);
answer.push(min);
```

> stack을 사용한다!

### 2. 배열 누적합

```js
let sum = arr.reduce((a, b) => a + b, 0);
```

### 3. 원하는 부분 삭제

```js
arr.splice(j, 1); //당겨지는 거 주의!
```

### 4. 문자 바꾸기

```js
function solution(s) {
  let answer = s;
  answer = answer.replace(/A/g, "#");
  return answer;
}

let str = "BANANA";
console.log(solution(str));
```

### 5. 문자열 끊기

```js
function solution(s, t) {
  let answer = s.split(t).length;
  return answer - 1;
}

let str = "COMPUTERPROGRAMMING";
console.log(solution(str, "R"));
```

### 6. 문자 아스키 코드 변횐

```js
let num = x.charCodeAt();
```

> 대문자 65~90
> 소문자 97~122

#### 6-1. 대문자 소문자 변환한것 계산!

```js
if (x === x.toUpperCase()) answer++;
```

#### 7. substring 활용하기

```js
let mid = Math.floor(s.length / 2);
if (s.length % 2 === 1) answer = s.substring(mid, mid + 1);
//mid
else answer = s.substring(mid - 1, mid + 1); //mid-1~mid
```

#### 8. 중복된 문자 제거

```js
function solution(s) {
  let answer = "";
  //console.log(s.indexOf("K"));
  for (let i = 0; i < s.length; i++) {
    //console.log(s[i], i, s.indexOf(s[i]));
    if (s.indexOf(s[i]) === i) answer += s[i];
  }
  return answer;
}
console.log(solution("ksekkset"));
```

> indexOf()를 잘 활용해보자!!

#### 9. filter 활용하기

```js
function solution(s) {
  let answer;
  //console.log(s.indexOf("student"));
  answer = s.filter((v, i) => {
    //console.log(v, i);
    if (s.indexOf(v) === i) return v;
  });
  return answer;
}
let str = ["good", "time", "good", "time", "student"];
console.log(solution(str));
```

---

# 1,2차원 배열 탐색

#### 1로찬 배열 만들기

```js
let answer = Array.from({ length: n }, () => 1);
```

#### 거꾸로한 것과 실제 글자 같은지 판별

```js
s.split("").reverse().join("") != s;
```

#### 전역으로 변환시키기!

```js
s = s.toLowerCase().replace(/[^a-z]/g, "");
```

#### 소수 판별하기

```js
function isPrime(num) {
  if (num === 1) return false;
  for (let i = 2; i <= parseInt(Math.sqrt(num)); i++) {
    if (num % i === 0) return false;
  }
  return true;
}
```

#### 숫자 판별하기

```js
let answer = "";
for (let x of str) {
  if (!isNaN(x)) answer += x;
}
return parseInt(answer);
```

#### 스트링 숫자로 변환

```js
parseInt(str);
```

---

# Section4

### 자릿수 더하기

```js
let sum = x
  .toString()
  .split("")
  .reduce((a, b) => a + Number(b), 0);
```

#### 소수 함수

```js
function isPrime(num) {
  if (num === 1) return false;
  for (let i = 2; i <= parseInt(Math.sqrt(num)); i++) {
    if (num % i === 0) return false;
  }
  return true;
}
```

#### 정렬하기

```js
product.sort((a, b) => a[0] + a[1] - (b[0] + b[1]));

//내림차순 정렬
let a = Array.from(tmp).sort((a, b) => b - a); //tmp는 Set()
```

---

# 5. 효율성(투포인터 알고리즘, 슬라이딩 윈도우, 해쉬)

#### 두 배열 합치기

```js
while (p1 < n && p2 < m) {
  if (arr1[p1] <= arr2[p2]) answer.push(arr1[p1++]);
  else answer.push(arr2[p2++]);
}
while (p1 < n) answer.push(arr1[p1++]);
while (p2 < m) answer.push(arr2[p2++]);
```

#### 공통된 부분만 뽑기

```js
while (p1 < arr1.length && p2 < arr2.length) {
  if (arr1[p1] == arr2[p2]) {
    answer.push(arr1[p1++]);
    p2++;
  } else if (arr1[p1] < arr2[p2]) p1++;
  else p2++;
}
```

### 해시, 맵 만들어서 카운트 하기

```js
let sH = new Map();
for (let x of s) {
  if (sH.has(x)) sH.set(x, sH.get(x) + 1);
  else sH.set(x, 1);
} // 들어오는 키대로 숫자를 넣어준다!

let max = Number.MIN_SAFE_INTEGER;
for (let [key, val] of sH) {
  if (val > max) {
    max = val;
    answer = key;
  }
} // 각 키별 밸류의 최댓값 찾기
```

#### 아나그램

```js
function solution(str1, str2) {
  let answer = "YES";
  let sH = new Map();
  for (let x of str1) {
    if (sH.has(x)) sH.set(x, sH.get(x) + 1);
    else sH.set(x, 1);
  }
  for (let x of str2) {
    if (!sH.has(x) || sH.get(x) == 0) return "NO";
    sH.set(x, sH.get(x) - 1);
  }
  return answer;
}
```

---

# 스택과 큐

#### 전형적인 스택

```js
function solution(s) {
  let answer;
  let stack = [];
  for (let x of s) {
    if (!isNaN(x)) stack.push(Number(x));
    else {
      let rt = stack.pop();
      let lt = stack.pop();
      if (x === "+") stack.push(lt + rt);
      else if (x === "-") stack.push(lt - rt);
      else if (x === "*") stack.push(lt * rt);
      else if (x === "/") stack.push(lt / rt);
    }
  }
  answer = stack[0];
  return answer;
}

let str = "352+*9-";
```

#### 간단한 배열 만들기

```js
let queue = Array.from({ length: n }, (v, i) => i + 1);
```

### shift는 첫번째를 없애는 것이다!

```js
while (queue.length) {
  for (let i = 1; i < k; i++) queue.push(queue.shift());
  queue.shift();
  if (queue.length === 1) answer = queue.shift();
}
return answer;
```

#### 2차원 정렬

```js
arr.sort((a, b) => {
  if (a[0] === b[0]) return a[1] - b[1];
  else return a[0] - b[0];
});
```
