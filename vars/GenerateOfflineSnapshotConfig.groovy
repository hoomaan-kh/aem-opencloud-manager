#!/usr/bin/env groovy
import cloud.aws

def call(script, String sourceAuthorSnapshotId = null , String sourcePublishSnapshotId = null, String sourceStackPrefix = null, String configPath) {
  if ( sourceAuthorSnapshotId || sourcePublishSnapshotId ) {
    GenerateOfflineSnapshotYaml(this, sourceAuthorSnapshotId, sourcePublishSnapshotId, configPath)
  } else if ( sourceStackPrefix ) {
    GenerateOfflineSnapshotYamlStackName(this, sourceStackPrefix, configPath)
  }
}
