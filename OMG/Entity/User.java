package com.omg.OMG.Entity;
import jakarta.persistence.*;

import java.math.BigInteger;


@Entity
@Table(name = "user")


public class User{
        @Id
        @Basic
        private String user_id;
        private String user_name;
        private String user_email;

        private String user_pwd;
        private Long user_phone;
        private String user_addr;

        public User(String User_id,String User_name,String User_email,String User_pwd,Long User_phone,String User_addr){
            this.user_id=User_id;
            this.user_name=User_name;
            this.user_email=User_email;
            this.user_pwd=User_pwd;
            this.user_phone=User_phone;
            this.user_addr=User_addr;
        }

        public User(){}

        public String getUser_id() {

            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getUser_email() {
            return user_email;
        }

        public void setUser_email(String user_email) {
            this.user_email = user_email;
        }

        public String getUser_pwd() {
            return user_pwd;
        }

        public void setUser_pwd(String user_pwd) {

            this.user_pwd = user_pwd;
        }

        public Long getUser_phone() {
            return user_phone;
        }

        public void setUser_phone(Long user_phone) {

            this.user_phone = user_phone;
        }

        public String getUser_addr() {
            return user_addr;
        }

        public void setUser_addr(String user_addr) {
            this.user_addr = user_addr;
        }
}





