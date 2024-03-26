package com.virginonline.docshare.domain.repository;

import com.virginonline.docshare.domain.entity.user.User;
import java.util.UUID;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepository extends R2dbcRepository<User, UUID> {

}
