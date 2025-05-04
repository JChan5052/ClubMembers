import java.util.ArrayList;
public class ClubMembers
{
private ArrayList<MemberInfo> memberList;

public ClubMembers(ArrayList<MemberInfo> inc){
    memberList=inc;
}
public void addMembers(String[] names, int gradYear){

}

public ArrayList<MemberInfo> removeMembers(int year){
ArrayList<MemberInfo> ret=new ArrayList<MemberInfo>();
for (int i=0;i<memberList.size();i++){
    if ((memberList.get(i)).getGradYear()<year){
        if (memberList.get(i).inGoodStanding()==true){
        ret.add(memberList.get(i));
        }
        memberList.remove(i);
        i--;
    }
}
return ret;
}

public String toString(){
String ret="";
    for (MemberInfo i: memberList){
    ret+=i;
    ret+="\n";
    }
    return ret;
}
}