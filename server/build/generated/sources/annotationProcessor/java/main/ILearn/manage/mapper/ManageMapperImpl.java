package ILearn.manage.mapper;

import ILearn.chapter.entity.Chapter;
import ILearn.manage.dto.ManageGetDto;
import ILearn.manage.dto.ManageListDto;
import ILearn.manage.entity.Manage;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T03:20:37+0900",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 11.0.19 (Azul Systems, Inc.)"
)
@Component
public class ManageMapperImpl implements ManageMapper {

    @Override
    public ManageGetDto entityToResponseDto(Manage manage) {
        if ( manage == null ) {
            return null;
        }

        ManageGetDto manageGetDto = new ManageGetDto();

        manageGetDto.setChapterList( chapterListToManageListDtoList( manage.getChapterList() ) );

        return manageGetDto;
    }

    @Override
    public ManageListDto toManageListDto(Manage manage) {
        if ( manage == null ) {
            return null;
        }

        ManageListDto manageListDto = new ManageListDto();

        manageListDto.setChapterId( manage.getChapterId() );
        manageListDto.setChapterStatus( manage.isChapterStatus() );
        List<Integer> list = manage.getProgress();
        if ( list != null ) {
            manageListDto.setProgress( new ArrayList<Integer>( list ) );
        }

        return manageListDto;
    }

    @Override
    public List<ManageListDto> toManageListDtoList(List<Manage> manages) {
        if ( manages == null ) {
            return null;
        }

        List<ManageListDto> list = new ArrayList<ManageListDto>( manages.size() );
        for ( Manage manage : manages ) {
            list.add( toManageListDto( manage ) );
        }

        return list;
    }

    protected ManageListDto chapterToManageListDto(Chapter chapter) {
        if ( chapter == null ) {
            return null;
        }

        ManageListDto manageListDto = new ManageListDto();

        manageListDto.setChapterId( chapter.getChapterId() );

        return manageListDto;
    }

    protected List<ManageListDto> chapterListToManageListDtoList(List<Chapter> list) {
        if ( list == null ) {
            return null;
        }

        List<ManageListDto> list1 = new ArrayList<ManageListDto>( list.size() );
        for ( Chapter chapter : list ) {
            list1.add( chapterToManageListDto( chapter ) );
        }

        return list1;
    }
}
