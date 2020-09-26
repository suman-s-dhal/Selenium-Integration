pipeline {
  agent { label 'demo-slave' }
  stages {
    stage('Execute Selenium Tests from Github Repo Using Jenkins Pipeline') {
      steps {
        echo 'Execute Tests'
        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
        echo "Jenkins Workspace ${env.WORKSPACE}"
        bat "mvn -f openmrs clean"
        bat "mvn -f openmrs test -P QA"
      }
    } 
  }
}
