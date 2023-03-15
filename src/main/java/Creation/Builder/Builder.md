# Builder
빌더 디자인 패턴은 복잡한 객체를 생성하는 과정을 단순화하는 디자인 패턴 중 하나입니다. 객체를 생성하고 초기화하기 위한 복잡한 과정이 있을 때, 빌더 패턴은 객체 생성 과정을 단계별로 분리하고, 객체를 생성하고 초기화하는 과정을 간소화합니다.

빌더 패턴은 보통 다음과 같은 구성 요소로 이루어집니다:

- 빌더 인터페이스 : 객체를 생성하고 초기화하는데 필요한 메서드들을 정의합니다.   
- 구체적인 빌더 클래스 : 빌더 인터페이스를 구현하고, 객체를 생성하고 초기화하는데 필요한 실제 로직을 구현합니다.   
- 디렉터 클래스 : 객체 생성 과정을 관리하고, 빌더 클래스의 메서드를 호출하여 객체를 생성하고 초기화합니다.   
- 생성할 객체 클래스 : 빌더 패턴을 적용할 대상 객체입니다.   

 예를 들어, 자동차 객체를 생성하는 경우, 자동차 객체의 속성 중에서도 여러 가지 옵션이 있을 수 있습니다. 이러한 옵션들을 모두 생성자로 전달한다면 복잡하고 유지보수하기 어려운 코드가 될 수 있습니다. 이때 빌더 패턴을 사용하면 객체 생성 과정을 단순화할 수 있습니다. 빌더 패턴을 적용하면 자동차 객체를 생성할 때 다음과 같은 순서로 진행됩니다:   

- 자동차 빌더 객체 생성
- 필수 속성 값 설정 (ex: 모델명, 연식, 가격 등)   
- 옵션 속성 값 설정 (ex: 컬러, 엔진 종류, 네비게이션 등)   
- 자동차 객체 생성 및 반환   

이렇게 빌더 패턴을 적용하면, 자동차 객체를 생성하는 코드가 간단하고 가독성이 좋아집니다. 또한, 옵션 속성 값이 변경되더라도 필수 속성 값은 그대로 유지됩니다.  


### 프로그램에 디렉터 클래스를 포함하는 것은 필수사항은 아닙니다. 당신은 언제든지 클라이언트 코드에서 생성 단계들을 직접 특정 순서로 호출할 수 있습니다. 그러나 디렉터 클래스는 다양한 생성 루틴들을 배치하여 프로그램 전체에서 재사용할 수 있는 좋은 장소가 될 수 있습니다.