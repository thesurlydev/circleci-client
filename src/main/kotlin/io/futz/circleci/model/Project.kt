package io.futz.circleci.model

data class Project(
    val ircServer: String? = null,
    val sshKeys: Array<String>,
    val branches: Map<String, Branch>,
    val ircKeywork: String? = null,
    val oss: Boolean,
    val slackChannel: String? = null,
    val hipchatNotifyPrefs: Map<String, String>?,
    val reponame: String,
    val dependencies: String = "",
    val aws: Map<String, String?> = mapOf(Pair("keypair", null)),
    val slackWebhookUrl: String? = null,
    val ircChannel: String? = null,
    val parallel: Int,
    val campfireSubdomain: String? = null,
    val slackIntegrationAccessToken: String? = null,
    val username: String,
    val campfireNotifyPrefs: String? = null,
    val slackIntegrationTeam: String? = null,
    val slackIntegrationChannel: String? = null,
    val hipchatNotify: String? = null,
    val herokyDeployUser: String? = null,
    val slackNofifyPrefs: String? = null,
    val scopes: Array<String>,
    val campfireRoom: String? = null,
    val hipchatApiToken: String? = null,
    val campfireToken: String? = null,
    val slackSubdomain: String? = null,
    val hasUsableKey: Boolean,
    val setup: String = "",
    val vscType: String? = null,
    val featureFlags: Map<String, Boolean> = mapOf(),
    val ircPassword: String? = null,
    val compile: String = "",
    val slackIntegrationNotifyPrefs: String? = null,
    val slackIntegrationWebhookUrl: String? = null,
    val ircNotifyPrefs: String? = null,
    val slackIntegrationTeamId: String? = null,
    val language: String? = null,
    val hipchatRoom: String? = null,
    val flowDockApiToken: String? = null,
    val slackChannelOverride: String? = null,
    val vscUrl: String? = null,
    val following: Boolean,
    val defaultBranch: String? = null,
    val slackApiToken: String? = null,
    val test: String = ""
)