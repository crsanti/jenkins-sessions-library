def call() {
  node {
    sh '''
    git version
    docker version
    node --version
    npm version
    '''
  }
}
