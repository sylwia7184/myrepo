pipeline {

  agent any

  tools {

    maven 'Maven 3.8.6' 
    jdk 'jdk21' 

  }

  stages {

    stage('Buildmyapp') {

      steps {

        sh '''

          mvn clean install

        '''

      }

    }


  }

}


