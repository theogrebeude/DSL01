job('Sample PHP Site V1') {
    description 'Site PHP en V1'
    scm {
        git {
            remote {
                    name('origin')
                    url('git@gitlab.com:alexandre.morat/eval-project.git')
                }
                branch('v1')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
}

job('Sample PHP Site V2') {
    description 'Site PHP en V2'
    scm {
        git {
            remote {
                    name('origin')
                    url('git@gitlab.com:alexandre.morat/eval-project.git')
                }
                branch('v2')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
}

job('Sample PHP Site V3') {
    description 'Site PHP en V3'
    scm {
        git {
            remote {
                    name('origin')
                    url('git@gitlab.com:alexandre.morat/eval-project.git')
                }
                branch('v3')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
}
