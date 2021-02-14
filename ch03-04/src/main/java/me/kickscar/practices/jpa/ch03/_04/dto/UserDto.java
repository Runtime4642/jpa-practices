package me.kickscar.practices.jpa.ch03._04.dto;

public class UserDto {
    private Long no;
    private String name;

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
