package com.base.springbase.common.autoconfig.domain;

public class School implements ISchool{

    // Resource
    // @Autowired(required = true) //primary
    Klass class1;

    // @Resource(name = "student100")
    Student student100;

    public Klass getClass1() {
        return class1;
    }

    public void setClass1(Klass class1) {
        this.class1 = class1;
    }

    public Student getStudent100() {

        return student100;
    }

    public void setStudent100(Student student100) {
        this.student100 = student100;
    }

    @Override
    public void ding() {

        System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student100);

    }

}
