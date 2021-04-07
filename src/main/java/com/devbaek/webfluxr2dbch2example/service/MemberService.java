package com.devbaek.webfluxr2dbch2example.service;

import com.devbaek.webfluxr2dbch2example.domain.Member;
import com.devbaek.webfluxr2dbch2example.repository.MemberRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    Mono<Member> findMemberById(String id) {
        return memberRepository.findById(id);
    }
}
