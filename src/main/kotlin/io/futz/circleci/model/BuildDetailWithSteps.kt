package io.futz.circleci.model

data class BuildDetailWithSteps(val timedout: Boolean,
                                val subject: String,
                                val vcsUrl: String,
                                val body: String,
                                val branch: String,
                                val oss: Boolean,
                                val canceler: String? = null,
                                val lifecycle: String,
                                val allCommitDetails: List<CommitDetails>,
                                val authorDate: String,
                                val authorEmail: String,
                                val buildUrl: String,
                                val picard: Picard,
                                val allCommitDetailsTruncated: Boolean,
                                val sshUsers: List<String>,
                                val queued_at: String,
                                val buildTimeMillis: Int,
                                val circleYml: CircleYml,
                                val isFirstGreenBuild: Boolean,
                                val previousSuccessfulBuild: BuildConcise? = null,
                                val failed: Boolean?,
                                val buildParameters: Map<String, String>? = mapOf(),
                                val infrastructureFail: Boolean,
                                val committer_name: String,
                                val retries: Array<Int>? = null,
                                val startTime: String,
                                val node: String? = null,
                                val canceled: Boolean,
                                val buildNum: Int,
                                val noDependencyCache: Boolean,
                                val sshDisabled: Boolean,
                                val messages: List<String>,
                                val failReason: String? = null,
                                val usageQueuedAt: String,
                                val vcsRevision: String,
                                val status: String,
                                val authorName: String,
                                val compare: String? = null,
                                val retryOf: String? = null,
                                val stopTime: String,
                                val why: String,
                                val committerDate: String,
                                val platform: String,
                                val vcsTag: String? = null,
                                val parallel: Int,
                                val outcome: String,
                                val committerEmail: String,
                                val previous: BuildConcise? = null,
                                val dontBuild: String? = null,
                                val vcsType: String,
                                val reponame: String,
                                val jobName: String? = null,
                                val hasArtifacts: Boolean,
                                val user: User,
                                val username: String,
                                val steps: Set<BuildStep>)