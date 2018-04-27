job('Sample PHP Site V1') {
    description 'Site PHP en V1'
    scm {
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
