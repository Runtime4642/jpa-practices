package me.kickscar.practices.jpa.ch03._08.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * me.kickscar.practices.jpa.ch03._08.dto.QBlogDto is a Querydsl Projection type for BlogDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QBlogDto extends ConstructorExpression<BlogDto> {

    private static final long serialVersionUID = 1670873371L;

    public QBlogDto(com.querydsl.core.types.Expression<Long> no, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> userId) {
        super(BlogDto.class, new Class<?>[]{long.class, String.class, String.class}, no, name, userId);
    }

}

