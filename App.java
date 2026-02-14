public class App {
    // Banner pembuka, silakan manfaatkan variabel ini untuk menampilkan banner di awal dan di akhir program
    private static final String BANNER = "    ____             __                ____                  __ \r\n" + //
                "   / __ )__  _______/ /_  ____ _____  / __ \\__  _____  _____/ /_\r\n" + //
                "  / __  / / / / ___/ __ \\/ __ `/ __ \\/ / / / / / / _ \\/ ___/ __/\r\n" + //
                " / /_/ / /_/ / /  / / / / /_/ / / / / /_/ / /_/ /  __(__  ) /_  \r\n" + //
                "/_____/\\__,_/_/  /_/ /_/\\__,_/_/ /_/\\___\\_\\__,_/\\___/____/\\__/  \r\n" + //
                "                                                                ";
    private static final String STUDENT_NAME = "Muhammad Ridho Anwar";
    private static final String STUDENT_ID = "2506595745";

    public static void main(String[] args) throws Exception {
        System.out.println(BANNER);
        System.out.println("Selamat datang di BurhanQuest!");
        System.out.println("Dibuat oleh: " + STUDENT_NAME + " - " + STUDENT_ID);
        System.out.println("Mari kita mulai dengan membuat sejumlah data quest dan pengembara.");
    }
}