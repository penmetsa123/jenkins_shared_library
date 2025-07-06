def call(String repoUrl, String branchName = 'main') {
  echo "Pulling code from ${repoUrl} branch ${branchName}"
  checkout([
    $class: 'GitSCM',
    branches: [[name: branchName]],
    userRemoteConfigs: [[url: repoUrl]]
  ])
}

