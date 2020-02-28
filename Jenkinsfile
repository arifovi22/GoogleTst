pipeline {
    agent any 
    stages {
        stage('build') {
            steps {
                tool name: 'maven', type: 'maven'
                sh 'mvn -version'
            }
        }
        
        stage('compile') {
            steps {
                tool name: 'maven', type: 'maven'
                sh 'mvn clean'
            }
        }
        
        stage('test') {
            steps {
                tool name: 'maven', type: 'maven'
                sh 'mvn test'
            }
        }
        
        
    }
}
