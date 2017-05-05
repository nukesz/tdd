pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
    }
    
  }
  stages {
    stage('Clean') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Unit test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Report') {
      steps {
        junit '**/target/surefire-reports/*.xml'
      }
    }
    stage('SonarReport') {
      steps {
        sh 'mvn sonar:sonar -Dsonar.host.url=http://sonarqube:9000'
      }
    }
  }
}