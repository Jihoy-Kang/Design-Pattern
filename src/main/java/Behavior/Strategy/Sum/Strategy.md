# Strategy

알고리즘군을 정의하고 각각을 캡슐화하여 상호 교환할 수 있도록 만든 패턴입니다. 이 패턴은 알고리즘이 서로 다른 상황에서 다른 동작을 해야할 때 유용하게 사용됩니다.

전략 패턴은 클라이언트에서 알고리즘을 선택하는 로직을 분리하여 클라이언트와 알고리즘 간의 결합도를 낮춥니다. 이 패턴은 새로운 알고리즘을 추가하거나 수정하더라도 기존 코드를 변경하지 않아도 되기 때문에 유지보수가 쉬워지며, 확장성 또한 용이해집니다.

전략 패턴의 핵심은 인터페이스입니다. 알고리즘을 정의하는 인터페이스를 만들고, 이를 구현하는 여러 개의 클래스를 만들어 각각의 알고리즘을 구현합니다. 클라이언트에서는 이 인터페이스를 통해 알고리즘을 선택하고 실행할 수 있습니다.

예를 들어, 게임에서 캐릭터의 이동 방식을 다르게 구현해야 할 때 전략 패턴을 사용할 수 있습니다. 캐릭터의 이동 알고리즘을 정의하는 인터페이스를 만들고, 이를 구현하는 클래스로는 걷기, 뛰기, 날기 등을 만듭니다. 클라이언트에서는 이러한 클래스들 중에서 적절한 것을 선택하여 캐릭터의 이동을 구현할 수 있습니다.

전략 패턴은 객체 지향 설계에서 중요한 개념 중 하나이며, 유연하고 확장성 있는 애플리케이션을 만들기 위해 반드시 알아둬야 할 패턴 중 하나입니다.