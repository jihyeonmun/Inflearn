# JavaScript Snippet

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
