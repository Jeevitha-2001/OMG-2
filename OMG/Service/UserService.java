package com.omg.OMG.Service;


import com.omg.OMG.Entity.User;
import com.omg.OMG.Repository.UserRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    public User createUser(User user) {
        //    user.setUser_id(userRepo.findMaxid() + 1);
        //   String a = userRepo.findMaxid();

        return userRepo.save(user);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public User insertUser(User user) {
        return userRepo.save(user);
    }

//       public String deleteUser(String id){
//           UserRepo.deleteById(id);
//           return "Record Deleted";
//       }
    @NonNull
    public User updateUser(@NonNull User user) {
        User updateUser = userRepo.findById(user.getUser_id()).orElse(null);
        if (updateUser != null) {
            updateUser.setUser_name(user.getUser_name());
            updateUser.setUser_email(user.getUser_email());
            updateUser.setUser_addr(user.getUser_addr());
            userRepo.save(updateUser);
        }
        else{
            System.out.println("No Data Exists");
        }
        return updateUser;

    }


    public String existsByEmailandPassword(User user){
        if(userRepo.existsByUser_email(user.getUser_email())>0 ){
            if(userRepo.existsByUserPass(user.getUser_email(),user.getUser_pwd()) > 0){

                List<User> user1 =  userRepo.findByUser_email(user.getUser_email());

                System.out.println(user1.toString());

                String[] strArray = user1.toString().split(",");
                return "Logged in successfully";
            }
            return "Incorrect password :(";
        }

        return "Email Id does not exist :( " ;
    }


    }
