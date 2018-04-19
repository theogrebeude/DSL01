job('lab01') {
    description 'projet NodeJS01'
    scm {
        github 'theogrebeude/nodejs01', 'master'
    }
    triggers{
        scm("h/15 * * *")
    }
    steps {
        gradle 'test'
    }
     wrappers {
        nodejs('NodeJS 0.10.26')
    }
    publishers {
        archiveJunit 'build/test-results/**/*.xml'
    }
}
