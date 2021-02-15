package me.kickscar.practices.jpa.ch03._13.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * me.kickscar.practices.jpa.ch03._13.dto.QCartItemDto is a Querydsl Projection type for CartItemDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QCartItemDto extends ConstructorExpression<CartItemDto> {

    private static final long serialVersionUID = 768231908L;

    public QCartItemDto(com.querydsl.core.types.Expression<Long> bookNo, com.querydsl.core.types.Expression<String> bookTitle, com.querydsl.core.types.Expression<Integer> bookPrice, com.querydsl.core.types.Expression<Integer> amount) {
        super(CartItemDto.class, new Class<?>[]{long.class, String.class, int.class, int.class}, bookNo, bookTitle, bookPrice, amount);
    }

}

