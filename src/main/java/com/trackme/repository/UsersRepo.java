package com.trackme.repository;

import com.trackme.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by promod on 4/10/2018.
 */
@Repository
public interface UsersRepo extends CrudRepository<User,Integer>{
    @Query(value="SELECT u FROM User u WHERE u.userName=?1")
    public User findUserByUsername(String name);
}
