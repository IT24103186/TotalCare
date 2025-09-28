package com.group08.totalcare.Entity;

public class User {
    private String NIC;
    private String Name;
    private String Address;
    private String Email;
    private String Phone;
    private String Password;
    private String Role;

    public User(String nic, String name, String address, String email, String phone,String password, String role) {
        this.NIC =nic;
        this.Name = name;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
        this.Password=password;
        this.Role = role;
    }

    public String getNIC() { return NIC; }
    public void setNIC(String nic) { this.NIC = nic; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = name; }

    public String getAddress() { return Address; }
    public void setAddress(String address) { this.Address = address; }

    public String getEmail() { return Email; }
    public void setEmail(String email) { this.Email = email; }

    public String getPhone() { return Phone; }
    public void setPhone(String phone) { this.Phone = phone; }

    public String getPassword() { return Password; }
    public void setPassword(String password) { this.Password = password; }

    public String getRole() { return Role; }
    public void setRole(String role) { this.Role = role; }
}

class Customer extends User {
    public Customer(String nic, String name, String address, String email, String phone, String password) {
        super(nic, name, address, email, phone, password, "Customer");
    }
}

class InsuranceAgent extends User {
    public InsuranceAgent(String nic, String name,  String address, String email, String phone, String password) {
        super(nic, name, address, email, phone, password, "InsuranceAgent");
    }
}

class ClaimsOfficer extends User {
    public ClaimsOfficer(String nic, String name, String address, String email, String phone, String password) {
        super(nic, name, address, email, phone, password, "ClaimsOfficer");
    }
}

class SupportStaff extends User {
    public SupportStaff(String nic, String name, String address, String email, String phone, String password) {
        super(nic, name, address, email, phone, password,"SupportStaff");
    }
}
