package com.devbaek.webfluxr2dbch2example.repository;

import com.devbaek.webfluxr2dbch2example.domain.Member;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface MemberRepository extends R2dbcRepository<Member, String> {

}
