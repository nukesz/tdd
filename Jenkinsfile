pipeline {
  agent any
  stages {
    stage('Initialise') {
      steps {
        echo 'Hell World!'
      }
    }
    stage('Clean') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}'''
      }
    }
  }
}