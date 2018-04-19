job('lab01') {
    description 'projet NodeJS01'
    scm {
        git('https://github.com/theogrebeude/nodejs01.git'){node ->
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
    }
}
