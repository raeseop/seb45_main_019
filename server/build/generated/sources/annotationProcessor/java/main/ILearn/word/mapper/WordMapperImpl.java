package ILearn.word.mapper;

import ILearn.word.dto.WordGetDto;
import ILearn.word.entity.Word;
import ILearn.word.entity.WordDescription;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T03:20:38+0900",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 11.0.19 (Azul Systems, Inc.)"
)
@Component
public class WordMapperImpl implements WordMapper {

    @Override
    public WordGetDto entityToResponseDto(Word word) {
        if ( word == null ) {
            return null;
        }

        List<String> wordMeaning = null;
        List<WordDescription> detailDescriptions = null;
        List<String> wordExample = null;
        List<String> wordExampleMeaning = null;
        Long wordId = null;
        String word1 = null;
        String symbol = null;

        List<String> list = word.getWordMeaning();
        if ( list != null ) {
            wordMeaning = new ArrayList<String>( list );
        }
        List<WordDescription> list1 = word.getDetailDescriptions();
        if ( list1 != null ) {
            detailDescriptions = new ArrayList<WordDescription>( list1 );
        }
        List<String> list2 = word.getWordExample();
        if ( list2 != null ) {
            wordExample = new ArrayList<String>( list2 );
        }
        List<String> list3 = word.getWordExampleMeaning();
        if ( list3 != null ) {
            wordExampleMeaning = new ArrayList<String>( list3 );
        }
        wordId = word.getWordId();
        word1 = word.getWord();
        symbol = word.getSymbol();

        WordGetDto wordGetDto = new WordGetDto( wordId, word1, symbol, wordMeaning, detailDescriptions, wordExample, wordExampleMeaning );

        return wordGetDto;
    }
}
