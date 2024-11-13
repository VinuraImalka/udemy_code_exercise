public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <=3; i++){
            StudentRecord pojo = new StudentRecord("313131"+i,
                    switch (i){
                        case 1 -> "st1";
                        case 2 -> "sr2";
                         case 3 -> "st3";
                        default -> "none";
                    },"2000/12/12",
                    "udemy");
            System.out.println(pojo);
        }

        POJO pojo = new POJO("221","vinura","2000/06/27","maths");
        StudentRecord record = new StudentRecord("221","vinura","2000/06/27","maths");
        System.out.println(pojo);
        System.out.println(record);

        System.out.println(record.name());
    }
}