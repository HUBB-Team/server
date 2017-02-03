//29.1.17 18:34 v0.1
package com.hubb.manager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TestJSON {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("main")
    @Expose
    private String main;
    @SerializedName("scripts")
    @Expose
    private Scripts scripts;
    @SerializedName("repository")
    @Expose
    private Repository repository;
    @SerializedName("keywords")
    @Expose
    private List<String> keywords = null;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("dependencies")
    @Expose
    private Dependencies dependencies;
    @SerializedName("devDependencies")
    @Expose
    private DevDependencies devDependencies;

//------------------------------------------------------------------------------------    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n********** JSON Details **********\n");
        sb.append("Name=").append(getName()).append("\n");
        sb.append("Version=").append(getVersion()).append("\n");
        sb.append("Description=").append(getDescription()).append("\n");
        sb.append("Main=").append(getMain()).append("\n");
        sb.append("Scripts=").append(getScripts()).append("\n");
        sb.append("Repository=").append(getRepository()).append("\n");
        sb.append("Keywords=").append(getKeywords()).append("\n");
        sb.append("Author=").append(getAuthor()).append("\n");
        sb.append("License=").append(getLicense()).append("\n");
        sb.append("Dependencies=").append(getDependencies()).append("\n");
        sb.append("DevDependencies=").append(getDevDependencies()).append("\n");
        sb.append("***********************************************").append("\n");

        return sb.toString();
    }
//------------------------------------------------------------------------------------  

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Scripts getScripts() {
        return scripts;
    }

    public void setScripts(Scripts scripts) {
        this.scripts = scripts;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Dependencies getDependencies() {
        return dependencies;
    }

    public void setDependencies(Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    public DevDependencies getDevDependencies() {
        return devDependencies;
    }

    public void setDevDependencies(DevDependencies devDependencies) {
        this.devDependencies = devDependencies;
    }

}
