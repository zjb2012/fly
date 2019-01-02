def call(String module, String mvnPhase) {
    dir("${WORKSPACE}/${module}") {
      sh "mvn ${mvnPhase}"
}

}
