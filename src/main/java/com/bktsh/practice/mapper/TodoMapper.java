package com.bktsh.practice.mapper;

import com.bktsh.practice.domain.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created on 2017-Feb-16
 * Using MyBatis XML Mapper files
 */
public interface TodoMapper {
    Todo getTodoById(int id);

    List<Todo> getAll();
}
