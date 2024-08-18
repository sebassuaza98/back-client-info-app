package com.banco.clientinfo.model;

public class Client {

        private String documentType;
        private int document;
        private String firstName;
        private String middleName;
        private String lastName;
        private String secondLastName;
        private String phone;
        private String address;
        private String city;
    
        // Getters and Setters
        public String getDocumentType() {
            return documentType;
        }
    
        public void setDocumentType(String documentType) {
            this.documentType = documentType;
        }
    
        public int getDocument() {
            return document;
        }
    
        public void setDocument(int document) {
            this.document = document;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getMiddleName() {
            return middleName;
        }
    
        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getSecondLastName() {
            return secondLastName;
        }
    
        public void setSecondLastName(String secondLastName) {
            this.secondLastName = secondLastName;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getCity() {
            return city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
}
