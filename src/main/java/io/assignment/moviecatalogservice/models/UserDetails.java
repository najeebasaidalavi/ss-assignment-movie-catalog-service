package io.assignment.moviecatalogservice.models;


public class UserDetails {

    private Long id;

    private User user;

    private String address;
    private String contactNumber;

    public UserDetails(){}

    public UserDetails(Long id, User user, String address, String contactNumber) {
        this.id = id;
        this.user = user;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
