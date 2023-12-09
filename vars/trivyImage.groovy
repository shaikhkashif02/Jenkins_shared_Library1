def call() {
    sh 'trivy image kashif/youtube:latest > trivyimage.txt'
}
