package net.wenzuo.codes.designpattern.builder;

/**
 * @author Catch
 * @since 2022-04-08
 */
public class User {

    private String name;
    private Integer minAge;
    private Integer maxAge;

    private User() {
    }

    public static class Builder {

        private User user = new User();

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder minAge(Integer minAge) {
            user.minAge = minAge;
            return this;
        }

        public Builder maxAge(Integer maxAge) {
            user.maxAge = maxAge;
            return this;
        }

        public User build() {
            // 在执行 build() 时，已经完成了 minAge 和 maxAge 的赋值工作
            // 所以这里可以进行比较，使用 setXXX() 则无法判断另一个属性是否已经完成了赋值
            if (user.minAge == null || user.maxAge == null) {
                throw new IllegalArgumentException("最小年龄和最大年龄不能为空");
            }
            if (user.minAge < 0) {
                throw new IllegalArgumentException("最小年龄必须大于等于 0");
            }
            if (user.maxAge < user.minAge) {
                throw new IllegalArgumentException("最大年龄必须大于等于最小年龄");
            }
            return user;
        }

    }

}