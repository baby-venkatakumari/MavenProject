node {
    stage('Clone') {
        git 'https://github.com/baby-venkatakumari/MavenProject.git'
    }
    stage('Build') {
        bat "mvn clean compile"
    }
    stage("Test")
    {
        bat "mvn test"
    }
    stage("Post build actions") {
        junit '**/target/surefire-reports/*.xml'
      emailext body: '', subject: 'Scripted Pipeline - $JOB_NAME : $BUILD_NUMBER#', to: 'testingpracticemail@gmail.com'
    }
}
