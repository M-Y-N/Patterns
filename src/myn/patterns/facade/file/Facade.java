package myn.patterns.facade.file;

/**
 * @author Yuriy Senin
 */
public class Facade {
    /**
     * Об'єкти класу File, що представляє реальні файли.
     */
    private File[] files;
    /**
     * Об'єкти класу com.File.java.Directory, що представляє реальні каталоги.
     */
    private Directory[] Directorys;
    /**
     * Шляхи файлу.
     */
    private String[] filePaths;
    /**
     * Шляхи каталогів.
     */
    private String[] dirPaths;


    /**
     * Створює підсистему складається з двох каталогів і трьох файлів.
     */
    public void create() {
        files = new File[6];
        filePaths = new String[files.length];
        Directorys = new Directory[2];
        dirPaths = new String[Directorys.length];
        for (int i = 0; i < filePaths.length; i++) {
            filePaths[i] = "filePath" + i;
        }
        for (int i = 0; i < dirPaths.length; i++) {
            dirPaths[i] = "dirPaths" + i;
        }
        for (int i = 0; i < Directorys.length; i++) {
            Directorys[i] = new Directory();
            Directorys[i].create(dirPaths[i]);
        }
        for (int i = 0; i < files.length; i++) {
            files[i] = new File();
            files[i].open(filePaths[i], true);
        }

        Directorys[1].AddFile(files[0]);
        Directorys[1].AddFile(files[1]);
        Directorys[1].AddFile(files[2]);
        Directorys[0].AddFile(files[3]);

        Directorys[0].AddDirec(Directorys[1]);
        contains(Directorys[0]);
    }

    /**
     * Видаляє створену підсистему.
     */
    public void destroy() {
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                files[i].delete(filePaths[i]);
            }
        }
        if (Directorys != null) {
            for (int i = 0; i < Directorys.length; i++) {
                Directorys[i].rmdir(dirPaths[i]);
            }
        }
    }

    public void contains(Directory directory) {
        System.out.println("Hierarchy :");
        directory.contains(directory);
    }
}
