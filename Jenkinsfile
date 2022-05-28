pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean test package spring-boot:repackage'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Testing..'
                 sh 'env'
            }
        }
        stage('Test') {
            steps {
                echo 'Deploying....'
                 sh 'env'
            }
        }
    }
    post{
        always{
             mail to: '1401734643@qq.com',
                subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                body: "Something is wrong with ${env.BUILD_URL}"
        }
        success
         mail to: '1401734643@qq.com',
                subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                body: "Something is wrong with ${env.BUILD_URL}"{}
        failure{
            mail to: '1401734643@qq.com',
                subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                body: "Something is wrong with ${env.BUILD_URL}"
                 
        }
    }
}
