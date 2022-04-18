pipeline {
    agent any

    environment
    {
        dockerImage = ''
        registry = 'imt2018073/calculator'
    }

    stages
    {        
        stage('Testing the Project')
        {
            steps
            {
                sh '''. /etc/environment
                cd IMT2018073-Calculator/
                mvn clean test'''
            }
        }
        
        stage('Building the Project')
        {
            steps
            {
                sh '''. /etc/environment
                cd IMT2018073-Calculator/
                mvn clean install'''
            }
        }
        
        stage('Building Docker Image')
        {
            steps
            {
                script
                {
                    dockerimage = docker.build registry
                }
            }
        }
        
        stage('Pushing Docker Image')
        {
            steps
            {
                script
                {
                    withDockerRegistry(credentialsId: 'b923ed35-62ad-4912-84db-8f7a3101b1e3', url: 'https://docker.io/imt2018073/calculator/')
                    {
                        dockerimage.push();    
                    }
                }
            }
        }
        
        stage('Deploying on the Nodes')
        {
            steps
            {
                ansiblePlaybook inventory: './hosts', limit: 'ubuntu', playbook: './playbook.yaml'
            }
        }
    }
}
