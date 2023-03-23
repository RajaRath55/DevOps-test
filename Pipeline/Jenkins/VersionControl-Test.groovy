pipeline {
    agent any

    stages 
    {
        stage('Hello') 
        {
            steps 
            {
                sh 'echo "Hello Rajat" > rajat.txt'
                archiveArtifacts artifacts: '**/*txt', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
            }
        }
    }
}
