package me.kickscar.practices.jpa.ch03._10.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGenre is a Querydsl query type for Genre
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGenre extends EntityPathBase<Genre> {

    private static final long serialVersionUID = -547830987L;

    public static final QGenre genre = new QGenre("genre");

    public final StringPath abbrName = createString("abbrName");

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public QGenre(String variable) {
        super(Genre.class, forVariable(variable));
    }

    public QGenre(Path<? extends Genre> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGenre(PathMetadata metadata) {
        super(Genre.class, metadata);
    }

}

