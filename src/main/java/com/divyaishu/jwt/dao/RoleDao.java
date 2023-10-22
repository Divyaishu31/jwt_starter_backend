package com.divyaishu.jwt.dao;

import com.divyaishu.jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> { //Specify here the kind of object on which CRUD operations is required to be performed along with the id typw, here we have String typw of ID



}
