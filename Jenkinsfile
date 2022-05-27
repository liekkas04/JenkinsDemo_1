pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean test package spring-boot:repackage'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                 sh 'env'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                 sh 'env'
            }
        }
    }
}
