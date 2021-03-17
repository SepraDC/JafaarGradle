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
    }
}
