public class Main {
    public static void main(String[] args) {
        // test 1
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));
        
        // test 2
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);
        
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}
