pipeline {
    agent any 
    stages {
        stage('build') {
            steps {
                sh 'mvn -version'
            }
        }
        
        stage('compile') {
            steps {
                sh 'mvn clean'
            }
        }
        
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        
        
    }
}
