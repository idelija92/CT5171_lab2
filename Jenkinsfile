pipeline {
    agent any

    stages {
        stage('GetProject') {
            steps {
                git branch:'main', url: 'https://github.com/idelija92/CT5171_lab2.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean:clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compiler:compile'
            }
        }
        stage('Execute') {
            steps {
                sh 'mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8085'
            }
        }
    }
}