package com.whitehedge.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mahesh Chakkarwar on 07-07-2016.
 */
public class Model1 {
    @SerializedName("login")
    public String login;

    @SerializedName("id")
    public Integer id;

    @SerializedName("avatar_url")
    public String avatarUrl;

    @SerializedName("gravatar_id")
    public String gravatarId;

    @SerializedName("url")
    public String url;

    @SerializedName("html_url")
    public String htmlUrl;

    @SerializedName("followers_url")
    public String followersUrl;

    @SerializedName("following_url")
    public String followingUrl;

    @SerializedName("gists_url")
    public String gistsUrl;

    @SerializedName("starred_url")
    public String starredUrl;

    @SerializedName("subscriptions_url")
    public String subscriptionsUrl;

    @SerializedName("organizations_url")
    public String organizationsUrl;

    @SerializedName("repos_url")
    public String reposUrl;

    @SerializedName("events_url")
    public String eventsUrl;

    @SerializedName("received_events_url")
    public String receivedEventsUrl;

    @SerializedName("type")
    public String type;

    @SerializedName("site_admin")
    public Boolean siteAdmin;

    @SerializedName("name")
    public String name;

    @SerializedName("company")
    public String company;

    @SerializedName("blog")
    public String blog;

    @SerializedName("location")
    public Object location;

    @SerializedName("email")
    public Object email;

    @SerializedName("hireable")
    public Object hireable;

    @SerializedName("bio")
    public Object bio;

    @SerializedName("public_repos")
    public Integer publicRepos;

    @SerializedName("public_gists")
    public Integer publicGists;

    @SerializedName("followers")
    public Integer followers;

    @SerializedName("following")
    public Integer following;

    @SerializedName("created_at")
    public String createdAt;

    @SerializedName("updated_at")
    public String updatedAt;


    @Override
    public String toString() {
        return "Model{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", gravatarId='" + gravatarId + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", followersUrl='" + followersUrl + '\'' +
                ", followingUrl='" + followingUrl + '\'' +
                ", gistsUrl='" + gistsUrl + '\'' +
                ", starredUrl='" + starredUrl + '\'' +
                ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
                ", organizationsUrl='" + organizationsUrl + '\'' +
                ", reposUrl='" + reposUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
                ", type='" + type + '\'' +
                ", siteAdmin=" + siteAdmin +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", blog='" + blog + '\'' +
                ", location=" + location +
                ", email=" + email +
                ", hireable=" + hireable +
                ", bio=" + bio +
                ", publicRepos=" + publicRepos +
                ", publicGists=" + publicGists +
                ", followers=" + followers +
                ", following=" + following +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
