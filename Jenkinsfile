#!/usr/bin/env groovy

pipeline {
    agent { label 'demo-slave' }
    tools {
        maven 'm5'
    }
    stages {
        stage('Build') {
           steps {
              echo "Cleaning the maven project"
              sh 'mvn clean'
           }
        }
    }
}
