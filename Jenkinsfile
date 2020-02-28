pipeline {
    agent any 
   
    stages {
        stage('build') {
            steps {
                
                bat 'mvn -version'
            }
        }
        
        stage('compile') {
            steps {
               
                bat 'mvn clean'
            }
        }
        
        stage('test') {
            steps {
                
                bat 'mvn test'
            }
        }
        
        
    }
}
