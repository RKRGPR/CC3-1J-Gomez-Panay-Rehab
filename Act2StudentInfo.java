package act2studentinfo;
public class Act2StudentInfo {
    public static void main(String[] args) {
        //object gomez
        StudentInfo gomez = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019", "BSCS", "Digital Arts and Animation");
        gomez.setIdNumber("18-4164-797");
        gomez.setFirstName("Renz Rallion");
        gomez.setLastName("Gomez");
        gomez.print();
        //object rehab
        StudentInfo rehab = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019", "BSIT", "Network and Security");
        rehab.setIdNumber("18-5805-517");
        rehab.setFirstName("Ali Hussein");
        rehab.setLastName("Rehab");
        rehab.print();

        //object panay
        StudentInfo panay = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019", "BSIT", "Network and Security");
        panay.setIdNumber("18-4930-451");
        panay.setFirstName("Kriezter Rey Fel");
        panay.setLastName("Panay");
        panay.print();
    }
    
}