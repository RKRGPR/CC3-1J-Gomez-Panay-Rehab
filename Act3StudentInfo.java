package act3studentinfo;
public class Act3StudentInfo {
    public static void main(String[] args) {
        //object gomez
        StudentInfo gomez = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
        gomez.setIdNumber("18-4164-797");
        gomez.setFirstName("Renz Rallion");
        gomez.setLastName("Gomez");
        gomez.setCourse("BSCS");
        gomez.setMajor("Digital Arts and Animation");
        gomez.print();
        //object rehab
        StudentInfo rehab = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
        rehab.setIdNumber("18-5805-517");
        rehab.setFirstName("Ali Hussein");
        rehab.setLastName("Rehab");
        rehab.setCourse("BSIT");
        rehab.setMajor("Network and Security");
        rehab.print();

        //object panay
        StudentInfo panay = new StudentInfo("CITCS", "2nd Term", "S.Y. 2018-2019");
        panay.setIdNumber("18-4930-451");
        panay.setFirstName("Kriezter Rey Fel");
        panay.setLastName("Panay");
        panay.setCourse("BSIT");
        panay.setMajor("Network and Security");
        panay.print();
    }
    
}
