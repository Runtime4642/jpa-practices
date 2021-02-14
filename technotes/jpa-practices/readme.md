readme

# JPA Practices

## ch01. Entity Mapping

#### [01\. 엔티티 매핑](ch01/01.md)

#### [02\. 다양한 방법](ch01/02.md)

## ch02. Persistence Context(영속성 켄텍스트)

#### [01\. 영속성 켄텍스트(Persistence Context)](ch02/01.md)

#### [02\. 영속성 관리와 엔티티 생명주기](ch02/02.md)

#### [03\. 엔티티 조회, 등록, 수정 그리고 삭제](ch02/03.md)

#### [04\. 준영속성](ch02/04.md)

## ch03. 다양한 연관관계 매핑 및 Repository 작성 방법

#### 01\. 다루는 내용

1.  다양한 연관관계 매핑 모델
2.  JPA 프로그래밍 테크닉
3.  JPQL, QueryDSL 및 Spring Data JPA 기반의 각각의 레포지토리 작성 및 테스트
4.  연관관계와 매핑 설정의 성능 이슈
5.  성능 이슈를 해결할 수 있는 Repository 구현 방법
6.  Repository 최적화 방법과 JPA 프로그래밍에서 고민해야 하는 것

#### [02\. 단일(One) - 방명록](ch03/02.md)

#### [03\. 다대일(ManyToOne) : 단방향(Unidirectional) : 게시판 \[Board -> User\]](ch03/03.md)

#### [04\. 다대일(ManyToOne) : 양방향(Bidirectional) : 온라인북몰 \[Order &lt;-&gt; User\]](ch03/04.md)

#### [05\. 일대다(OneToMany) : 단방향(Unidirectional) : 게시판 \[Board -> Comment\]](ch03/05.md)

#### [06\. 일대다(OneToMany) : 양방향(Bidirectional) : 온라인북몰 \[User &lt;-&gt;Order\]](ch03/06.md)

#### [07\. 일대일(OneToOne) : 단방향(Unidirectional) : 주테이블 외래키 : JBlog \[User -> Blog\]](ch03/07.md)

#### [08\. 일대일(OneToOne) : 양방향(Bidirectional) : 주테이블 외래키 : JBlog \[User &lt;-&gt; Blog\]](ch03/08.md)

#### [09\. 일대일(OneToOne) : 양방향(Bidirectional) : 대상테이블 외래키(식별관계) : JBlog \[User &lt;-&gt; Blog\]](ch03/09.md)

#### [10\. 다대다(ManyToMany) : 단방향(Unidirectional) : 음반검색 \[Song -> Genre\]](ch03/10.md)

#### [11\. 다대다(ManyToMany) : 양방향(Bidirectional) : 음반검색 \[Song &lt;-&gt; Genre\]](ch03/11.md)

#### [12\. 다대다(ManyToMany) : 혼합모델(연결엔티티, 복합키(PK), 식별관계) : @EmbeddedId : 온라인북몰 \[User &lt;-&gt; CartItem -> Book\]](ch03/12.md)

#### [13\. 다대다(ManyToMany) : 혼합모델(연결엔티티, 복합키(PK), 식별관계) : @IdClass :  온라인북몰 \[User &lt;-&gt; CartItem -> Book\]](ch03/13.md)

#### [14\. 다대다(ManyToMany) : 혼합모델(연결엔티티, 새PK, 비식별관계) : 온라인북몰 \[User &lt;-&gt; CartItem -> Book\]](ch03/14.md)
