package com.ll.exam.sb_security_jwt.app.article.entity;

import com.ll.exam.sb_security_jwt.app.base.entity.BaseEntity;
import com.ll.exam.sb_security_jwt.app.member.entity.Member;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
    @ManyToOne
    private Member author;
    private String subject;
    private String content;

    public Article(long id) {
        super(id);
    }
}
