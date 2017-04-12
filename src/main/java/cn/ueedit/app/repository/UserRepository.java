package cn.ueedit.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import cn.ueedit.app.repository.pojo.User;

/**
 * Created by Frank on 2017/4/12.
 */
@Repository
public interface UserRepository extends CrudRepository< User, Integer > {

    @Query("select u from User u where name=:name")
    User getUserByName(@Param("name") String name);

}
