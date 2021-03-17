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
        stage ("SonarQube analysis") {
            steps {
                sh './gradlew sonarqube'
            }
        }
    }
}
