package me.kickscar.practices.jpa.ch03._07.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBlog is a Querydsl query type for Blog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBlog extends EntityPathBase<Blog> {

    private static final long serialVersionUID = 1204870040L;

    public static final QBlog blog = new QBlog("blog");

    public final StringPath name = createString("name");

    public final NumberPath<Long> no = createNumber("no", Long.class);

    public QBlog(String variable) {
        super(Blog.class, forVariable(variable));
    }

    public QBlog(Path<? extends Blog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlog(PathMetadata metadata) {
        super(Blog.class, metadata);
    }

}

