job('first-job-dsl') {
        scm {
            git("git://github.com/ylascombe/jenkins-groovy-script.git", 'master')
        }
        steps {
            maven("test -Dproject.name=${project}/${branchName}")
        }
    }
