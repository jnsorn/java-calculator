# java-calculator
문자열 계산기 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 1단계 - 학습 테스트

### 1. String 클래스에 대한 학습 테스트

#### 요구사항 1

- "1,2"을 `,`로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- "1"을 `,`로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.

#### 요구사항 2

- "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 `()`을 제거하고 "1,2"를 반환하도록 구현한다.

#### 요구사항 3

- "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
- String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
- JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

### 2. Set Collection에 대한 학습 테스트

#### 요구사항 1

- Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현한다.

#### 요구사항 2

- Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현하려한다.
- 구현하고 보니 다음과 같이 중복 코드가 계속해서 발생한다.
- JUnit의 ParameterizedTest를 활용해 중복 코드를 제거해 본다.

#### 요구사항 3

- 요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.

## 2단계 - 단위 테스트

다음 요구사항을 junit을 활용해 단위 테스트 코드를 추가해 구현한다.

#### 요구사항

- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

#### 기능구현

1. 사용자 문자열 입력
2. 입력값에 대한 계산기 기능 구현
   1. 예외처리 기능
      1. 시작과 끝은 숫자인지 판단
      2. 하나 이상의 부호가 있는지 판단
      3. 숫자와 사칙연산 부호만으로 이루어져있는지 판단
   2. 계산 기능 구현
      1. 입력 순서에 따라 계산기능
         1. 부호가 나오기 전까지 숫자를 문자열로 저장(StringBuilder/List<String>)
         2. 첫번째 숫자이면 바로 sum변수에 저장(그 이후 숫자는 num변수에 저장하여 해당 함수에 sum과 num를 전달한다.)
3. 결과값 출력
   1. sum최종 결과 값 출력

#### Refactoring Log
1. Renaming of variables and methods for readability
   - Don't name it, including its data structure (ex. numberList → numbers)
   - Name of mehtod should reveal what it is doing.
2. Declare constant using `static`
   - Constants should be allocated only once to memory using static
3. Remove the if bifurcation using interface, enum...
4. Don't use toString() in logic
   - What toString() does is make it easier for people to read objects. 
   
#### To Do
1. Use appropriate exception.
2. Rewrite test code.
3. See how others have implemented it.
