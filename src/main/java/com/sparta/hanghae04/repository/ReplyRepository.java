package com.sparta.hanghae04.repository;

import com.sparta.hanghae04.models.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    //    List<Reply> findAllByPostid(Long postId);
    List<Reply> findAllByPostidOrderByCreatedAtDesc(Long postId);
}