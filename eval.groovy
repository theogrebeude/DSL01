job('Sample PHP Site V1') {
    description 'Site PHP en V1'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://gitlab.com/alexandre.morat/eval-project.git')
                }
                branch('v1')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('theogrebeude/eval01')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('87d8f730-2dd3-4457-b1d5-7ea35017fd9d')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}

job('Sample PHP Site V2') {
    description 'Site PHP en V2'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://gitlab.com/alexandre.morat/eval-project.git')
                }
                branch('v2')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('theogrebeude/eval02')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('87d8f730-2dd3-4457-b1d5-7ea35017fd9d')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }

}

job('Sample PHP Site V3') {
    description 'Site PHP en V3'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://gitlab.com/alexandre.morat/eval-project.git')
                }
                branch('v3')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
    steps {
        dockerBuildAndPublish {
            repositoryName('theogrebeude/eval03')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('87d8f730-2dd3-4457-b1d5-7ea35017fd9d')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}
