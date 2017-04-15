pipeline {
  agent any
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
        sh 'mvn install'
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
  }
}