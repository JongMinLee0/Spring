# Spring

### AOP
#### (Aspect Oriented Programming)

## 용어 설명

 - Aspect : 공통 기능.
 -`Advice` : Aspect의 기능 자체.
 - JointPoint : Advice를 적용해야 되는 부분 (Spring에서는 method만 해당).
 - Pointcut : jointpoint으 부분으로 실제 advice가 적용된 부분.
 - Weaving : advice를 핵심 기능에 적용 하느 행위.
 
### Spring에서 AOP구현 방법 : Proxy 이용
   Client(호출부) -> Proxy(대행) -> Target(핵심기능)

### 1.XML
 - <aop:before> : method 실행 전에 advice 실행.
 - <aop:after-returning> : 정상적으로 method 실행 후에 advice 실행.
 - <aop:after-throwing> : method 실행 중 exception 발생시 advice 실행.
 - <aop:after> : method 실행 중 excption이 발생해도 advice 실행.
 - <aop:around> : method 실행 전/후 및 exception 발생시 advice 실행.

#### Pom.xml에서의 설정

Xml파일에 namespaces 추가 및 config 작성

```xml
<!-- Aop -->
		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjweaver</artifactId>
			<version>1.7.4</version>
		</dependency>

<aop:config>
		<aop:aspect id="logger" ref="logAop">
			<aop:pointcut expression="within(com.aop.ex1.*)" id="publicM"/>
			<aop:around pointcut-ref = "publicM" method="loggerAop"/>
		</aop:aspect>
	</aop:config>
```

### 2.Java (Annotation을 이용한 방법)
 - @Aspect
 - @Pointcut
 - @Around  etc...
 pom.xml설정은 동일하나 xml 파일에서의 설정은 차이가 있다.
 ```xml
<aop:aspectj-autoproxy/>
<bean id="logo" class="com.aop.ex1.LogAop" />
```
`<aop:aspectj-autoproxy/>` -> Annotation 이 붙은 녀석을 proxy로 사용하겠다.
Java 파일에 같이 작성함으로써 xml방식보다 더 편리할 수 있다.

#### AspectJ Pointcut 표현식
 - Execution, within, bean 방법이 있다.(사용할 때 찾아 볼 것)

 
