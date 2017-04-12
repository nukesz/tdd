pipeline {
  agent none
  stages {
    stage('Initialise') {
      steps {
        echo 'Hell World!'
      }
    }
    stage('Clean') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
  }
}