# SeleniumProject
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/POM/4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org</groupId>
  <artifactId>SeleniumProject</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <dependencies>
      <!-- Selenium Java -->
      <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.31.0</version>
      </dependency>
      <!-- JUnit Jupiter Engine -->
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-engine</artifactId>
          <version>5.12.1</version>
          <scope>test</scope>
      </dependency>
  </dependencies>
</project>

