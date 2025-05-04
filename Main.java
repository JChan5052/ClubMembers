import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
    ArrayList<MemberInfo> list=new ArrayList<MemberInfo>();
    list.add(new MemberInfo("SMITH, JANE", 2019, false));
    list.add(new MemberInfo("FOX, STEVE", 2018, true));
    list.add(new MemberInfo("XIN, MICHEAL", 2017, false));
    list.add(new MemberInfo("GARCIA, MARIA", 2020, true));
    ClubMembers newclub=new ClubMembers(list);
    System.out.println(newclub);
    System.out.println(newclub.removeMembers(2019));
    System.out.println(newclub);
    }
}