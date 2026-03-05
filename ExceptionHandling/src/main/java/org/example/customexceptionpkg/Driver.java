package org.example.customexceptionpkg;

import org.example.customexceptionpkg.exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("john_doe");
        usernames.add("alice_smith");
        usernames.add("rahimi_wahid");
        usernames.add("tech_guru");
        usernames.add("java_master");
        usernames.add("spring_dev");
        usernames.add("cloud_engineer");
        usernames.add("code_ninja");
        usernames.add("data_scientist");
        usernames.add("react_builder");

        try {
            searchUserName(usernames,"react_builder");
        } catch (UserNotFoundException ex) {
            System.out.println("Error happened: "+ ex.getMessage());
        }finally {
            System.out.println("This is the finally block");
        }

    }

    public static boolean searchUserName(ArrayList<String> usernames, String username) throws UserNotFoundException
    {
        boolean found = false;
        for(String un: usernames)
        {
            if(un.equalsIgnoreCase(username))
            {
                found = true;
                return true;
            }
        }
        if(!found)
        {
            throw new UserNotFoundException("User name does not exist in database");
        }
        return false;
    }


}
