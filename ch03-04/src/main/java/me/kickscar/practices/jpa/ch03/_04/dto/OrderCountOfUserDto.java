package me.kickscar.practices.jpa.ch03._04.dto;

public class OrderCountOfUserDto {
    private Long userNo;
    private Long orderCount;

    public OrderCountOfUserDto(Long userNo, Long orderCount){
        this.userNo = userNo;
        this.orderCount = orderCount;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public Long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
    }

    @Override
    public String toString() {
        return "UserOrderCountDto{" +
                "userNo=" + userNo +
                ", orderCount=" + orderCount +
                '}';
    }
}
