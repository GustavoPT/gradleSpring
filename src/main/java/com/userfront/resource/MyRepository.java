package com.userfront.resource;

import com.userfront.models.Card;
import com.userfront.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import com.userfront.models.Card;
import com.userfront.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//@Repository
//public interface MyRepository extends CrudRepository<Object, Long> {

//    @Query("SELECT c FROM Card c WHERE c.code = :cardCode")
//    Card findByCode(@Param("cardCode") int cardCode);
//
//    @Modifying
//    @Query("DELETE FROM Card c WHERE c.code = :cardCode")
//    void deleteByCode(@Param("cardCode") int cardCode);
//
//    @Query("SELECT c.user FROM Card c WHERE c.user.username = :username")
//    User findByUsername(@Param("username") String username);
//
//    @Query("SELECT c.user FROM Card c WHERE c.user.username = :username AND c.user.email = :email")
//    User findByUsernameAndEmail(@Param("username") String username, @Param("email") String email);
//
//    @Query("SELECT c FROM Card c WHERE c.email = :email")
//    User findByEmail(@Param("email") String email);
//}
