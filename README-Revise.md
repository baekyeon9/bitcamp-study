## 3일차(2021-06-30,수)
- 프로그래밍 도구 준비(계속)
	- Java 11 JDK 설치 (Grallvm)
     * JDK? (Java Development Kit) 
        자바 명령어를 Bytecode로 번역하는 개발도구
        JRE + 개발도구 (컴파일러, 프로파일러, 디버거 등)
	  - JAVA_HOME으로 OS 환경 변수 설정
	  - PATH 환경 변수 설정 (PATH에 Grallvm dir 경로 추가)
          * 환경 변수 설정 이유?
            정의 : 운영체제가 참조하는 변수
            for 편의. 컴파일러 실행 시, 경로를 적지 않아도 됨
     
            
- 프로그램 만들고 실행하기(계속)
	- 컴파일 방식과 인터프리터 방식 비교
        * 컴파일 방식?
          명령문(소스파일)을 CPU 기계어로 번역하는 것
          예_ C, C++ 컴파일러 'mingw-w64'
        * 인터프리터 방식?
          명령문(소스파일)을 통역기를 통해 바로 실행
          예_ JavaScript의 인터프리터 Nodejs 
        - 프로그래밍 언어와 컴파일, 컴파일러
	- 자바의 프로그래밍 방식 소개
		* Java : 하이브리드 방식 (컴파일 + 인터프리터)
          명령문(java) → 가상기계어 Bytecode(class) → JVM(인터프리터)
          - 장점 : 컴파일 시, 문법검사 완료, 실행에 유리한 단축형태 명령어 bytecode로 전환
        - 컴파일과 실행
          CMI : $javac -encoding UTF-8(명령문 한글 포함 시) Hello.java
- 자바 애플리케이션 프로젝트 폴더 준비
	- 애플리케이션과 프로젝트의 관계
	- git 저장소에서 프로젝트 관리하기
		- 1단계: 소스파일과 .class 파일을 구분하지 않는다.
		- 2단계: src 폴더와 bin 폴더를 사용하여 소스 파일과 .class 파일을 분리한다.
		- 3단계: Maven 프로젝트 표준 디렉토리 구조
		- 4단계: git 저장소에 여러 개의 프로젝트 두기
- 수업 자료 준비하기

# 4일차(2021-07-01,목 )
- 프로그래밍 도구 준비(계속)
	- Gradle 설치
		- PATH 환경 변수 등록
- 프로젝트 관리
	- 애플리케이션과 프로젝트
	- 루트 프로젝트와 서브 프로젝트
	- 프로젝트와 작업
	- 프로젝트 산출물을 보관하기 위한 디렉토리 구조
	- 팀 프로젝트와 깃 저장소
	- 깃 저장소로 프로젝트를 관리하는 다양한 유형
- 교육 과정 진행 
	- 이론과 실전 프로젝트를 병행하여 학습
	- 실전 프로젝트(study-project)의 로드맵
- 빌드 도구
	- 빌드 도구 개요
	- 다양한 빌드 도구: Ant, Maven, Gradle
	- Gradle 빌드 도구를 이용하여 프로젝트 폴더 준비
		- `gradle init`
	- Gradle 빌드 도구로 생성한 디렉토리의 구조 및 파일 설명
- Gradle 빌드 도구 사용법
	- 빌드 스크립트 파일의 용도
		- settings.gradle : 여러 프로젝트에 공통으로 적용할 설정 정보.
		- app/build.gradle : 서브 프로젝트에만 적용하는 빌드 설정 정보.
	- Gradle 기본 작업
		- init : 현재 폴더를 프로젝트 폴더로 구성
		- wrapper : Gradle 설치 및 실행 파일 생성
		- gradle에 플러그인을 장착하면 더 많은 작업을 수행할 수 있다.
	- 'java' gradle 플러그인  
		- compileJava
			- src/main/java 폴더에 있는 소스 파일을 모두 컴파일
			- build/classes/java/main 폴더에 .class 파일을 둔다.
		- compileTestJava
			- src/test/java 폴더에 있는 소스 파일을 모두 컴파일
			- build/classes/java/test 폴더에 .class 파일을 둔다.
		- processResources
			- src/main/resources 폴더에 있는 파일을 build/resources/main 폴더에 복사한다.
		- processTestResources
			- src/test/resources 폴더에 있는 파일을 build/resources/test 폴더에 복사한다.
		- clean
			- build 폴더를 삭제한다.
		- classes
			- compileJava와 processResources를 모두 수행
		- testClasses
			- classes + compileTestJava + processTestResources 수행
		- check
			- test + 단위 테스트 수행
		- javadoc
			- 소스 파일에서 javadoc 주석을 추출하여 HTML된 API 문서를 생성한다.
		- build
			- check + assemble(배포 파일 생성 작업) 수행
	- 'application' gradle 플러그인  	
		- run
			- 'java' 플러그인의 classes 작업을 먼저 실행한다.
			- 그런 후 application 설정에 지정한 클래스를 실행한다.
		- build
			- 이 플러그인을 장착한 상태에서 build 작업을 수행하면 고객에게 배포할 수 있는 파일을 build/distributions 폴더에 생성한다.
			- 자바 프로그램을 실행시킬 수 있는 스크립트 파일도 자동 생성된다.
	- 정리
		- 1) init 작업을 통해 프로젝트 폴더를 준비한다.
		- 2) build.script에 빌드 작업이 들어 있는 플러그인을 설정한다.		
		- 3) 각 플러그인의 작업을 실행할 때 필요한 정보를 등록한다.
		- 4) 프로젝트에서 사용할 외부 라이브러리 파일을 등록한다.
		- 5) 필요한 작업을 실행하여 애플리케이션을 빌드한다.