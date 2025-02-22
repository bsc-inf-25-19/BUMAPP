package com.esper.BUMAPP.user;

import javax.persistence.*;


    @Entity
    @Table(name="user_profile")
    public class UserProfile {

        private long id;
        private String username;
        private String email;
        private String firstName;
        private String lastName;

        public UserProfile() {}

        public UserProfile(long id, String username, String email, String firstName, String lastName) {
            super();
            this.id = id;
            this.username = username;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }
