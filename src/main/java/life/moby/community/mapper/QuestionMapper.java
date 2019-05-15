package life.moby.community.mapper;

import life.moby.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {


    @Insert("insert into question(title, description,creator,tag,gmt_create,gmt_modified) " +
            "values(#{title},#{description},#{creator},#{tag},#{gmtCreate},#{gmtModified})")
    void insert(Question question);

    @Select("select * from question")
    List<Question> list();
}
