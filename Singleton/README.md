## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## singleton을 사용하는 이유

- setting 처럼 한번 설정하면 그 값을 계속 유지하면서 다른곳 에도 사용 할 수 있게 하는 방식이다.
- 사용하는 곳
    - interface
    - lazy loading
        - https://scarlett-dev.gitbook.io/all/it/lazy-loading


- 사용법
    - 멀티 쓰레드 환경에서의 싱글톤
        - Synchronized를 통해 관리하면 되며 다양한 변화에 대응하기 위해 인터페이스의 형태로 관리하면 좋다.
    - 단일쓰레드환경에서 싱글톤
        - 정적 클래스의 형태로 사용하면 된다. (클래스 로딩단계에서 바로 초기화 되도록)
        - 물론 이 경우에서도 테스트를 위한 모의객체를 만들고 혹은 다른 목적으로 사용한다면 멀티쓰레드 환경에서 싱글톤을 사용하듯이 사용하면 된다.