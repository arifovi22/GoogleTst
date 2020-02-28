pipeline {
    agent any 
    environment{
        PATH = "C:\\Program Files\\Maven\\apache-maven-3.6.1-bin\\apache-maven-3.6.1\\bin\\.."
    }
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
