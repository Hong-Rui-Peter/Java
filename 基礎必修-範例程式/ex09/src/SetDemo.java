import java.util.*;
public class SetDemo{
  public static void main(String[] args)
  {
    Set<String> hset = new HashSet<>();
    hset.add("�x�_");        //�N�r��`�ȸ�Ʀs�J���X����
    //�N�r��}�C������Ʀs�J���X����
    String[] place = {"�s��", "�x��", "�x�n", "�x�_"};
    for(String p : place)
      hset.add(p);
    String city = "����";
    hset.add(city);         //�N�r���ܼƸ�Ʀs�J���X����
    System.out.println(hset);  //��ܶ��X�����Ҧ��������e
  }
}
