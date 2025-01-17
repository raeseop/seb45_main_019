package ILearn.question.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionGetDto {
    private Long questionId;
    private Long chapterNum;
    private Long wordNum;
    private int questionNum;
    private Long questionType;
    private String question;
    private List<String> examples;
    private String correct;
    private String translation;
}
