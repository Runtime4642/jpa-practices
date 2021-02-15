package me.kickscar.practices.jpa.ch03._12.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBook is a Querydsl query type for Book
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBook extends EntityPathBase<Book> {

    private static final long serialVersionUID = -2128637959L;

    public static final QBook book = new QBook("book");

    public final ListPath<CartItem, QCartItem> cart = this.<CartItem, QCartItem>createList("cart", CartItem.class, QCartItem.class, PathInits.DIRECT2);

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath title = createString("title");

    public QBook(String variable) {
        super(Book.class, forVariable(variable));
    }

    public QBook(Path<? extends Book> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBook(PathMetadata metadata) {
        super(Book.class, metadata);
    }

}

