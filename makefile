run:
	mvnDebug spring-boot:run

comp:
	mvnDebug compile

test:
	mvnDebug test

sonar:
	mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
