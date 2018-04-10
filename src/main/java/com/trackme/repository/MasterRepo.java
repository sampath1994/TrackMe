package com.trackme.repository;

import com.trackme.model.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by promod on 4/10/2018.
 */
@Repository
public interface MasterRepo extends CrudRepository<Master,Integer> {

}
