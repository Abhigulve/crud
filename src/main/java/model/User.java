package model;


import java.util.List;

public class User {
    private String username;
    private String userId;
    private Organisation organisation;

    public String getUsername() {
        return username;
    }

    public User(String username, String userId, Organisation organisation, List<Product> subscribeProducts) {
        this.userId = userId;
        this.username = username;
        this.organisation = organisation;
        this.subscribeProducts = subscribeProducts;
    }

    private List<Product> subscribeProducts;

    public List<Product> getSubscribeProducts() {
        return subscribeProducts;
    }

    public String getUserId() {
        return userId;
    }

    public Organisation getOrganisation() {
        return organisation;
    }
}
