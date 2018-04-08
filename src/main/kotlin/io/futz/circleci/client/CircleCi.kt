package io.futz.circleci.client

import io.futz.circleci.model.Project
import io.futz.circleci.model.BuildDetail
import io.futz.circleci.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CircleCi {

  /**
   * Provides information about the signed in user.
   */
  @GET("me")
  fun me(): Call<User>

  /**
   * List of all the projects you're following on CircleCI, with build information organized by branch.
   */
  @GET("projects")
  fun projects(): Call<Set<Project>>


  /**
   * POST: /project/:vcs-type/:username/:project/follow
   * Follow a new project on CircleCI.
   */

  /**
   * Build summary for each of the last 30 builds for a single git repo.
   */
  @GET("project/{vcsType}/{username}/{project}")
  fun buildsForProject(@Path("vcsType") vcsType: String,
                       @Path("username") username: String,
                       @Path("project") project: String,
                       @Query("limit") limit: Int? = 30,
                       @Query("offset") offset: Int? = 0,
                       @Query("filter") filter: String? = null): Call<Set<BuildDetail>>

  /**
   * Recent builds for a project branch.
   */
  @GET("project/{vcsType}/{username}/{project}/tree/{branch}")
  fun buildsForProjectBranch(@Path("vcsType") vcsType: String,
                             @Path("username") username: String,
                             @Path("project") project: String,
                             @Path("branch") branch: String): Call<Set<BuildDetail>>

  /**
   * Build summary for each of the last 30 recent builds, ordered by build_num.
   */
  @GET("recent-builds")
  fun recentBuilds(@Query("limit") limit: Int? = 30,
                   @Query("offset") offset: Int? = 0): Call<Set<BuildDetail>>

  /**
   * Full details for a single build. The response includes all of the fields from the build summary.
   * This is also the payload for the notification webhooks, in which case this object is the value to a key named ‘payload’.
   */
  @GET("project/{vcsType}/{username}/{project}/{buildNum}")
  fun buildDetails(@Path("vcsType") vcsType: String,
                   @Path("username") username: String,
                   @Path("project") project: String,
                   @Path("buildNum") buildNum: String)

/*
  GET: /project/:vcs-type/:reponame/:project/:build_num/artifacts
  List the artifacts produced by a given build.

  POST: /project/:vcs-type/:username/:project/:build_num/retry
  Retries the build, returns a summary of the new build.

  POST: /project/:vcs-type/:username/:project/:build_num/cancel
  Cancels the build, returns a summary of the build.

  POST: /project/:vcs-type/:username/:project/:build_num/ssh-users
  Adds a user to the build's SSH permissions.

  POST: /project/:vcs-type/:username/:project/:build_num/retry
  Retries the build, returns a summary of the new build.

  POST: /project/:vcs-type/:username/:project/:build_num/cancel
  Cancels the build, returns a summary of the build.

  POST: /project/:vcs-type/:username/:project/:build_num/ssh-users
  Adds a user to the build's SSH permissions.

  POST: /project/:vcs-type/:username/:project/tree/:branch
  Triggers a new build, returns a summary of the build. Optional 1.0 build parameters can be set as well and Optional 2.0 build parameters.

  POST: /project/:vcs-type/:username/:project/ssh-key
  Create an ssh key used to access external systems that require SSH key-based authentication

  GET: /project/:vcs-type/:username/:project/checkout-key
  Lists checkout keys.

  POST: /project/:vcs-type/:username/:project/checkout-key
  Create a new checkout key.

  GET: /project/:vcs-type/:username/:project/checkout-key/:fingerprint
  Get a checkout key.

  DELETE: /project/:vcs-type/:username/:project/checkout-key/:fingerprint
  Delete a checkout key.

  DELETE: /project/:vcs-type/:username/:project/build-cache
  Clears the cache for a project.

  POST: /user/heroku-key
  Adds your Heroku API key to CircleCI, takes apikey as form param name.

*/


}