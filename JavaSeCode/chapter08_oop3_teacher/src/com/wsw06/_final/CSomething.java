package com.wsw06._final;

import java.util.Objects;

/**
 * @author loriyuhv
 * @date 2024/3/17
 * @description TODO
 */

public class CSomething {
    public static void main(String[] args) {
        Other o = new Other();
        System.out.println(o.i);
        new CSomething().addOne(o);
        System.out.println(o.i);
    }
    public void addOne(final Other o) {
        //o = new Other();
        o.i++;
    }
}
class Other {
    public int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Other other)) return false;
        return i == other.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
