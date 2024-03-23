package com.wsw01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author loriyuhv
 * @date 2024/3/16
 * @description TODO
 */
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof MyDate myDate))
            return false;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int year = this.year - o.year;
        if (year != 0) {
            return year;
        }
        int month = this.month - o.month;
        if (month != 0) {
            return month;
        }

        return this.day - this.month;
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    // 按照name从低到高排序
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}

public class ATest {
    /**
     * 需求1：使Employee实现Comparable接口，并按name排序
     */
    @Test
    public void test1() {
        TreeSet<Employee> employees = new TreeSet<>();

        Employee jerry = new Employee("Jerry", 18, new MyDate(2006, 8, 20));
        Employee jack = new Employee("Jack", 21, new MyDate(2003, 4, 10));
        Employee bool = new Employee("Bool", 21, new MyDate(2003, 3, 30));
        Employee alice = new Employee("Alice", 19, new MyDate(2005, 9, 10));
        Employee edward = new Employee("Edward", 23, new MyDate(2001, 9, 10));


        employees.add(jerry);
        employees.add(jack);
        employees.add(bool);
        employees.add(alice);
        employees.add(edward);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * 问题2：创建TreeSet时传入Comparator对象，按生日日期的先后顺序排序
     */
    @Test
    public void test2() {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 正确的写法1
//                int o1Year = o1.getBirthday().getYear();
//                int o2Year = o2.getBirthday().getYear();
//                int year = o1Year - o2Year;
//                if (year != 0) {
//                    return year;
//                }
//
//                int o1Month = o1.getBirthday().getMonth();
//                int o2Month = o2.getBirthday().getMonth();
//                int month = o1Month - o2Month;
//                if (month != 0) {
//                    return month;
//                }
//
//                int o1Day = o1.getBirthday().getDay();
//                int o2Day = o2.getBirthday().getDay();
//                return o1Day - o2Day;
                // 正确的写法2
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };

        TreeSet<Employee> employees1 = getEmployees(comparator);

        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }

    private static TreeSet<Employee> getEmployees(Comparator<Employee> comparator) {
        TreeSet<Employee> employees1 = new TreeSet<>(comparator);

        Employee jerry = new Employee("Jerry", 18, new MyDate(2007, 8, 20));
        Employee jack = new Employee("Jack", 18, new MyDate(2007, 4, 10));
        Employee bool = new Employee("Bool", 18, new MyDate(2007, 4, 30));
        Employee alice = new Employee("Alice", 20, new MyDate(2005, 9, 10));
        Employee edward = new Employee("Edward", 22, new MyDate(2004, 9, 10));

        employees1.add(jerry);
        employees1.add(jack);
        employees1.add(bool);
        employees1.add(alice);
        employees1.add(edward);
        return employees1;
    }
}
