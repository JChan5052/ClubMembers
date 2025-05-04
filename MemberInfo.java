public class MemberInfo
{
private String name;
private int gradYear;
private boolean hasGoodStanding;
public MemberInfo(String name, int gradYear, boolean hasGoodStanding){
this.name=name;
this.gradYear=gradYear;
this.hasGoodStanding=hasGoodStanding;
}

public String getName(){
return name;
}

public int getGradYear(){
return gradYear;
}

public boolean inGoodStanding(){
return hasGoodStanding;
}

public String toString(){
    String ret=name+" "+gradYear+" "+hasGoodStanding;
    return ret;
}
}