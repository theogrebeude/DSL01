job('Sample PHP Site V1') {
    description 'Site PHP en V1'
    scm {
        git('https://gitlab.com/alexandre.morat/eval-project.git'){node ->
            node / gitConfigName('theo')
            node / gitConfigEmail('theo@theo.com')        
        }
    }
    triggers{
        scm('H/15 * * * *')
    }  
}
