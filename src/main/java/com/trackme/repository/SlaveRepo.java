package com.trackme.repository;

import com.trackme.model.Slave;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by promod on 4/10/2018.
 */
@Repository
public interface SlaveRepo extends CrudRepository<Slave,Integer> {
}
