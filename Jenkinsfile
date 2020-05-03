pipeline {
    agent {
            docker {
                image 'gradle:jdk14'
                args '-v /root/.gradle:/home/gradle/.gradle -v /var/run/docker.sock:/var/run/docker.sock -v /usr/bin/docker:/usr/bin/docker'
            }
        }
    stages {
        stage('Example') {
            steps {
                script {
                    env.MY_GIT_TAG = sh(returnStdout: true, script: 'git tag -l --points-at HEAD').trim()
                }
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				sh 'printenv'
				//sh 'gradle build'
				sh 'docker'
				sh 'gradle docker --debug'
            }
        }
    }
}