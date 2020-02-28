pipeline {
    agent any 
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        
        stage('compile') {
            steps {
                sh 'mvn -clean compile'
            }
        }
        
        stage('test') {
            steps {
                sh 'mvn -test'
            }
        }
        
        
    }
}