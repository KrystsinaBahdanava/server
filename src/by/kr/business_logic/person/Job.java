package by.kr.business_logic.person;

public abstract class Job {
    protected String id;
    protected String jobTitle;
    protected float minSalary; //не забыть записывать флоат в правильном формате: 0.5f, например
    protected float maxSalary;
}
