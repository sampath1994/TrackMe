package com.trackme.repository;

import com.trackme.model.location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by promod on 4/10/2018.
 */
@Repository
public interface LocationRepo extends CrudRepository<location,Integer>{
}
