package Array;

public class StringLinearS {
    public static void linear_Search(String menu[], String item){
        for(int i =0; i<menu.length; i++){
             if(menu[i] == item){
                System.out.println(menu[i]);
                System.out.println(i);
             }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        String menu[] = {"Samosa", "Dosa","Creamroll", "Dew"," coco cola"};
        String item = " Creamroll";
        linear_Search(menu, item);
    }
}
