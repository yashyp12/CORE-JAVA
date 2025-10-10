//HIERARCHICAL INHERITACNE MENAS
//MULTIPLE CHILD SUBCLASSES ARE INHERITED FROM SINGLE PARENT CLASS



class MicrosoftOffice {

    String Name;
    double version;
    String licenseStatus;
    String validity;
    boolean oneDrive;

    public MicrosoftOffice(String name, double version, String licenseStatus, String validity, boolean oneDrive) {
        Name = name;
        this.version = version;
        this.licenseStatus = licenseStatus;
        this.validity = validity;
        this.oneDrive = oneDrive;
    }

    public void showOffice() {
        System.out.println("\nMS OFFICE INFO ");
        System.out.println("User Name " + Name);
        System.out.println("version " + version);
        System.out.println("License Status " + licenseStatus);
        System.out.println("License validity " + validity);
        System.out.println("oneDrive " + oneDrive);
    }

    public void DisableAc() {
        this.licenseStatus = "Disabled";
    }
}

class Word extends MicrosoftOffice {
    int wordCountLimit;
    boolean gemini;
    boolean cloudSave;

    public Word(String name, double version, String licenseStatus, String validity, boolean oneDrive,
                int wordCountLimit, boolean gemini, boolean cloudSave) {

        super(name, version, licenseStatus, validity, oneDrive);
        this.wordCountLimit = wordCountLimit;
        this.gemini = gemini;
        this.cloudSave = cloudSave;
    }

    public void getWordInfo() {
        System.out.println("*************************************");
        System.out.println("wordCountLimit  " + wordCountLimit);
        System.out.println("gemini  " + gemini);
        System.out.println("cloudSave  " + cloudSave);
    }
}

class Excel extends MicrosoftOffice {
    int sheets;
    int formulas;
    boolean AiIntegration;


    public Excel(String name, double version, String licenseStatus, String validity, boolean oneDrive,
                 int sheets, int formulas, boolean aiIntegration) {
        super(name, version, licenseStatus, validity, oneDrive);
        this.sheets = sheets;
        this.formulas = formulas;
        AiIntegration = aiIntegration;
    }

    public void showExcel() {
        System.out.println("****************************");
        System.out.println("EXCEL INFO ");
        System.out.println("sheets " + sheets);
        System.out.println("formulas " + formulas);
        System.out.println("AiIntegration " + AiIntegration);
        System.out.println("************************");
    }
}

class PowerPoint extends MicrosoftOffice {
    int slides;
    int templates;
    int animations;

    public PowerPoint(String name, double version, String licenseStatus, String validity, boolean oneDrive,
                      int slides, int templates, int animations) {
        super(name, version, licenseStatus, validity, oneDrive);
        this.slides = slides;
        this.templates = templates;
        this.animations = animations;
    }

    public void getPPT() {
        System.out.println("power point INFO");
        System.out.println("slides " + slides);
        System.out.println("templates " + templates);
        System.out.println("animations " + animations);
    }
}


public class MsofficeDriver {
    public static void main(String[] args) {
//        making an parent class obj
        MicrosoftOffice obj1 = new MicrosoftOffice("Yash YP", 2.43, "ACTIVE", "1 YEAR", true);
        obj1.showOffice();
        Word obj = new Word("Yash YP", 2.43, "ACTIVE", "1 YEAR", true, 2323, true, true);

        obj.getWordInfo();
        System.out.println();
        System.out.println("calling from child class ");
        obj.showOffice();


        Excel obj3 = new Excel("Yash YP", 2.43, "ACTIVE", "1 YEAR", true,
                232, 234, true);

        System.out.println("accesing parent from child exel");
        obj3.showOffice();
        obj3.showExcel();


//                CREATING PPT OBJ
        PowerPoint obj4 = new PowerPoint("Yash YP", 2.43, "ACTIVE", "1 YEAR", true
                , 443, 543, 5323);
        System.out.println("calling parent from ppt");
        System.out.println();
    obj4.showOffice();
    obj4.getPPT();
    }
}
