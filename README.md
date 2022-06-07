# TDD-Practice
TDD 수련을 위한 NHN Academy 학생들의 저장소

## TDD 프로젝트 진행 방향성
1. 켄트 백의 TDD 책을 참조하여 해당 프로젝트를 진행한다.
2. 프로젝트가 완료되면 각자의 브랜치에 머지한다.
3. 프로젝트가 끝나고 난 뒤에는 회고록을 짧게 한줄이라도 남기는 습관을 기르자. 3번 항목은 선택이다.

### 해당 프로젝트는 TDD 책의 xUnit이전까지만 다루는 프로젝트이다.

## TODO LIST

1. [ ] $5 + 10CHF = $10 (환율이 2:1일 경우)
2. [ ] ***$5 + $5 = $10***
3. [X] ~~$5 * 2 = $10~~
4. [X] ~~amount를 private로 만들기.~~
5. [X] ~~Dollar 부작용?~~
6. [ ] Money 반올림.
7. [X] ~~equals()~~
8. [ ] hashCode()
9. [ ] Equal null
10. [ ] Equal object
11. [X] ~~5CHF * 2 = 10CHF~~
12. [X] ~~Dollar/Franc 중복~~
13. [X] ~~공용 Equals~~
14. [X] 공용 times
15. [X] ~~통화?~~
16. [X] ~~Franc과 Dollar 비교하기~~
17. testFranceMultiplication 제거

## 후기
### 1~2장 켄트 백은 테스트의 초록색 막대를 보기위해 둘 중 하나의 방법을 선택하여 사용한다.
1. 가짜로 구현하여 통과
2. 실제로 올바른 구현을 통한 테스트 통과

둘 중 어느 것이 맞다라고 생각이 들지 않는다.
각자 상황에 맞추어 테스트를 통과하는 법도 TDD의 일련의 과정이다.

### 3~4장 모두를 위한 평등
1. IDE에서 만들어주는 equals가 아닌 직접적인 equality 테스트를 진행했다.
2. 연산자를 통한 테스트를 처음 진행해보았다.
3. 새로운 테스트를 작성하고 해당 테스트가 통과하면, 이전 테스트도 함께 다시 재점검 해야함을 깨달았다.
4. 새로운 테스트를 작성한다는 것은 사실 내부 구현이 바뀐다는 의미인데, 내부 구현이 바뀐다는 것은 다른 테스트에 영향을 끼칠 우려가 있기때문이라고 생각한다.
   (사실 내부 구현이 바뀌었다해서 정말로 다른 테스트가 실패하면 되돌아가야한다 생각한다.)
5. equality 테스트를 위한 Dollar클래스 내부에 메서드 매계변수로 같은 형을 가진 인스턴스가오면, 같은 클래스 시그니처를 가지므로, 내부 필드를 직접 접근 할 수 있는 것을 처음 알게되었다.
6. 테스트도 리팩터링이 가능하다.
7. 테스트도 가독성에 대해서는 어느정도 요구한다.
8. 테스트를 통해서 필드의 접근성을 통제할 수 있다.

### 5~7장 
1. 1번 TODO를 위해서 자그마한 테스트부터 시작하였다.
2. 테스트의 초록막대를 위해서라면 중복코드도 작성할 수도 있다.
3. 테스트를 기반으로 중복된 코드를 발견하고 수정하였다.
4. 통화가 다른 두가지의 화폐를 만들어 다르다는 결과의 테스트를 만들었다.
5. currency와 같은 통화 필드가 아닌 타입을 이용한 비교를 하였다.
6. 구현이나 설계에 앞서나가지 말자


### 8~10장
1. times를 부모 클래스에게 선언하여 중복을 점진적으로 제거하였다.
2. 부모 클레스에게 자식들의 생성을 맡겼다. (팩토리 메서드를 이용)
3. 통화 적용 후 times에있는 생성자를 제거하고 Money의 팩토리 메서드를 이용했다.
4. Franc에 적용했던 것을 한번에 Dollar에 적용하였다.
5. Money와 France의 amount, currency를 부모측에 생성자로 맡겼다.
6. 테스트는 점진적으로 진행해야함을 다시한번 느끼고, 구현에 서두르지 말자.
7. times를 일치 시키기위해서 다시 기존 자식 생성자를 사용하였다.
8. toString()과 같은 메서드는 부수효과가 적으므로 테스트를 하지않았다.

### 11장 ~ 13장
1. 하위 클래스들의 중복을 드러내고 삭제함. 
2. 이에 따라서 테스트 또한 하위 클래스를 삭제시 테스트 갱신, 중복 체크가 필요함을 느꼈다.
3. 새로운 테스트의 분위기 전환시 기존 테스트에서 좀 더 세분화가 가능하다.
4. 테스트를 진행하면서 금액의 연산을 행하는 책임, 환전을하는 책임을 다른 객체에게 각각 분배하였다.
5. 테스트를 하면서 떠오르는 메타포를 일단은 적용하라. (다만 그 이유가 합당하여야한다.)
6. 
