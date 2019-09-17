package com.gjxx.springbootdemo.enumeration;

/**
 * @Description 性别枚举
 * @Author Sxs
 * @Date 2019/9/17 17:52
 * @Version 1.0
 */
public enum SexEnum {
    // 男
    MALE(1, "男"),

    // 女
    FEMALE(2, "女");

    private int id;
    private String name;

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getEnumById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
