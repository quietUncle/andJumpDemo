package qt.libdemo;

import java.io.Serializable;

/**
 * author: liutao
 * date: 2016/7/7.
 */
public class Bean implements Serializable{
   private String name;
    private   String sign;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
