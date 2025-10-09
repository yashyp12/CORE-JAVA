
class Drive {

    String name;
    String type;
    String fileSystem;
    double totalCapacity;
    double usedSpace;
    double freeSpace;

    public Drive(String name, String type, String fileSystem, double totalCapacity, double usedSpace, double freeSpace) {
        this.name = name;
        this.type = type;
        this.fileSystem = fileSystem;
        this.totalCapacity = totalCapacity;
        this.usedSpace = usedSpace;
        this.freeSpace = freeSpace;
    }

    public void getDrive() {
        System.out.println("DRIVE DETAILS");
        System.out.println("NAME " + name);
        System.out.println("Type  " + type);
        System.out.println("File System " + fileSystem);
        System.out.println("TOTAL CAP " + totalCapacity);
        System.out.println("Used Space " + usedSpace);
        System.out.println("FreeSpace" + freeSpace);

    }
}

class Folder extends Drive {

    String Type;
    String location;
    double Size;
    String Created;

    public Folder(String name, String type, String fileSystem, double totalCapacity, double usedSpace, double freeSpace, String type1, String location, double size, String created) {
        super(name, type, fileSystem, totalCapacity, usedSpace, freeSpace);
        Type = type1;
        this.location = location;
        Size = size;
        Created = created;
    }

    public void getFolder() {
        System.out.println("***************");
        System.out.println("folder DETAILS");
        System.out.println("NAME " + name);
        System.out.println("Type  " + type);
        System.out.println("Location " + location);
        System.out.println("size " + Size + "GB");
        System.out.println("Created " + Created);
        System.out.println("***************");

    }

}

class File extends Folder {

    String FileName;
    String FileType;
    String file_loc;
    String size;

    public File(String name, String type, String fileSystem, double totalCapacity, double usedSpace,
            double freeSpace, String type1, String location, double size, String created,
            String fileType, String file_loc, String size1) {

        super(name, type, fileSystem, totalCapacity, usedSpace, freeSpace, type1, location, size, created);
        FileType = fileType;
        this.file_loc = file_loc;
        this.size = size1;
    }

    public void getFile() {
        System.out.println("****************");
        System.out.println("FILE DETAILS");
        System.out.println("NAME " + FileName);
        System.out.println("File Type " + FileType);
        System.out.println("File location  " + file_loc);
        System.out.println("File Size " + size + "GB");

    }
}

public class ExampleDrive {

    public static void main(String[] args) {

        File obj = new File(
                "Local Disk (C:)",
                "SSD",
                "NTFS",
                512,
                320,
                192,
                "Documents",
                "C:/Users/Bro/Documents",
                12.5,
                "2023-09-12",
                "Text File.txt",
                "C:/Users/Bro/Documents/notes.txt",
                "1.2 MB"
        );

        obj.getFile();
        obj.getFolder();

    }
}
