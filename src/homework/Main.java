package homework;

import  dip1.model.Report;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        ReportUser report = new ReportUser(user);
        report.report();

        Persister persister = new Persister(user);
        persister.save();
    }
}