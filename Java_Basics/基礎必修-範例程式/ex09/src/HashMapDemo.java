 import java.util.*;
 public class HashMapDemo{
   public static void main(String[] args)
   {
     HashMap<String, String> hmap = new HashMap<>();
     hmap.put("��E�s", "�Юv");
     hmap.put("�i�T��", "���v");
     hmap.put("���|��", "ĵ��");
     hmap.put("�P����", "�Юv");
     System.out.println("���X���e�G" + hmap);
    System.out.println("hmap���X�������ӼơG" + hmap.size());
     System.out.println();

     System.out.println("\"��E�s\" ���ƥ[�J....");
     if (hmap.containsKey("��E�s"))
       System.out.println("\"��E�s\" �w�s�b�A���ƥ[�J��¾�~���Ʒ|�Q�л\");
     hmap.put("��E�s", "�x�H");
     System.out.println("\"��E�s\" ��¾�~��אּ�G" + hmap.get("��E�s"));
 
     System.out.println("\n�[�J\"�䤭��\" ....");
     String name = "�䤭��";
     if (hmap.containsKey(name))
       System.out.println("\"" + name +"\" �w�s�b�A���������");
     else
       hmap.put(name, "�߮v");
 
     System.out.println("����\"�P����\" ....");
     hmap.remove("�P����");

     System.out.println("\n���X���e�G" + hmap);
   }
 }
