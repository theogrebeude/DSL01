job('lab01') {
    description 'projet NodeJS01'
    scm {
        git('https://github.com/theogrebeude/nodejs-sum.git'){node ->
            node / gitConfigName('theo')
            node / gitConfigEmail('theo@theo.com')        
        }
    }
    triggers{
        scm('H/15 * * * *')
    }
     wrappers {
        nodejs('Nodejs')
    }
    steps{
        shell('npm install')
        shell('npm test')     
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('theogrebeude/lab01')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('87d8f730-2dd3-4457-b1d5-7ea35017fd9d')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
    
}
