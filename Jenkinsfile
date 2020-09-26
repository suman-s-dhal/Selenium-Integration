#!/usr/bin/env groovy

#!/usr/bin/env groovy

pipeline {
    agent { label 'demo-slave' }
    tools {
        maven 'm5'
    }
    stages {
        stage('Execute Selenium Tests from Github Repo Using Jenkins 2.0 Pipeline') {
            steps {
                echo 'Execute Tests'
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "Jenkins Workspace ${env.WORKSPACE}"
                sh 'mvn -f openmrs clean'
                sh 'mvn -f openmrs test -P QA'
            }
        } 
        stage('Build') {
           steps {
              echo "Cleaning the maven project"
              sh 'mvn clean'
           }
        }
    }
}
