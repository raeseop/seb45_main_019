package ILearn.chapter.entity;

import ILearn.manage.entity.Manage;
import ILearn.member.entity.Member;
import ILearn.question.entity.Question;
import ILearn.word.entity.Word;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAPTER_ID")
    private Long chapterId;

    @Column(name = "CHAPTER_TITLE")
    private String title;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.REMOVE)
    private List<Question> questions;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.REMOVE)
    private List<Word> words;

    @ManyToOne
    @JoinColumn(name = "manage_Id")
    private Manage manage;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Member member;

}
