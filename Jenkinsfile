pipeline {
    agent any

    stages {
		stage ("build") {
        	steps {
            	sh './gradlew clean build'
            }
        }
        stage ("Test") {
            steps {
                sh './gradlew test'
            }
        }
        stage('Sonarqube') {
            steps {
                withSonarQubeEnv('Sonarqube') {
                    sh './gradlew sonarqube -Dsonar.projectKey=ovh.sepradc:testGradle -Dsonar.junit.reportPaths=./build/test-results/test -Dsonar.binaries=./build/classes'
                }
            }
        }
    }
}
