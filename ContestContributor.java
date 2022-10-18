package Vecka2;

import Vecka2.Employee;

//Pojo object
public class ContestContributor {
    //properties
    private Employee contributor;
    private double contributorScore;

    //constructors
    public ContestContributor(double contributorscore, Employee TheContributor){
        this.contributorScore = contributorscore;
        this.contributor = TheContributor;
    }

    public ContestContributor(double contributorScore){
        this.contributorScore=contributorScore;
    }
    //methods

    //Setters n getters

    public Employee getContributor() {
        return contributor;
    }

    public void setContributor(Employee contributor) {
        this.contributor = contributor;
    }

    public double getContributorScore() {
        return contributorScore;
    }

    public void setContributorScore(double contributorScore) {
        this.contributorScore = contributorScore;
    }
}
