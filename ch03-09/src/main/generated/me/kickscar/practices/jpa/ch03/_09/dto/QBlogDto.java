package me.kickscar.practices.jpa.ch03._09.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * me.kickscar.practices.jpa.ch03._09.dto.QBlogDto is a Querydsl Projection type for BlogDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QBlogDto extends ConstructorExpression<BlogDto> {

    private static final long serialVersionUID = 1377470364L;

    public QBlogDto(com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> userId, com.querydsl.core.types.Expression<String> userName) {
        super(BlogDto.class, new Class<?>[]{String.class, String.class, String.class}, name, userId, userName);
    }

}

