# TDD-Practice
TDD 수련을 위한 NHN Academy 학생들의 저장소

## TDD 프로젝트 진행 방향성
1. 켄트 백의 TDD 책을 참조하여 해당 프로젝트를 진행한다.
2. 프로젝트가 완료되면 각자의 브랜치에 머지한다.
3. 프로젝트가 끝나고 난 뒤에는 회고록을 짧게 한줄이라도 남기는 습관을 기르자. 3번 항목은 선택이다.

### 해당 프로젝트는 TDD 책의 xUnit이전까지만 다루는 프로젝트이다.

### TODO-LIST
* [ ] $5 + 10 CHF = $10 (환율이 2:1인 경우)
* [X] $5 * 2 = $10
* [X] amount를 private으로 만들기
* [X] Dollar 부작용?
* [ ] Money 반올림?
* [X] equals()
* [ ] hashcode()
* [ ] Equal null
* [ ] Equal Object
* [X] 5CHF X 2 = 10CHF
* [ ] Dollar/Franc 중복
* [X] 공용 equals
* [ ] 공용 times
* [X] Franc과 Dollar 비교하기
* [ ] 통화?

## REVIEW
* chapter1. 다중통화를 지원하는 Money 객체
  * `$5 * 2 = $10`
  * 진짜 작은 부분부터 테스트를 한다는 점이 신기하고 적응이 안됐다.
* chapter2. 타락한 객체
  * `Dollar 부작용?`
  * 컴파일 에러를 해결하기 위해 `return null;` 을 한다던지, 빠른 성공을 위해 바로 성공하는 값을 `return` 한다는 점이 아직은 크게 와닿지 않지만 빠르게 적응해야겠다.
* chapter3. 모두를 위한 평등
  * `equals()`
  * 삼각 측량이라는 방법에 빗대어 두 가지 테스트 케이스를 통과하도록 하여 코드의 신뢰도를 높히는 방법을 배웠다. 안정성이 높아진다는 측면에서 마음이 편해졌다.
* chapter4. 프라이버시
  * `amount를 private으로 만들기`
  * `private`으로 만드는 것 또한 테스트로 바꾸는 것이 신기했다. 나라면 처음부터 private 필드를 만들었을 것이다.
  * private은 인스턴스가 아닌 클래스 레벨에서 적용됨. `dollar.amount == this.amount`가 가능한 이유
  * 테스트도 리팩터링을 한다.
  * 테스트를 진행하면서 다른 테스트가 망가지지 않도록 잘 관리한다.
* chapter5. 솔직히 말하자면
  * `5CHF X 2 = 10CHF` 
  * 과거에 했던 중복된 내용을 가지고 테스트를 새로 진행하면서 (테스트 작성 - 컴파일 되게하기 - 실패하는지 확인 - 실행하게 만듦 - 중복제거)라는 순서를 다시 한 번 상기시킬 수 있었다.
* chapter6. 돌아온 '모두를 위한 평등'
  * `공용 equals`
  * 중복을 지우는 과정을 통해 테스트의 중요성을 알게 되었다. 테스트 코드를 계속 실행하며 중복을 제거하니 안심하고 제거할 수 있었다.
* chapter7. 사과와 오렌지
  * `Franc과 Dollar 비교하기`
  * 오버 엔지니어링 하지 않음에 대해 학습했다.
    > 더 많은 동기가 있기 전에는 더 많은 설계를 도입하지 않기로 했다.
  * equals의 확장 또한 올바른 테스트 위에서 하다보니 안전하게 코드의 기능을 확장할 수 있었다.
