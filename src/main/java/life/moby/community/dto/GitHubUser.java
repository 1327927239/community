package life.moby.community.dto;

public class GitHubUser {
    private Long id;
    private String name;
    // 描述
    private String dio;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDio(String dio) {
        this.dio = dio;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDio() {
        return dio;
    }
}
