#!/usr/bin/env groovy

pipeline {
    agent { label 'demo-slave' }
    tools {
        maven 'm5'
    }
    stages {
        stage('Execute Selenium Tests from Github Repo Using Jenkins Pipeline') {
            steps {
                echo 'Execute Tests'
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
