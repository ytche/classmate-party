package site.bigbear.classmate.party.mapper;


import org.apache.ibatis.annotations.Insert;
import site.bigbear.classmate.party.pojo.BaseEntity;

/**
 * 基础CRUDMapper
 * @author cheyantao
 * @param <T>
 */
public interface BaseMapper<T extends BaseEntity> {
    @Insert    (value = "INSERT INTO")
    int insert(T entity);
}
